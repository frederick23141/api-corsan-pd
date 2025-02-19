package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.ClientesResponse;

import java.util.List;

public interface ClientesPort {

    List<ClientesResponse> consultarClientes();
}
