package co.com.corsan.sqlserver.entities.embeddedPK;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VentasAnoMesVendedorPk {

    @Column(name = "año")
    private Long ano;

    @Column(name = "mes")
    private Long mes;

    @Column(name = "vendedor")
    private BigDecimal vendedor;

    @Column(name = "nit")
    private BigDecimal nit;

}
