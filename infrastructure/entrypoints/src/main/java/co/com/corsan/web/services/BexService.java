package co.com.corsan.web.services;

import co.com.corsan.domain.presenters.BexDetalleFacturaCarteraResponse;
import co.com.corsan.domain.presenters.BexPagosTramitesResponse;
import co.com.corsan.domain.presenters.BexPendientesFacturasResponse;
import co.com.corsan.domain.presenters.BexTramitesResponse;
import co.com.corsan.domain.requesters.BexPendientesFacturaRequest;
import co.com.corsan.usecases.ports.BexPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BexService {

    private final BexPort bexPort;

    public BexService(BexPort bexPort) {
        this.bexPort = bexPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<BexPendientesFacturasResponse> consultarPendientesFacturas(BexPendientesFacturaRequest bexPendientesFacturaRequest) {
        return this.bexPort.consultarPendientesFacturas(bexPendientesFacturaRequest);
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<BexTramitesResponse> consultarTramites() {
        return this.bexPort.consultarTramites();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<BexDetalleFacturaCarteraResponse> consultarDetalleFacturaCartera() {
        return this.bexPort.consultarDetalleFacturaCartera();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<BexPagosTramitesResponse> consultarPagosTramites() {
        return this.bexPort.consultarPagosTramites();
    }
}
