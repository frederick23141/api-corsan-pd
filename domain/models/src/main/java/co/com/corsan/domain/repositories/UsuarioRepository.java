package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.Usuario;

public interface UsuarioRepository {

    Usuario consultarUsuario(String email);
}
