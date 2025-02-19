package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BexTramitesDTOPK implements Serializable {

    private String tipo;

    private Long numeroFactura;

    //private Long numeroAplica;

}
