package co.com.corsan.sqlserver.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pi_detalle_analitica")
public class DetalleAnaliticaEntity {

    @Id
    @Column(name = "numero")
    private Long numeroFactura;

    @Column(name = "bodega")
    private Integer bodega;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "nit")
    private Long nit;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono_1")
    private String telefono1;

    @Column(name = "mail")
    private String mail;

    @Column(name = "vendedor")
    private String vendedor;

    @Column(name = "nombre_vendedor")
    private String nombreVendedor;

    @Column(name = "y_ciudad")
    private String yCiudad;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "y_pais")
    private String yPais;

    @Column(name = "fecha_fact")
    private LocalDateTime fechaFact;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "subgrupo")
    private String subGrupo;

    @Column(name = "CantidadFact")
    private BigDecimal cantidadFact;

    @Column(name = "KilosFact")
    private BigDecimal kilosFact;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "Año")
    private Long anio;

    @Column(name = "Mes")
    private Long mes;

    @Column(name = "dia_fact")
    private Long diaFact;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "Grupo")
    private String grupo;

    @Column(name = "cantidad_pedida")
    private BigDecimal cantidadPedida;

    @Column(name = "Vr_total")
    private BigDecimal vrTotal;

    @Column(name = "porcentaje_iva")
    private BigDecimal porcentajeIva;

    @Column(name = "Departamento")
    private String departamento;

    @Column(name = "UndEmpaque")
    private String undEmpaque;

    @Column(name = "costo_unitario")
    private BigDecimal costoUnitario;

    @Column(name = "Cto_total")
    private BigDecimal costoTotal;

    @Column(name = "Utilidad")
    private BigDecimal utilidad;

    @Column(name = "Region")
    private String region;

    @Column(name = "condicion")
    private String condicion;

    @Column(name = "sector")
    private String sector;

    @Column(name = "Canal")
    private String canal;

    @Column(name = "ruta")
    private String ruta;

    @Column(name = "Año_creado")
    private Long anioCreado;

    @Column(name = "Mes_Creado")
    private Long mesCreado;

    @Column(name = "bloqueo")
    private Integer bloqueo;

    @Column(name = "sw")
    private Integer sw;

    @Column(name = "codgru")
    private String codgru;

    @Column(name = "codsub")
    private String codsub;

    @Column(name = "y_dpto")
    private String yDpto;

    @Column(name = "Bloqueada")
    private String bloqueada;
}
