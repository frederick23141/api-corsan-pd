package co.com.corsan.sqlserver.adapters;


import co.com.corsan.domain.common.Precios;
import co.com.corsan.domain.common.Productos;
import co.com.corsan.domain.common.Stock;
import co.com.corsan.domain.repositories.ProductosRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.PreciosEntity;
import co.com.corsan.sqlserver.entities.ProductosEntity;
import co.com.corsan.sqlserver.entities.StockEntity;
import co.com.corsan.sqlserver.repository.PreciosDBRepository;
import co.com.corsan.sqlserver.repository.ProductosDBRepository;
import co.com.corsan.sqlserver.repository.StockDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosDBAdapter implements ProductosRepository {

    private final PreciosDBRepository preciosDBRepository;

    private final StockDBRepository stockDBRepository;

    private final ProductosDBRepository productosDBRepository;

    public ProductosDBAdapter(PreciosDBRepository preciosDBRepository, StockDBRepository stockDBRepository, ProductosDBRepository productosDBRepository) {
        this.preciosDBRepository = preciosDBRepository;
        this.stockDBRepository = stockDBRepository;
        this.productosDBRepository = productosDBRepository;
    }


    @Override
    public List<Precios> consultarPrecios() {
        List<PreciosEntity> precios = this.preciosDBRepository.findAll();
        if (!precios.isEmpty()) {
            return Mapper.mapAll(precios, Precios.class);
        }
        return new ArrayList<>();

    }

    @Override
    public List<Stock> consultarStock() {
        List<StockEntity> stock = this.stockDBRepository.findAll();
        if (!stock.isEmpty()) {
            return Mapper.mapAll(stock, Stock.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<Productos> consultarProductos() {
        List<ProductosEntity> productos = this.productosDBRepository.findAll();
        if (!productos.isEmpty()) {
            return Mapper.mapAll(productos, Productos.class);
        }
        return new ArrayList<>();
    }
}
