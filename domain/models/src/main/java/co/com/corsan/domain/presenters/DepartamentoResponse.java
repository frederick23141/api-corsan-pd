package co.com.corsan.domain.presenters;

import co.com.corsan.domain.common.embeddedPK.DepartamentoDTOPk;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentoResponse {

    private DepartamentoDTOPk id;

    private String descripcion;

}
