package co.com.corsan.domain.common;

import co.com.corsan.domain.common.embeddedPK.BexPagosTramitesDTOPK;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BexPagosTramites {

    private BexPagosTramitesDTOPK id;

    private Long nit;

    private String tipoCredito;

    private Long nitReal;

    private String tipo;

    private LocalDateTime fecha;

    private BigDecimal valorTotal;

    private BigDecimal valorAplicado;
}
