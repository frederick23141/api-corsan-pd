package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BexPendientesFacturaDTOPK implements Serializable {

    private Long numero;

    private String codigo;

    //private Long seq;

}
