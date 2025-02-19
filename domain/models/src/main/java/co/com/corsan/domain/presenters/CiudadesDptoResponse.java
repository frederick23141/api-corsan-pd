package co.com.corsan.domain.presenters;


import co.com.corsan.domain.common.embeddedPK.CiudadesDptoDTOPK;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CiudadesDptoResponse {

    private CiudadesDptoDTOPK id;

    private String departamento;

    private String ciudad;
}
