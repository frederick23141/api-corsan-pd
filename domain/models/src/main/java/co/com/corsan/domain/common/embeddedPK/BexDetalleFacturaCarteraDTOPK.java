package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BexDetalleFacturaCarteraDTOPK implements Serializable {

    private Long numeroFactura;

    private String codigo;

}
