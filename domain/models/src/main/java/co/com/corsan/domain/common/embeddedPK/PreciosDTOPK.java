package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PreciosDTOPK implements Serializable {

    private String lista;

    private String codigo;

}
