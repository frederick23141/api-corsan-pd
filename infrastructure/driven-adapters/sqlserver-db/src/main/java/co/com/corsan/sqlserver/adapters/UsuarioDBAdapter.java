package co.com.corsan.sqlserver.adapters;


import co.com.corsan.domain.common.Usuario;
import co.com.corsan.domain.repositories.UsuarioRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.UsuariosEntity;
import co.com.corsan.sqlserver.repository.UsuarioDBRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioDBAdapter implements UsuarioRepository {

    private final UsuarioDBRepository usuarioDBRepository;

    public UsuarioDBAdapter(UsuarioDBRepository usuarioDBRepository) {
        this.usuarioDBRepository = usuarioDBRepository;
    }


    @Override
    public Usuario consultarUsuario(String email) {

        Optional<UsuariosEntity> usuario = this.usuarioDBRepository.findById(email);

        if (usuario.isPresent()) {
            return Mapper.map(usuario, Usuario.class);
        }

        return new Usuario();
    }
}
