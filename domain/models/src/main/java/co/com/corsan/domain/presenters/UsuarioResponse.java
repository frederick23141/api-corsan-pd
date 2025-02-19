package co.com.corsan.domain.presenters;

import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponse {

    public String nombre;
    public String email;
    public String password;

}
