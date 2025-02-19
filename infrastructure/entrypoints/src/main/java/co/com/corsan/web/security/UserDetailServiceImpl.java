package co.com.corsan.web.security;

import co.com.corsan.domain.common.Usuario;
import co.com.corsan.domain.presenters.UsuarioResponse;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.web.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final UsuarioService usuarioService;

    @Autowired
    public UserDetailServiceImpl(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UsuarioResponse response = this.usuarioService.loadUserByUsername(email);

        if (Objects.isNull(response)) {
            new UsernameNotFoundException("El usuario con email " + email + " no existe.");
        }

        return new UserDetailsImpl(Mapper.map(response, Usuario.class));
    }

}
