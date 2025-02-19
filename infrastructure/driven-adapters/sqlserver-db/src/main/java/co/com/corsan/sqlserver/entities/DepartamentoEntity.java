package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.DepartamentoPk;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pi_departamentos")
public class DepartamentoEntity {

    @EmbeddedId
    private DepartamentoPk id;

    @Column(name = "descripcion")
    private String descripcion;
}
