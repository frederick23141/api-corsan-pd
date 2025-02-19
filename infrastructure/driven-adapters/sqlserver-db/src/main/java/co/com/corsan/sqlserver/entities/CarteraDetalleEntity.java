package co.com.corsan.sqlserver.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_cartera_detalle")
public class CarteraDetalleEntity implements Serializable {

    @Id
    @Column(name = "fact_nro")
    private Long facturaNumero;

    @Column(name = "vendedor")
    private Long vendedor;

    @Column(name = "nit_real")
    private BigDecimal nitReal;

    @Column(name = "nit")
    private BigDecimal nit;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fecha_fact")
    private LocalDateTime fechaFactura;

    @Column(name = "fec_vencim")
    private LocalDateTime fechaVencimiento;

    @Column(name = "dias_vencidos")
    private Long diasVencidos;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "saldo")
    private BigDecimal saldo;

    @Column(name = "id_region")
    private String idRegion;

}
