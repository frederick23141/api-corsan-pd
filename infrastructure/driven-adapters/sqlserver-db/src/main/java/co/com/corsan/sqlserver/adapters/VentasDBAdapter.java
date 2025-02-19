package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.SeguimientoVentasPptoVentas;
import co.com.corsan.domain.repositories.VentasRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.SeguimientoVentasPptoVentasEntity;
import co.com.corsan.sqlserver.repository.SeguimientoVentasPptoVentasDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VentasDBAdapter implements VentasRepository {

    private final SeguimientoVentasPptoVentasDBRepository seguimientoVentasPptoVentasDBRepository;

    public VentasDBAdapter(SeguimientoVentasPptoVentasDBRepository seguimientoVentasPptoVentasDBRepository) {
        this.seguimientoVentasPptoVentasDBRepository = seguimientoVentasPptoVentasDBRepository;
    }

    @Override
    public List<SeguimientoVentasPptoVentas> consultarSeguimientoVentasPpto() {
        List<SeguimientoVentasPptoVentasEntity> ventas = this.seguimientoVentasPptoVentasDBRepository.findAll();
        if (!ventas.isEmpty()) {
            return Mapper.mapAll(ventas, SeguimientoVentasPptoVentas.class);
        }
        return new ArrayList<>();
    }

}
