package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.BexDetalleFacturaCarteraPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
//@Builder
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_Bex_Detalle_Fact_Cartera")
public class BexDetalleFacturaCarteraEntity {


    @EmbeddedId
    private BexDetalleFacturaCarteraPK id;

    @Column(name = "nit")
    private Long nit;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "tipocredito")
    private String tipoCredito;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad")
    private BigDecimal cantidad;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "vr_total")
    private BigDecimal valorTotal;

}
