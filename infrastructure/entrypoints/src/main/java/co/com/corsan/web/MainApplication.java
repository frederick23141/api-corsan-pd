package co.com.corsan.web;

import io.github.cdimascio.dotenv.Dotenv;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@EnableAspectJAutoProxy
@ComponentScan(basePackages = MainApplication.MAIN_CORSAN)
@EnableTransactionManagement
@SpringBootApplication
@OpenAPIDefinition
@EnableScheduling
public class MainApplication {
    public static final String MAIN_CORSAN = "co.com.corsan";

    public static void main(String[] args) {

        // Cargar variables de entorno desde el archivo .env
        Dotenv dotenv = Dotenv.configure()
                .filename("Variables de entorno api-corsan-pd.env")
                //.directory("C:\\Users\\juan.londoño\\IdeaProjects\\api-corsan-pd\\infrastructure\\entrypoints\\src\\main\\resources\\Variables de entorno api-corsan-pd.env")
                .load();

        updateYamlFile(dotenv);
        updateYmlFile(dotenv);

        SpringApplication.run(MainApplication.class, args);
    }

    private static void updateYamlFile(Dotenv dotenv) {

        String port = dotenv.get("PORT");
        String host = dotenv.get("HOST_SERVER_API");
        String contextPath = dotenv.get("CONTEXT_PATH");

        // Ruta del archivo YAML existente
        String yamlFilePath = "application.yaml";

        // Crear un mapa para almacenar las propiedades actualizadas
        Map<String, Object> yamlData = new HashMap<>();
        yamlData.put("server.port", port);
        yamlData.put("server.address", host);
        yamlData.put("server.servlet.context-path", contextPath);

        // Crear un objeto Yaml
        Yaml yaml = new Yaml();

        try (FileWriter writer = new FileWriter(yamlFilePath)) {
            yaml.dump(yamlData, writer);
            System.out.println("Se han actualizado los datos en el archivo YAML correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo YAML: " + e.getMessage());
        }
    }

    private static void updateYmlFile(Dotenv dotenv) {

        String defaultSchema = dotenv.get("SQLSERVER_DEFAULT_SCHEMA");
        String sqlserverHostDb = dotenv.get("SQLSERVER_HOST_DB");
        String sqlserverPortDb = dotenv.get("SQLSERVER_PORT_DB");
        String sqlserverDb = dotenv.get("SQLSERVER_DB");
        String sqlserverUserDb = dotenv.get("SQLSERVER_USER_DB");
        String sqlserverPassDb = dotenv.get("SQLSERVER_PASS_DB");
        String sqlserverUrl = dotenv.get("SQLSERVER_URL");

        // Ruta del archivo YAML existente
        String yamlFilePath = "application.yml";

        // Crear un mapa para almacenar las propiedades actualizadas
        Map<String, Object> yamlData = new HashMap<>();
        yamlData.put("sqlserver.default_schema", defaultSchema);
        yamlData.put("sqlserver.url", sqlserverUrl);
        yamlData.put("sqlserver.user", sqlserverUserDb);
        yamlData.put("sqlserver.pass", sqlserverPassDb);

        // Crear un objeto Yaml
        Yaml yaml = new Yaml();

        try (FileWriter writer = new FileWriter(yamlFilePath)) {
            yaml.dump(yamlData, writer);
            System.out.println("Se han actualizado los datos en el archivo YML correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo YAML: " + e.getMessage());
        }
    }
}
