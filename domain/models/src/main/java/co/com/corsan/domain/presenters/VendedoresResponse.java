package co.com.corsan.domain.presenters;


import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendedoresResponse {

    private Long nit;

    private String nombres;

    private Integer piCentro;

    private Integer bloqueo;

    private String conceptoUno;

    private Double bodega;

    private String prefijo;
}
