package co.com.corsan.domain.requesters;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentosPedRequest {

    @JsonIgnore
    private Long id;
    @NotNull(message = "El campo bodega no puede ser null")
    private Integer bodega;
    @JsonIgnore
    private Long numero;

    @NotNull(message = "El campo sw no puede ser null")
    private Integer sw;
    private Long nit;
    private Long vendedor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fecha;
    private String condicion;
    private Integer diasValidez;
    private BigDecimal descuentoPie;
    private BigDecimal valorTotal;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fechaHora;
    @NotNull(message = "El campo anulado no puede ser null")
    private Integer anulado;
    private String notas;
    private String usuario;
    private String pc;
    private Integer duracion;
    private Integer concepto;
    private String moneda;
    private String despacho;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fechaHoraEntrega;
    private Long nitDestino;
    private Integer codigoDireccion;
    private BigDecimal abono;
    private Long telefono;
    private String emergencia;

    private String documento;
    private String autorizacion;
    private String autorizTexto;
    private Long nit2;
    private String mrp;
    private String notas5;
    private String listaPrecios;
    private BigDecimal fletes;
    private BigDecimal ivaFletes;
    private String ordenEnv;
    private String notasAut;
    private BigDecimal descuentoDesIva;
    private Integer codDireccionDest;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fechaIngreso;
    private String notaVta;
    private String usuarioAut;
    private String notaCompro;
    private Integer prg;
    private String multiplesOC;
    private String tipoOrden;
    private String usuarioAutorizo;
    private Long idTablaAmortizacion;
    private Integer pedidoMovil;
    private String moduloCreacion;
    private String notaProd;
    private String nota1;
    private String nota2;
    private String problema;
    private Integer perf;
    private Long idTallEncabezaOrden;
    private Long idMovil;
    private String codigoClasificacion;
    private String contacto;
    private String tipoCompra;
    private String modeloCompra;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fechaEntrega;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fechaEntregaMax;
    private Long idUsuarioFinal;
    private Long centroCostos;
    private String utilizacion;
    private String destinatario;
    private Long idTiempoGarantia;
    private Long numItems;
    private BigDecimal valorTotalInicial;
    private String corOrdenCompra;
    private BigDecimal debitoNiif;
    private BigDecimal creditoNiif;
    private String lugarEntrega;
    private String certificadoCalidad;
}
