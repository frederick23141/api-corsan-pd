package co.com.corsan.domain.common;

import co.com.corsan.domain.common.embeddedPK.VentasAnoMesVendedorDTOPk;
import lombok.*;

import java.math.BigDecimal;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VentasAnoMesVendedor {

    private VentasAnoMesVendedorDTOPk id;

    private BigDecimal nitReal;

    private BigDecimal nit;

    private BigDecimal cantidad;

    private BigDecimal kilos;

    private BigDecimal vrTotal;
}
