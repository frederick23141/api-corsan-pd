package co.com.corsan.domain.common;


import co.com.corsan.domain.common.embeddedPK.PreciosDTOPK;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Precios {

    private PreciosDTOPK id;

    private BigDecimal precio;
}
