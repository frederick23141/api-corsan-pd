package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.Clientes;

import java.util.List;

public interface ClientesRepository {

    List<Clientes> consultarClientes();
}
