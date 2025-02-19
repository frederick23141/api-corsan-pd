package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.common.Usuario;
import co.com.corsan.domain.presenters.UsuarioResponse;
import co.com.corsan.domain.repositories.UsuarioRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.UsuarioPort;

import java.util.Objects;

public class UsuarioAdapter implements UsuarioPort {

    private final UsuarioRepository usuarioRepository;

    public UsuarioAdapter(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioResponse loadUserByUsername(String email) {

        Usuario usuario = this.usuarioRepository.consultarUsuario(email);

        if (Objects.isNull(usuario.email)) {
            return null;
        }

        return Mapper.map(usuario, UsuarioResponse.class);

        /*return UsuarioResponse.builder()
                .nombre("admin")
                .email("admin")
                .password("$2a$10$o4fKeg55qSen3KTlGhiQh.yJwb18MRZUrjSuKLdqJYNh.wgFv.xqu")
                .build();
        */
    }
}
