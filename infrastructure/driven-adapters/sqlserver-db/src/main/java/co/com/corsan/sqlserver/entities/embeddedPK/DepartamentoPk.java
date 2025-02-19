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
public class DepartamentoPk {


    @Column(name = "pais")
    private String pais;

    @Column(name = "departamento")
    private String departamento;

}
