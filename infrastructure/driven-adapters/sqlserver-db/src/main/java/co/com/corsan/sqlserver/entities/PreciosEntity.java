package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.PreciosPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_precios")
public class PreciosEntity {

    @EmbeddedId
    private PreciosPK id;

    @Column(name = "precio")
    private BigDecimal precio;


}
