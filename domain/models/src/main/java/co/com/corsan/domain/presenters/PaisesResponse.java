package co.com.corsan.domain.presenters;


import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaisesResponse {

    private String pais;

    private String descripcion;

}
