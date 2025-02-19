package co.com.corsan.domain.common;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarteraDetalle {


    private Long vendedor;

    private Long facturaNumero;

    private BigDecimal nitReal;

    private BigDecimal nit;

    private String nombres;

    private String tipo;

    private LocalDateTime fechaFactura;

    private LocalDateTime fechaVencimiento;

    private Long diasVencidos;

    private BigDecimal valorTotal;

    private BigDecimal saldo;

    private String idRegion;
}
