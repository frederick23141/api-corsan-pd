package co.com.corsan.domain.common;

import co.com.corsan.domain.common.embeddedPK.DepartamentoDTOPk;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {

    private DepartamentoDTOPk id;

    private String descripcion;

}
