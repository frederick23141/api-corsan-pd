package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.PiCiudadesDptoPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

@Entity
@Getter
@Setter
@ToString
@Immutable
@Table(name = "PI_ciudades_dpto")
public class CiudadesDptoEntity {


    @EmbeddedId
    private PiCiudadesDptoPK id;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "ciudad")
    private String ciudad;

}
