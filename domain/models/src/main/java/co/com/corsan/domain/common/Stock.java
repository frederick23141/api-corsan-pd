package co.com.corsan.domain.common;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stock {


    private String codigo;

    private Integer bodega;

    private String grupo;

    private String nombreGrupo;

    private String subGrupo;

    private String descripcion;

    private BigDecimal porcentajeIva;

    private BigDecimal stock;

    private BigDecimal kgStock;
}
