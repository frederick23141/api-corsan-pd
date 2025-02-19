package co.com.corsan.sqlserver.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "PI_stock")
public class StockEntity {


    @Id
    @Column(name = "codigo")
    private String codigo;

    @Column(name = "bodega")
    private Integer bodega;
    @Column(name = "grupo")
    private String grupo;
    @Column(name = "nom_grupo")
    private String nombreGrupo;
    @Column(name = "subgrupo")
    private String subGrupo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "porcentaje_iva")
    private BigDecimal porcentajeIva;
    @Column(name = "stock")
    private BigDecimal stock;
    @Column(name = "kg_stock")
    private BigDecimal kgStock;


}
