package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.CiudadesDptoResponse;
import co.com.corsan.domain.presenters.DepartamentoResponse;
import co.com.corsan.domain.presenters.PaisesResponse;
import co.com.corsan.usecases.ports.RegionesPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionesService {

    private final RegionesPort regionesPort;

    public RegionesService(RegionesPort regionesPort) {
        this.regionesPort = regionesPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<PaisesResponse> consultarPaises() {
        return this.regionesPort.consultarPaises();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<DepartamentoResponse> consultarDepartamento() {
        return this.regionesPort.consultarDepartamento();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<CiudadesDptoResponse> consultarCiudades() {
        return this.regionesPort.consultarCiudades();
    }
}
