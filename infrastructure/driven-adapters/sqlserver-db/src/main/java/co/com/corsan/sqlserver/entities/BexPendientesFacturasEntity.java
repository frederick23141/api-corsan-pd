package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.BexPendientesFacturaPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
//@Builder
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_BEX_Pendientes_Factura")
public class BexPendientesFacturasEntity {

    @EmbeddedId
    private BexPendientesFacturaPK id;

    @Column(name = "codemp")
    private String codeMp;
    @Column(name = "tipoped")
    private String tipoPed;
    @Column(name = "bodega")
    private Integer bodega;
    @Column(name = "vendedor")
    private Long vendedor;
    @Column(name = "Region")
    private String region;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "Canal")
    private String canal;
    @Column(name = "nit_real")
    private Long nitReal;
    @Column(name = "nit")
    private Long nit;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "fecha")
    private LocalDateTime fecha;
    @Column(name = "OrdenCompra")
    private String ordenCompra;
    @Column(name = "PLU")
    private Long plu;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "Cant_pedida")
    private BigDecimal cantidadPedido;
    @Column(name = "cantidad_despachada")
    private BigDecimal cantidadDespachada;
    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;
    @Column(name = "Pendiente")
    private BigDecimal pendiente;
    @Column(name = "KilosPendiente")
    private BigDecimal kilosPendiente;
    @Column(name = "vR_Bruto")
    private BigDecimal vrBruto;
    @Column(name = "Vr_IVA")
    private BigDecimal vrIva;
    @Column(name = "Valor_total")
    private BigDecimal valorTotal;
    @Column(name = "autorizacion")
    private String autorizacion;
    @Column(name = "TipoDocFact")
    private String tipoDocFact;
    @Column(name = "NroFact")
    private Long nroFact;
    @Column(name = "Cant_fact")
    private BigDecimal cantFact;
    @Column(name = "Vr_unit_fact")
    private BigDecimal vrUnitFact;
    @Column(name = "Vr_Tot_fact")
    private BigDecimal vrTotFact;
}
