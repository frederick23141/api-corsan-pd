package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.CarteraDetalleResponse;
import co.com.corsan.usecases.ports.CarteraDetallePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarteraDetalleService {


    private final CarteraDetallePort carteraDetallePort;


    public CarteraDetalleService(CarteraDetallePort carteraDetallePort) {
        this.carteraDetallePort = carteraDetallePort;
    }


    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<CarteraDetalleResponse> consultarCarteraDetalle() {
        return this.carteraDetallePort.consultarCarteraDetalle();
    }
}
