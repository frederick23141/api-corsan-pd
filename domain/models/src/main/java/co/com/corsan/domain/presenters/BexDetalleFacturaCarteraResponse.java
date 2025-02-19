package co.com.corsan.domain.presenters;

import co.com.corsan.domain.common.embeddedPK.BexDetalleFacturaCarteraDTOPK;
import lombok.*;

import java.math.BigDecimal;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BexDetalleFacturaCarteraResponse {

    private BexDetalleFacturaCarteraDTOPK id;

    private Long nit;

    private String tipo;

    private String tipoCredito;

    private String descripcion;

    private BigDecimal cantidad;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;
}
