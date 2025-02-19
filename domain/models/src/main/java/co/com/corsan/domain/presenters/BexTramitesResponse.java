package co.com.corsan.domain.presenters;

import co.com.corsan.domain.common.embeddedPK.BexTramitesDTOPK;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BexTramitesResponse {

    private BexTramitesDTOPK id;

    private Long vendedor;
    private Long nit;
    private String tipoCredito;
    private String codEmpresa;
    private String region;
    private String telefono1;
    private String telefono2;
    private Long nitReal;
    private String nombres;
    private LocalDateTime fechaFactura;
    private String fechaVencimiento;
    private BigDecimal valorTotal;
    private Integer diasVencidos;
    private Integer cuotasMora;
    private BigDecimal vrTotalMora;

}
