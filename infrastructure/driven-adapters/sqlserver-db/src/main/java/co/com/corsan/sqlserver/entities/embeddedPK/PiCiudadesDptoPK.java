package co.com.corsan.sqlserver.entities.embeddedPK;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PiCiudadesDptoPK {


    @Column(name = "pais")
    private String pais;
    @Column(name = "cod_dpto")
    private String codigoDepartamento;
    @Column(name = "cod_ciud")
    private String codigoCiudad;

}
