package co.com.corsan.sqlserver.entities;


import co.com.corsan.sqlserver.entities.embeddedPK.BexPagosTramitesPK;
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
@Table(name = "PI_Bex_pagos_Tramites")
public class BexPagosTramitesEntity {

    @EmbeddedId
    private BexPagosTramitesPK id;

    @Column(name = "nit")
    private Long nit;

    @Column(name = "tipocredito")
    private String tipoCredito;

    @Column(name = "nit_real")
    private Long nitReal;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "valor_aplicado")
    private BigDecimal valorAplicado;

}
