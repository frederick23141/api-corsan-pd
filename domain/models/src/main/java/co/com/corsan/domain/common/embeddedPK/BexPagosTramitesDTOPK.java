package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BexPagosTramitesDTOPK implements Serializable {

    private Long numeroFactura;

    private String tipoAplica;

    private Long numeroAplica;

}
