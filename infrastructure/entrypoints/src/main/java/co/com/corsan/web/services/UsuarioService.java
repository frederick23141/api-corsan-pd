package co.com.corsan.web.services;

import co.com.corsan.domain.presenters.UsuarioResponse;
import co.com.corsan.usecases.ports.UsuarioPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    private final UsuarioPort usuarioPort;

    public UsuarioService(UsuarioPort usuarioPort) {
        this.usuarioPort = usuarioPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public UsuarioResponse loadUserByUsername(String email) {
        return this.usuarioPort.loadUserByUsername(email);
    }
}
