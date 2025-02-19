package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.SeguimientoVentasPptoVentas;
import co.com.corsan.domain.common.Vendedores;
import co.com.corsan.domain.common.VentasAnoMesVendedor;

import java.util.List;

public interface VendedoresRepository {

    List<Vendedores> consultarVendedores();

    List<VentasAnoMesVendedor> consultarVentas();

    List<SeguimientoVentasPptoVentas> consultarSeguimientoVentasPptoVentas();
}
