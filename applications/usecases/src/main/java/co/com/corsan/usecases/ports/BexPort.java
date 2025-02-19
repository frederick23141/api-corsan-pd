package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.BexDetalleFacturaCarteraResponse;
import co.com.corsan.domain.presenters.BexPagosTramitesResponse;
import co.com.corsan.domain.presenters.BexPendientesFacturasResponse;
import co.com.corsan.domain.presenters.BexTramitesResponse;
import co.com.corsan.domain.requesters.BexPendientesFacturaRequest;

import java.util.List;

public interface BexPort {

    List<BexPendientesFacturasResponse> consultarPendientesFacturas(BexPendientesFacturaRequest bexPendientesFacturaRequest);

    List<BexTramitesResponse> consultarTramites();

    List<BexDetalleFacturaCarteraResponse> consultarDetalleFacturaCartera();

    List<BexPagosTramitesResponse> consultarPagosTramites();

}
