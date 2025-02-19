package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.PreciosResponse;
import co.com.corsan.domain.presenters.ProductosResponse;
import co.com.corsan.domain.presenters.StockResponse;
import co.com.corsan.domain.repositories.ProductosRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.ProductosPort;

import java.util.List;

public class ProductosAdapter implements ProductosPort {

    private final ProductosRepository productosRepository;

    public ProductosAdapter(ProductosRepository preciosRepository) {
        this.productosRepository = preciosRepository;
    }

    @Override
    public List<PreciosResponse> consultarPrecios() {
        return Mapper.mapAll(this.productosRepository.consultarPrecios(), PreciosResponse.class);
    }

    @Override
    public List<StockResponse> consultarStock() {

        return Mapper.mapAll(this.productosRepository.consultarStock(), StockResponse.class);
    }

    @Override
    public List<ProductosResponse> consultarProductos() {
        return Mapper.mapAll(this.productosRepository.consultarProductos(), ProductosResponse.class);
    }
}
