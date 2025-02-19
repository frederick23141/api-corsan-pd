package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.domain.presenters.VendedoresResponse;
import co.com.corsan.domain.presenters.VentasAnoMesVendedorResponse;
import co.com.corsan.domain.repositories.VendedoresRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.VendedoresPort;

import java.util.List;

public class VendedoresAdapter implements VendedoresPort {

    private final VendedoresRepository vendedoresRepository;

    public VendedoresAdapter(VendedoresRepository vendedoresRepository) {
        this.vendedoresRepository = vendedoresRepository;
    }

    @Override
    public List<VendedoresResponse> consultarVendedores() {
        return Mapper.mapAll(this.vendedoresRepository.consultarVendedores(), VendedoresResponse.class);
    }

    @Override
    public List<VentasAnoMesVendedorResponse> consultarVentas() {
        return Mapper.mapAll(this.vendedoresRepository.consultarVentas(), VentasAnoMesVendedorResponse.class);
    }

    @Override
    public List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPptoVentas() {
        return Mapper.mapAll(this.vendedoresRepository.consultarSeguimientoVentasPptoVentas(), SeguimientoVentasPptoVentasResponse.class);
    }


}
