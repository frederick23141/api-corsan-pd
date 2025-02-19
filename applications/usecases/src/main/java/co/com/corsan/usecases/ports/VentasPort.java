package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;

import java.util.List;

public interface VentasPort {

    List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPpto();

}
