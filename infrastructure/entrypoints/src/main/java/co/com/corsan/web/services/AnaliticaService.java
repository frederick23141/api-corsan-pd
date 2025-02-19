package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.DetalleAnaliticaResponse;
import co.com.corsan.usecases.ports.AnaliticaPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnaliticaService {


    private final AnaliticaPort analiticaPort;


    public AnaliticaService(AnaliticaPort analiticaPort) {
        this.analiticaPort = analiticaPort;
    }


    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<DetalleAnaliticaResponse> consultarDetalleAnalitica() {
        return this.analiticaPort.consultarDetalleAnalitica();
    }
}
