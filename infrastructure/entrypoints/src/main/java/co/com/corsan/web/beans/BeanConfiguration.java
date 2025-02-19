package co.com.corsan.web.beans;

import co.com.corsan.domain.repositories.*;
import co.com.corsan.usecases.adapters.*;
import co.com.corsan.usecases.ports.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class BeanConfiguration {

    @Bean
    public DocumentosPort documentosPort(DocumentosRepository documentosRepository, Environment env) {
        return new DocumentosAdapter(documentosRepository, env);
    }

    @Bean
    public BexPort bexPort(BexRepository bexRepository) {
        return new BexAdapter(bexRepository);
    }

    @Bean
    public CarteraDetallePort carteraDetallePort(CarteraDetalleRepository carteraDetalleRepository) {
        return new CarteraDetalleAdapter(carteraDetalleRepository);
    }

    @Bean
    public ProductosPort productosPort(ProductosRepository productosRepository) {
        return new ProductosAdapter(productosRepository);
    }

    @Bean
    public RegionesPort regionesPort(RegionesRepository regionesRepository) {
        return new RegionesAdapter(regionesRepository);
    }

    @Bean
    public VendedoresPort vendedoresPort(VendedoresRepository vendedoresRepository) {
        return new VendedoresAdapter(vendedoresRepository);
    }

    @Bean
    public ClientesPort clientesPort(ClientesRepository clientesRepository) {
        return new ClientesAdapter(clientesRepository);
    }

    @Bean
    public UsuarioPort usuarioPort(UsuarioRepository usuarioRepository) {
        return new UsuarioAdapter(usuarioRepository);
    }

    @Bean
    public VentasPort ventasPort(VentasRepository ventasRepository) {
        return new VentasAdapter(ventasRepository);
    }

    @Bean
    public AnaliticaPort analiticaPort(AnaliticaRepository analiticaRepository) {
        return new AnaliticaAdapter(analiticaRepository);
    }

    @Bean
    public Dotenv dotenv() {
        return Dotenv.configure().ignoreIfMissing().load();
    }


}
