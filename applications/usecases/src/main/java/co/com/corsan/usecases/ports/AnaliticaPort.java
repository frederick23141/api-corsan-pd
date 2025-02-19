package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.DetalleAnaliticaResponse;

import java.util.List;

public interface AnaliticaPort {

    List<DetalleAnaliticaResponse> consultarDetalleAnalitica();
}
