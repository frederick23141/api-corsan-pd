package co.com.corsan.domain.common;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Productos {


    private String codigo;

    private String idGrupo;

    private String grupo;

    private String idSubGrupo;

    private String subgrupo;

    private String descripcion;

    private String unidadEmpaque;

    private BigDecimal conversion;

    private BigDecimal porcentajeIva;

    private Long minimaOrdenar;

    private String imagen;

    private Long topePedidoMin;
}
