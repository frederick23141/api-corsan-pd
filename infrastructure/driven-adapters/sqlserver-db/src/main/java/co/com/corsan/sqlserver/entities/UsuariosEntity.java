package co.com.corsan.sqlserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USUARIOS_WEB")
public class UsuariosEntity implements Serializable {

    @Column(name = "usuario")
    public String nombre;
    @Column(name = "contraseña")
    public String password;
    @Id
    @Column(name = "mail")
    private String email;

    /*@Column(name = "descripcion_usuario")
    public String descripcion;*/

}
