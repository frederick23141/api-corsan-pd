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
public class PreciosPK implements Serializable {

    @Column(name = "lista")
    private String lista;

    @Column(name = "codigo")
    private String codigo;
}
