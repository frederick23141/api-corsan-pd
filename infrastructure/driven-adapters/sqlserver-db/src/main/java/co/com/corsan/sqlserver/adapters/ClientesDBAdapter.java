package co.com.corsan.sqlserver.adapters;


import co.com.corsan.domain.common.Clientes;
import co.com.corsan.domain.repositories.ClientesRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.ClientesEntity;
import co.com.corsan.sqlserver.repository.ClientesDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientesDBAdapter implements ClientesRepository {

    private final ClientesDBRepository clientesDBRepository;

    public ClientesDBAdapter(ClientesDBRepository clientesDBRepository) {
        this.clientesDBRepository = clientesDBRepository;
    }


    @Override
    public List<Clientes> consultarClientes() {

        List<ClientesEntity> clientes = this.clientesDBRepository.findAll();
        if (!clientes.isEmpty()) {
            return Mapper.mapAll(clientes, Clientes.class);
        }
        return new ArrayList<>();
    }
}
