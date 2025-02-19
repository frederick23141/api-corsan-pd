package co.com.corsan.domain.common;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetalleAnalitica {

    private Long numeroFactura;

    private Integer bodega;

    private String tipo;

    private Long nit;

    private String nombres;

    private String direccion;

    private String telefono1;

    private String mail;

    private String vendedor;

    private String nombreVendedor;

    private String yCiudad;

    private String ciudad;

    private String yPais;

    private LocalDateTime fechaFact;

    private String codigo;

    private String descripcion;

    private String subGrupo;

    private BigDecimal cantidadFact;

    private BigDecimal kilosFact;

    private BigDecimal valorUnitario;

    private Long anio;

    private Long mes;

    private Long diaFact;

    private String longitud;

    private String latitud;

    private String grupo;

    private BigDecimal cantidadPedida;

    private BigDecimal vrTotal;

    private BigDecimal porcentajeIva;

    private String departamento;

    private String undEmpaque;

    private BigDecimal costoUnitario;

    private BigDecimal costoTotal;

    private BigDecimal utilidad;

    private String region;

    private String condicion;

    private String sector;

    private String canal;

    private String ruta;

    private Long anioCreado;

    private Long mesCreado;

    private Integer bloqueo;

    private Integer sw;

    private String codgru;

    private String codsub;

    private String yDpto;

    private String bloqueada;
}
