package co.com.corsan.domain.requesters;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BexPendientesFacturaRequest {

    private Long numero;
    private String codigo;
    private Integer bodega;
    private Long vendedor;
    private String region;
    private String ciudad;
    private String canal;
    private Long nitReal;
    private Long nit;
}
