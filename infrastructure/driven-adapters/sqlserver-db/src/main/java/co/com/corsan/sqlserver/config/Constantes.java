/**
 * Clase que permite definir la ubicación de los repositorios JPA para la base de datos de sql (sql server)
 * Se aplica lógica de separación de orígenes de datos por paquetes
 *
 * @author jplondon
 * @version 08/11/2023
 */
package co.com.corsan.sqlserver.config;

public class Constantes {

    public static final String MAIN_PACKAGES = "co.com.corsan";
    public static final String SQL_PACKAGES = MAIN_PACKAGES + ".sqlserver";

    private Constantes() {
        throw new IllegalStateException("Utility class");
    }

}
