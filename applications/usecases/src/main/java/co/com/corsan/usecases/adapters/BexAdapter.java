package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.BexDetalleFacturaCarteraResponse;
import co.com.corsan.domain.presenters.BexPagosTramitesResponse;
import co.com.corsan.domain.presenters.BexPendientesFacturasResponse;
import co.com.corsan.domain.presenters.BexTramitesResponse;
import co.com.corsan.domain.repositories.BexRepository;
import co.com.corsan.domain.requesters.BexPendientesFacturaRequest;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.BexPort;

import java.util.List;

public class BexAdapter implements BexPort {

    private final BexRepository bexRepository;

    public BexAdapter(BexRepository bexRepository) {
        this.bexRepository = bexRepository;
    }

    @Override
    public List<BexPendientesFacturasResponse> consultarPendientesFacturas(BexPendientesFacturaRequest bexPendientesFacturaRequest) {
        return Mapper.mapAll(this.bexRepository.consultarPendientesFacturas(
                bexPendientesFacturaRequest.getNumero(),
                bexPendientesFacturaRequest.getCodigo(),
                bexPendientesFacturaRequest.getBodega(),
                bexPendientesFacturaRequest.getVendedor(),
                bexPendientesFacturaRequest.getRegion(),
                bexPendientesFacturaRequest.getCiudad(),
                bexPendientesFacturaRequest.getCanal(),
                bexPendientesFacturaRequest.getNitReal(),
                bexPendientesFacturaRequest.getNit()), BexPendientesFacturasResponse.class);
    }

    @Override
    public List<BexTramitesResponse> consultarTramites() {
        return Mapper.mapAll(this.bexRepository.consultarTramites(), BexTramitesResponse.class);
    }

    @Override
    public List<BexDetalleFacturaCarteraResponse> consultarDetalleFacturaCartera() {
        return Mapper.mapAll(this.bexRepository.consultarDetalleFacturaCartera(), BexDetalleFacturaCarteraResponse.class);
    }

    @Override
    public List<BexPagosTramitesResponse> consultarPagosTramites() {
        return Mapper.mapAll(this.bexRepository.consultarPagosTramites(), BexPagosTramitesResponse.class);
    }
}
