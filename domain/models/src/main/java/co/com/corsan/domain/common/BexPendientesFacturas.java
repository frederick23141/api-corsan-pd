package co.com.corsan.domain.common;

import co.com.corsan.domain.common.embeddedPK.BexPendientesFacturaDTOPK;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BexPendientesFacturas {

    private BexPendientesFacturaDTOPK id;
    //private Long numero;
    private Integer bodega;
    private Long vendedor;
    private String region;
    private String ciudad;
    private String canal;
    private Long nitReal;
    private Long nit;
    private String nombres;
    private LocalDateTime fecha;
    private String ordenCompra;
    private Long plu;
    //private String codigo;
    private String descripcion;
    private BigDecimal cantidadPedido;
    private BigDecimal cantidadDespachada;
    private BigDecimal valorUnitario;
    private BigDecimal pendiente;
    private BigDecimal kilosPendiente;
    private BigDecimal vrBruto;
    private BigDecimal vrIva;
    private BigDecimal valorTotal;
    private String autorizacion;
    private String tipoDocFact;
    private Long nroFact;
    private BigDecimal cantFact;
    private BigDecimal vrUnitFact;
    private BigDecimal vrTotFact;
}
