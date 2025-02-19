package co.com.corsan.domain.requesters;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarteraDetalleRequest {

    @NotNull(message = "El campo facturaNumero no puede ser null")
    private Long facturaNumero;
}
