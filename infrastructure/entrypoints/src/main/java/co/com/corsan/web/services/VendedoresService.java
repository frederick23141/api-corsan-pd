package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.domain.presenters.VendedoresResponse;
import co.com.corsan.domain.presenters.VentasAnoMesVendedorResponse;
import co.com.corsan.usecases.ports.VendedoresPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VendedoresService {


    private final VendedoresPort vendedoresPort;


    public VendedoresService(VendedoresPort vendedoresPort) {
        this.vendedoresPort = vendedoresPort;
    }


    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<VendedoresResponse> consultarVendedores() {
        return this.vendedoresPort.consultarVendedores();
    }


    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<VentasAnoMesVendedorResponse> consultarVentas() {
        return this.vendedoresPort.consultarVentas();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPptoVentas() {
        return this.vendedoresPort.consultarSeguimientoVentasPptoVentas();
    }
}
