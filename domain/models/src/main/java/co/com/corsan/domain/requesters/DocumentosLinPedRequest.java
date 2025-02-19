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
public class DocumentosLinPedRequest {

    @JsonIgnore
    private Long id;

    @NotNull(message = "El campo sw no puede ser null")
    private Integer sw;
    @NotNull(message = "El campo numero no puede ser null")
    private Long numero;
    @NotNull(message = "El campo codigo no puede ser null")
    private String codigo;
    @NotNull(message = "El campo seq no puede ser null")
    private Integer seq;

    @NotNull(message = "El campo bodega no puede ser null")
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
