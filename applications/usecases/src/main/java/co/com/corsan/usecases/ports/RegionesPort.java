package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.CiudadesDptoResponse;
import co.com.corsan.domain.presenters.DepartamentoResponse;
import co.com.corsan.domain.presenters.PaisesResponse;

import java.util.List;

public interface RegionesPort {

    List<PaisesResponse> consultarPaises();

    List<CiudadesDptoResponse> consultarCiudades();

    List<DepartamentoResponse> consultarDepartamento();
}
