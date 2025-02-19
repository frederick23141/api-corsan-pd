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
public class BexPendientesFacturaPK implements Serializable {

    @Column(name = "numero")
    private Long numero;

    @Column(name = "codigo")
    private String codigo;

    /*@Column(name = "seq")
    private Long seq;*/
}
