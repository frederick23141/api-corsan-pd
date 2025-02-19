package co.com.corsan.domain.common;

import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    public String nombre;
    public String email;
    public String password;

}
