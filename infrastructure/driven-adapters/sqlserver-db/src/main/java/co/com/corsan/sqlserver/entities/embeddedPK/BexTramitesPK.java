package co.com.corsan.sqlserver.entities.embeddedPK;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BexTramitesPK implements Serializable {

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fact_nro")
    private Long numeroFactura;

    /*@Column(name = "numero_aplica")
    private Long numeroAplica;*/

}
