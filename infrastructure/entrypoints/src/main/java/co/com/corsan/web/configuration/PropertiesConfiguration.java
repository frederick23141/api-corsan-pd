package co.com.corsan.web.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:mensajes.properties", ignoreResourceNotFound = true),
        @PropertySource(value = "classpath:variables-globales.properties", ignoreResourceNotFound = true)
})
public class PropertiesConfiguration {
}
