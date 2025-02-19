package co.com.corsan.domain.common.embeddedPK;


import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentasAnoMesVendedorDTOPk {


    @NotNull(message = "El año no puede estar vacío")
    private Long ano;

    @NotNull(message = "El mes no puede estar vacío")
    private Long mes;

    @NotNull(message = "El vendedor no puede estar vacío")
    private BigDecimal vendedor;
}
