package co.com.corsan.domain.common.embeddedPK;


import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDTOPk implements Serializable {


    @NotNull(message = "El pais no puede estar vacío")
    private String pais;
    @NotNull(message = "El departamento no puede estar vacío")
    private String departamento;
}
