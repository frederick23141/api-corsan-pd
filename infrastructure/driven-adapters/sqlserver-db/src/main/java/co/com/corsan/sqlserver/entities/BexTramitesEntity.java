package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.BexTramitesPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
//@Builder
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PI_BexTramites")
public class BexTramitesEntity {


    @EmbeddedId
    private BexTramitesPK id;

    @Column(name = "vendedor")
    private Long vendedor;
    @Column(name = "nit")
    private Long nit;
    @Column(name = "tipocredito")
    private String tipoCredito;
    @Column(name = "codempresa")
    private String codEmpresa;
    @Column(name = "region")
    private String region;
    @Column(name = "telefono_1")
    private String telefono1;
    @Column(name = "telefono_2")
    private String telefono2;
    @Column(name = "nit_real")
    private Long nitReal;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "fecha_fact")
    private LocalDateTime fechaFactura;
    @Column(name = "fec_vencim")
    private String fechaVencimiento;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Column(name = "dias_vencidos")
    private Integer diasVencidos;
    @Column(name = "cuotasmora")
    private Integer cuotasMora;
    @Column(name = "vr_total_mora")
    private BigDecimal vrTotalMora;

}
