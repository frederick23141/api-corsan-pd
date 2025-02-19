package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.CarteraDetalleResponse;

import java.util.List;

public interface CarteraDetallePort {

    List<CarteraDetalleResponse> consultarCarteraDetalle();


}
