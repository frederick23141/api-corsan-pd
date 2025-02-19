package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.Precios;
import co.com.corsan.domain.common.Productos;
import co.com.corsan.domain.common.Stock;

import java.util.List;

public interface ProductosRepository {

    List<Precios> consultarPrecios();

    List<Stock> consultarStock();

    List<Productos> consultarProductos();

}
