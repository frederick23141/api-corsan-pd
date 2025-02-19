package co.com.corsan.sqlserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pi_seguimiento_vtas_pptovtas")
public class SeguimientoVentasPptoVentasEntity implements Serializable {

    @Id
    @Column(name = "vendedor")
    private Long vendedor;

    @Column(name = "VrPpptoVtas")
    private BigDecimal vrPptoVtas;
    @Column(name = "VttotalVtas")
    private BigDecimal vtTotalVtas;
    @Column(name = "vrtotalPtes")
    private BigDecimal vrTotalPtes;
    @Column(name = "XcumplirVTAS")
    private BigDecimal xCumplirVTAS;
    @Column(name = "Ppto_REC")
    private BigDecimal pptoREC;
    @Column(name = "Vrtot_REC")
    private BigDecimal vrTotalREC;
    @Column(name = "XcumplirREC")
    private BigDecimal xCumplirREC;

}
