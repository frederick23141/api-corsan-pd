/**
 * Clase que permite configurar los repositorios JPA para la base de datos de sql (sql server)
 * Se habilita el manejo de transacciones
 * Se define el bean para configurar el entityManager (ORM)
 * Se define un bean para configurar el dataSource (conexión a la base de datos)
 * Se define un bean para configurar el transacionManager (manejo de transacciones)
 *
 * @author jplondon
 * @version 08/11/2023
 */
package co.com.corsan.sqlserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = co.com.corsan.sqlserver.config.Constantes.SQL_PACKAGES + ".repository",
        entityManagerFactoryRef = "getSqlEntityManager",
        transactionManagerRef = "getSqlTransactionManager"
)
public class SqlConfiguration extends DatabaseConfiguration {

    @Value("${sqlserver.hibernate.show_sql}")
    private String showSql;
    @Value("${sqlserver.hibernate.hbm2ddl.auto}")
    private String hbm2ddl;
    @Value("${sqlserver.dialect}")
    private String dialect;
    @Value("${sqlserver.driverClassName}")
    private String driverClassName;
    @Value("${sqlserver.url}")
    private String jdbcUrl;
    @Value("${sqlserver.user}")
    private String jdbcUser;
    @Value("${sqlserver.pass}")
    private String jdbcPass;

    @Bean
    public LocalContainerEntityManagerFactoryBean getSqlEntityManager() {
        return super.getEntityManager(showSql, hbm2ddl, dialect, new String[]{co.com.corsan.sqlserver.config.Constantes.SQL_PACKAGES},
                getSqlDataSource());
    }

    @Bean
    public DataSource getSqlDataSource() {
        return super.getDataSource(driverClassName, jdbcUrl, jdbcUser, jdbcPass);
    }

    @Bean
    public PlatformTransactionManager getSqlTransactionManager() {
        return super.getTransactionManager(getSqlEntityManager());
    }

}
