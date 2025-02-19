package co.com.corsan.domain.common.embeddedPK;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CiudadesDptoDTOPK implements Serializable {

    private String pais;

    private String codigoDepartamento;

    private String codigoCiudad;
}
