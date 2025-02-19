package co.com.corsan.domain.presenters;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentosLinPedResponse {

    private Long id;

    private Integer sw;
    private Long numero;
    private String codigo;
    private Integer seq;

    private Integer bodega;
    private BigDecimal cantidad;
    private BigDecimal cantidadDespachada;
    private BigDecimal valorUnitario;
    private BigDecimal porcentajeIva;
    private BigDecimal porcentajeDescuento;
    private String und;
    private BigDecimal cantidadUnd;
    private String adicional;
    private BigDecimal despachoVirtual;
    private BigDecimal porcDcto2;
    private BigDecimal porcDcto3;
    private Double cantidadOp;
    private Integer Consignacion;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "America/Bogota")
    private LocalDateTime fecCompromiso;
    private Integer producido;
    private Integer calidad;
    private BigDecimal valorUnitarioConfirmado;
    private String notaProd;
    private Double cantidadConfirmada;
    private String colorInterno;
    private String colorExterno;
    private String modelo;
    private Integer ano;
    private Long idAdmonPedCot;
    private String descripcionItemAdicional;
}
