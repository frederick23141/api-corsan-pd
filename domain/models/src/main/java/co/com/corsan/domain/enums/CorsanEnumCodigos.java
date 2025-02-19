package co.com.corsan.domain.enums;

public enum CorsanEnumCodigos {
    OK("OK"),
    ERROR("ERROR"),
    DETIENE("DETIENE"),
    ALERTA("ALERTA");

    private final String descripcionError;

    CorsanEnumCodigos(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return this.descripcionError;
    }
}
