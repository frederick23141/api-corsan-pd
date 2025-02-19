package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.CiudadesDpto;
import co.com.corsan.domain.common.Departamento;
import co.com.corsan.domain.common.Paises;
import co.com.corsan.domain.repositories.RegionesRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.CiudadesDptoEntity;
import co.com.corsan.sqlserver.entities.DepartamentoEntity;
import co.com.corsan.sqlserver.entities.PaisesEntity;
import co.com.corsan.sqlserver.repository.CiudadesDptoDBRepository;
import co.com.corsan.sqlserver.repository.DepartamentoDBRepository;
import co.com.corsan.sqlserver.repository.PaisesDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionesDBAdapter implements RegionesRepository {

    private final PaisesDBRepository paisesDBRepository;

    private final DepartamentoDBRepository departamentoDBRepository;

    private final CiudadesDptoDBRepository ciudadesDptoDBRepository;

    public RegionesDBAdapter(PaisesDBRepository piPaisDBRepository, DepartamentoDBRepository departamentoDBRepository, CiudadesDptoDBRepository ciudadesDptoDBRepository) {
        this.paisesDBRepository = piPaisDBRepository;
        this.departamentoDBRepository = departamentoDBRepository;
        this.ciudadesDptoDBRepository = ciudadesDptoDBRepository;
    }

    @Override
    public List<Paises> consultarPais() {
        List<PaisesEntity> pais = this.paisesDBRepository.findAll();
        if (!pais.isEmpty()) {
            return Mapper.mapAll(pais, Paises.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<Departamento> consultarDepartamento() {
        List<DepartamentoEntity> departamentos = this.departamentoDBRepository.findAll();
        if (!departamentos.isEmpty()) {
            return Mapper.mapAll(departamentos, Departamento.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<CiudadesDpto> consultarCiudades() {
        List<CiudadesDptoEntity> ciudades = this.ciudadesDptoDBRepository.findAll();
        if (!ciudades.isEmpty()) {
            return Mapper.mapAll(ciudades, CiudadesDpto.class);
        }
        return new ArrayList<>();
    }
}
