package co.com.corsan.web.services;


import co.com.corsan.domain.presenters.PreciosResponse;
import co.com.corsan.domain.presenters.ProductosResponse;
import co.com.corsan.domain.presenters.StockResponse;
import co.com.corsan.usecases.ports.ProductosPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductosService {

    private final ProductosPort preciosPort;


    public ProductosService(ProductosPort preciosPort) {
        this.preciosPort = preciosPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<PreciosResponse> consultarPrecios() {
        return this.preciosPort.consultarPrecios();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<StockResponse> consultarStock() {
        return this.preciosPort.consultarStock();
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public List<ProductosResponse> consultarProductos() {
        return this.preciosPort.consultarProductos();
    }


}
