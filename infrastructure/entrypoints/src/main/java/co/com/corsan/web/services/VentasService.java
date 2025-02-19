package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.usecases.ports.VentasPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentasService {

    private final VentasPort ventasPort;


    public VentasService(VentasPort ventasPort) {
        this.ventasPort = ventasPort;
    }


    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPpto() {
        return this.ventasPort.consultarSeguimientoVentasPpto();
    }

}
