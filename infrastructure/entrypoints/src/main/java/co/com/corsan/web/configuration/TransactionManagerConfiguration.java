/**
 * Clase que permite configurar el manejo de transacciones para una o más bases de datos
 * Orquesta la creación de transacciones, commits y rollback entre oracle y postgreSQL
 *
 * @Author jplondon
 * @create 08/11/2023
 */
package co.com.corsan.web.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TransactionManagerConfiguration {

    @Bean(name = "controlTransactionManager")
    public ChainedTransactionManager transactionManager(
            @Qualifier("getSqlTransactionManager") PlatformTransactionManager sqlTransactionManager) {
        return new ChainedTransactionManager(sqlTransactionManager);
    }
}
