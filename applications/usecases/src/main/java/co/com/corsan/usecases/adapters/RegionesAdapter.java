package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.CiudadesDptoResponse;
import co.com.corsan.domain.presenters.DepartamentoResponse;
import co.com.corsan.domain.presenters.PaisesResponse;
import co.com.corsan.domain.repositories.RegionesRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.RegionesPort;

import java.util.List;

public class RegionesAdapter implements RegionesPort {

    private final RegionesRepository regionesRepository;

    public RegionesAdapter(RegionesRepository regionesRepository) {
        this.regionesRepository = regionesRepository;
    }

    @Override
    public List<PaisesResponse> consultarPaises() {
        return Mapper.mapAll(this.regionesRepository.consultarPais(), PaisesResponse.class);
    }

    @Override
    public List<DepartamentoResponse> consultarDepartamento() {
        return Mapper.mapAll(this.regionesRepository.consultarDepartamento(), DepartamentoResponse.class);
    }

    @Override
    public List<CiudadesDptoResponse> consultarCiudades() {
        return Mapper.mapAll(this.regionesRepository.consultarCiudades(), CiudadesDptoResponse.class);
    }
}
