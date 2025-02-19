package co.com.corsan.web.services;

import co.com.corsan.domain.presenters.ClientesResponse;
import co.com.corsan.usecases.ports.ClientesPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientesService {

    private final ClientesPort clientesPort;

    public ClientesService(ClientesPort clientesPort) {
        this.clientesPort = clientesPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<ClientesResponse> consultarCliente() {
        return this.clientesPort.consultarClientes();
    }
}
