package co.com.corsan.domain.common;

import lombok.*;

import java.math.BigDecimal;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeguimientoVentasPptoVentas {

    private Long vendedor;
    private BigDecimal vrPptoVtas;
    private BigDecimal vtTotalVtas;
    private BigDecimal vrTotalPtes;
    private BigDecimal xCumplirVTAS;
    private BigDecimal pptoREC;
    private BigDecimal vrTotalREC;
    private BigDecimal xCumplirREC;
}
