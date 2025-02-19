package co.com.corsan.domain.common;


import co.com.corsan.domain.common.embeddedPK.CiudadesDptoDTOPK;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CiudadesDpto {

    private CiudadesDptoDTOPK id;

    private String departamento;

    private String ciudad;
}
