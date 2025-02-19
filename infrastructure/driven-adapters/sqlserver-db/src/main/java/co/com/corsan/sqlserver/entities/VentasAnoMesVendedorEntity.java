package co.com.corsan.sqlserver.entities;

import co.com.corsan.sqlserver.entities.embeddedPK.VentasAnoMesVendedorPk;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pi_ventas_ano_mes_vendedor")
public class VentasAnoMesVendedorEntity implements Serializable {


    @EmbeddedId
    private VentasAnoMesVendedorPk id;

    @Column(name = "nit_real")
    private BigDecimal nitReal;
    //    @Column(name = "nit")
//    private BigDecimal nit;
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "kilos")
    private BigDecimal kilos;
    @Column(name = "vr_total")
    private BigDecimal vrTotal;


}
