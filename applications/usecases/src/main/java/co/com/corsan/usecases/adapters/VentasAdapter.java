package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.domain.repositories.VentasRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.VentasPort;

import java.util.List;

public class VentasAdapter implements VentasPort {

    private final VentasRepository ventasRepository;

    public VentasAdapter(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @Override
    public List<SeguimientoVentasPptoVentasResponse> consultarSeguimientoVentasPpto() {
        return Mapper.mapAll(this.ventasRepository.consultarSeguimientoVentasPpto(), SeguimientoVentasPptoVentasResponse.class);
    }

}
