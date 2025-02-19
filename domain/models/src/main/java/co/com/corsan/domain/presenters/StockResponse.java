package co.com.corsan.domain.presenters;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockResponse {


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
