package co.com.corsan.sqlserver.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "PI_paises")
public class PaisesEntity {

    @Id
    @Column(name = "pais")
    private String pais;

    @Column(name = "descripcion")
    private String descripcion;
}
