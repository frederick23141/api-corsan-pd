package co.com.corsan.domain.presenters;

public final class GeneralResponse<T> {
    private String codigo;
    private String tipoMensaje;
    private String mensaje;
    private T respuesta;

    public GeneralResponse(final String codigo, final String tipoMensaje, final String mensaje, final T respuesta) {
        this.codigo = codigo;
        this.tipoMensaje = tipoMensaje;
        this.mensaje = mensaje;
        this.respuesta = respuesta;
    }

    public GeneralResponse() {

    }

    public static <T> GeneralResponse.GeneralResponseBuilder<T> builder() {
        return new GeneralResponse.GeneralResponseBuilder();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    public String getTipoMensaje() {
        return this.tipoMensaje;
    }

    public void setTipoMensaje(final String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(final String mensaje) {
        this.mensaje = mensaje;
    }

    public T getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(final T respuesta) {
        this.respuesta = respuesta;
    }

    public static class GeneralResponseBuilder<T> {
        private String codigo;
        private String tipoMensaje;
        private String mensaje;
        private T respuesta;

        GeneralResponseBuilder() {
        }

        public GeneralResponse.GeneralResponseBuilder<T> codigo(final String codigo) {
            this.codigo = codigo;
            return this;
        }

        public GeneralResponse.GeneralResponseBuilder<T> tipoMensaje(final String tipoMensaje) {
            this.tipoMensaje = tipoMensaje;
            return this;
        }

        public GeneralResponse.GeneralResponseBuilder<T> mensaje(final String mensaje) {
            this.mensaje = mensaje;
            return this;
        }

        public GeneralResponse.GeneralResponseBuilder<T> respuesta(final T respuesta) {
            this.respuesta = respuesta;
            return this;
        }

        public GeneralResponse<T> build() {
            return new GeneralResponse(this.codigo, this.tipoMensaje, this.mensaje, this.respuesta);
        }

        public String toString() {
            return "GeneralResponse.GeneralResponseBuilder(codigo=" + this.codigo + ", tipoMensaje=" + this.tipoMensaje + ", mensaje=" + this.mensaje + ", respuesta=" + this.respuesta + ")";
        }

    }
}
