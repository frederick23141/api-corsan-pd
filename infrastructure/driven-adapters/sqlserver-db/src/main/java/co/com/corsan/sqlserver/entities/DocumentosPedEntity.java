package co.com.corsan.sqlserver.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "documentos_ped")

public class DocumentosPedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;

    @NotNull
    @Column(name = "bodega")
    private Integer bodega;

    @NotNull
    @Column(name = "numero")
    private Long numero;

    @NotNull
    @Column(name = "sw")
    private Integer sw;

    @Column(name = "nit")
    private Long nit;

    @Column(name = "vendedor")
    private Long vendedor;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "condicion")
    private String condicion;

    @Column(name = "dias_validez")
    private Integer diasValidez;

    @Column(name = "descuento_pie")
    private BigDecimal descuentoPie;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;

    @NotNull
    @Column(name = "anulado")
    private Integer anulado;

    @Column(name = "notas")
    private String notas;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "pc")
    private String pc;

    @Column(name = "duracion")
    private Integer duracion;

    @Column(name = "concepto")
    private Integer concepto;

    @Column(name = "moneda")
    private String moneda;

    @Column(name = "despacho")
    private String despacho;

    @Column(name = "fecha_hora_entrega")
    private LocalDateTime fechaHoraEntrega;

    @Column(name = "nit_destino")
    private Long nitDestino;

    @Column(name = "codigo_direccion")
    private Integer codigoDireccion;

    @Column(name = "abono")
    private BigDecimal abono;

    @Column(name = "telefono")
    private Long telefono;

    @Column(name = "emergencia")
    private String emergencia;

    @Column(name = "documento")
    private String documento;

    @Column(name = "autorizacion")
    private String autorizacion;

    @Column(name = "autoriz_texto")
    private String autorizTexto;

    @Column(name = "nit2")
    private Long nit2;

    @Column(name = "mrp")
    private String mrp;

    @Column(name = "notas5")
    private String notas5;

    @Column(name = "Lista_Precios")
    private String listaPrecios;

    @Column(name = "fletes")
    private BigDecimal fletes;

    @Column(name = "iva_fletes")
    private BigDecimal ivaFletes;

    @Column(name = "OrdenEnv")
    private String ordenEnv;

    @Column(name = "notas_aut")
    private String notasAut;

    @Column(name = "descuento_des_iva")
    private BigDecimal descuentoDesIva;

    @Column(name = "cod_direccion_dest")
    private Integer codDireccionDest;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "nota_vta")
    private String notaVta;

    @Column(name = "usuario_aut")
    private String usuarioAut;

    @Column(name = "nota_compro")
    private String notaCompro;

    @Column(name = "prg")
    private Integer prg;

    @Column(name = "multiplesOC")
    private String multiplesOC;

    @Column(name = "Tipo_Orden")
    private String tipoOrden;

    @Column(name = "usuario_autorizo")
    private String usuarioAutorizo;

    @Column(name = "id_tabla_amortizacion")
    private Long idTablaAmortizacion;

    @Column(name = "pedido_movil")
    private Integer pedidoMovil;

    @Column(name = "moduloCreacion")
    private String moduloCreacion;

    @Column(name = "nota_prod")
    private String notaProd;

    @Column(name = "nota1")
    private String nota1;

    @Column(name = "nota2")
    private String nota2;

    @Column(name = "Problema")
    private String problema;

    @Column(name = "perf")
    private Integer perf;

    @Column(name = "Id_tall_encabeza_orden")
    private Long idTallEncabezaOrden;

    @Column(name = "id_movil")
    private Long idMovil;

    @Column(name = "CodigoClasificacion")
    private String codigoClasificacion;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "tipo_compra")
    private String tipoCompra;

    @Column(name = "modelo_compra")
    private String modeloCompra;

    @Column(name = "fecha_entrega")
    private LocalDateTime fechaEntrega;

    @Column(name = "fecha_entrega_max")
    private LocalDateTime fechaEntregaMax;

    @Column(name = "id_usuario_final")
    private Long idUsuarioFinal;

    @Column(name = "centro_costos")
    private Long centroCostos;

    @Column(name = "utilizacion")
    private String utilizacion;

    @Column(name = "destinatario")
    private String destinatario;

    @Column(name = "id_tiempo_garantia")
    private Long idTiempoGarantia;

    @Column(name = "NumItems")
    private Long numItems;

    @Column(name = "Valor_Total_Inicial")
    private BigDecimal valorTotalInicial;

    @Column(name = "cor_orden_compra")
    private String corOrdenCompra;

    @Column(name = "debito_niif")
    private BigDecimal debitoNiif;

    @Column(name = "credito_niif")
    private BigDecimal creditoNiif;

    @Column(name = "Lugar_entrega")
    private String lugarEntrega;

    @Column(name = "certificado_calidad")
    private String certificadoCalidad;
}
