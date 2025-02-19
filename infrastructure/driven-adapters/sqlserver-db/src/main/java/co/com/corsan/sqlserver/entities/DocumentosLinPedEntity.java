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
@Table(name = "documentos_lin_ped")

public class DocumentosLinPedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;

    @Column(name = "sw")
    private Integer sw;

    @Column(name = "numero")
    private Long numero;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "seq")
    private Integer seq;

    @NotNull
    @Column(name = "bodega")
    private Integer bodega;

    @Column(name = "cantidad")
    private BigDecimal cantidad;

    @Column(name = "cantidad_despachada")
    private BigDecimal cantidadDespachada;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "porcentaje_iva")
    private BigDecimal porcentajeIva;

    @Column(name = "porcentaje_descuento")
    private BigDecimal porcentajeDescuento;

    @Column(name = "und")
    private String und;

    @Column(name = "cantidad_und")
    private BigDecimal cantidadUnd;

    @Column(name = "adicional")
    private String adicional;

    @Column(name = "despacho_virtual")
    private BigDecimal despachoVirtual;

    @Column(name = "porc_dcto_2")
    private BigDecimal porcDcto2;

    @Column(name = "porc_dcto_3")
    private BigDecimal porcDcto3;

    @Column(name = "cantidad_op")
    private Double cantidadOp;

    @Column(name = "Consignacion")
    private Integer Consignacion;

    @Column(name = "fec_compromiso")
    private LocalDateTime fecCompromiso;

    @Column(name = "producido")
    private Integer producido;

    @Column(name = "calidad")
    private Integer calidad;

    @Column(name = "valorUnitarioConfirmado")
    private BigDecimal valorUnitarioConfirmado;

    @Column(name = "nota_prod")
    private String notaProd;

    @Column(name = "cantidad_confirmada")
    private Double cantidadConfirmada;

    @Column(name = "color_interno")
    private String colorInterno;

    @Column(name = "color_externo")
    private String colorExterno;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "id_admon_ped_cot")
    private Long idAdmonPedCot;

    @Column(name = "descripcion_item_adicional")
    private String descripcionItemAdicional;

}
