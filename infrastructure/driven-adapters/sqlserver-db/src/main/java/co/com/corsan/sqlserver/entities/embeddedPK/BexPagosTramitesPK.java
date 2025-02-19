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
public class BexPagosTramitesPK implements Serializable {


    @Column(name = "numero")
    private Long numeroFactura;

    @Column(name = "tipo_aplica")
    private String tipoAplica;

    @Column(name = "numero_aplica")
    private Long numeroAplica;

}
