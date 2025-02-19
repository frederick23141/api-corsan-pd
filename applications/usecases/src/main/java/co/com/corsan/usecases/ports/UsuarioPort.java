package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.UsuarioResponse;

public interface UsuarioPort {

    UsuarioResponse loadUserByUsername(String email);
}
