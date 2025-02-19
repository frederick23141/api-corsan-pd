package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.ClientesResponse;
import co.com.corsan.domain.repositories.ClientesRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.ClientesPort;

import java.util.List;

public class ClientesAdapter implements ClientesPort {

    private final ClientesRepository clientesRepository;

    public ClientesAdapter(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @Override
    public List<ClientesResponse> consultarClientes() {
        return Mapper.mapAll(this.clientesRepository.consultarClientes(), ClientesResponse.class);
    }
}
