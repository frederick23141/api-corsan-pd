package co.com.corsan.usecases.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class ServiceCheckerTask {

    @Autowired
    private Environment environment;

    // Método para verificar el servicio cada 5 minutos
    @Scheduled(fixedRate = 300000) // 300000 ms = 5 minutos
    public void checkService() {
        String url = "http://" +
                environment.getProperty("server.address") +
                ":" +
                environment.getProperty("server.port") +
                environment.getProperty("server.servlet.context-path") +
                "/servicio/verificar-servicio-disponible";
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_FORBIDDEN) {
                System.out.println("El servicio está en línea.");
            } else {
                System.out.println("¡Alerta! El servicio no está respondiendo correctamente. Se deben tomar medidas.");
                //ejecutarArchivoBat();
            }
        } catch (IOException e) {
            System.out.println("¡Alerta! Error al conectar con el servicio. Se deben tomar medidas.");
            //ejecutarArchivoBat();
        }
    }

    // Método para ejecutar el archivo .bat
    private void ejecutarArchivoBat() {
        try {

            File ps1File = copiarArchivoDesdeResources("ActivarLocalTunnel.ps1");

            // Ejecutar el archivo .ps1 con PowerShell y pasar el puerto como argumento
            if (ps1File.exists()) {
                ProcessBuilder processBuilder = new ProcessBuilder(
                        "powershell.exe",
                        "-ExecutionPolicy", "Bypass",
                        "-File", ps1File.getAbsolutePath()
                );
                processBuilder.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para copiar un archivo desde los recursos a un directorio temporal
    private File copiarArchivoDesdeResources(String resourceName) throws IOException {
        InputStream resourceStream = getClass().getClassLoader().getResourceAsStream(resourceName);
        if (resourceStream == null) {
            throw new IOException("Recurso no encontrado: " + resourceName);
        }

        Path tempFile = Files.createTempFile(null, resourceName);
        try (FileOutputStream outStream = new FileOutputStream(tempFile.toFile())) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = resourceStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }
        }

        return tempFile.toFile();
    }
}
