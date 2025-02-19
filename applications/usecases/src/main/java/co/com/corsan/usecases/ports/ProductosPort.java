package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.PreciosResponse;
import co.com.corsan.domain.presenters.ProductosResponse;
import co.com.corsan.domain.presenters.StockResponse;

import java.util.List;

public interface ProductosPort {

    List<PreciosResponse> consultarPrecios();

    List<StockResponse> consultarStock();


    List<ProductosResponse> consultarProductos();
}
