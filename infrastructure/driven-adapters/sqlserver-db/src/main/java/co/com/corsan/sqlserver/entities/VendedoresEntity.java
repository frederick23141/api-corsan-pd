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
@Table(name = "pi_vendedores")
public class VendedoresEntity {

    @Id
    @Column(name = "nit")
    private Long nit;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "pi_centro")
    private Integer piCentro;

    @Column(name = "bloqueo")
    private Integer bloqueo;

    @Column(name = "concepto_1")
    private String conceptoUno;

    @Column(name = "bodega")
    private Double bodega;

    @Column(name = "prefijo")
    private String prefijo;

}
