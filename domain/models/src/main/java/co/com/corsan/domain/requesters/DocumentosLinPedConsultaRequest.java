package co.com.corsan.domain.requesters;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentosLinPedConsultaRequest {
    @NotNull(message = "El campo id no puede ser null")
    private Long id;
}
