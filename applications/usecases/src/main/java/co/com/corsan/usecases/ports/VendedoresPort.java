package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.domain.presenters.VendedoresResponse;
import co.com.corsan.domain.presenters.VentasAnoMesVendedorResponse;

import java.util.List;

public interface VendedoresPort {

    List<VendedoresResponse> consultarVendedores();

    List<VentasAnoMesVendedorResponse> consultarVentas();

    List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPptoVentas();
}
