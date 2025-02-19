package co.com.corsan.domain.enums;

public enum CorsanEnumMensajes {
    ACTUALIZAREXITO("Registro actualizado con éxito"),
    REGISTROYAEXISTE("El datos ya se encuentra registrado"),
    GUARDAREXITO("Registro guardado con éxito"),
    GUARDARERROR("Error al guardar el registro"),
    ELIMINAREXITO("Registro eliminado con éxito"),
    ELIMINARERROR("Error al eliminar el registro"),
    CONSULTARVACIO("No se han encontrado registros"),
    OPERACIONEXITOSA("Operación exitosa");

    private final String descripcionError;

    CorsanEnumMensajes(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return this.descripcionError;
    }
}
