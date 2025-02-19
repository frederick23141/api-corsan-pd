package co.com.corsan.sqlserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_productos")
public class ProductosEntity implements Serializable {

    @Id
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "id_grupo")
    private String idGrupo;
    @Column(name = "grupo")
    private String grupo;
    @Column(name = "id_subgrupo")
    private String idSubGrupo;
    @Column(name = "subgrupo")
    private String subgrupo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "und_empaque")
    private String unidadEmpaque;
    @Column(name = "conversion")
    private BigDecimal conversion;
    @Column(name = "porcentaje_iva")
    private BigDecimal porcentajeIva;
    @Column(name = "minima_ordenar")
    private Long minimaOrdenar;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "TopePedidoMin")
    private Long topePedidoMin;

}
