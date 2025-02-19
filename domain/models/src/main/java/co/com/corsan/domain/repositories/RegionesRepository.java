package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.CiudadesDpto;
import co.com.corsan.domain.common.Departamento;
import co.com.corsan.domain.common.Paises;

import java.util.List;

public interface RegionesRepository {

    List<Paises> consultarPais();

    List<CiudadesDpto> consultarCiudades();

    List<Departamento> consultarDepartamento();
}
