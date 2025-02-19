package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.SeguimientoVentasPptoVentas;
import co.com.corsan.domain.common.Vendedores;
import co.com.corsan.domain.common.VentasAnoMesVendedor;
import co.com.corsan.domain.repositories.VendedoresRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.SeguimientoVentasPptoVentasEntity;
import co.com.corsan.sqlserver.entities.VendedoresEntity;
import co.com.corsan.sqlserver.entities.VentasAnoMesVendedorEntity;
import co.com.corsan.sqlserver.repository.SeguimientoVentasPptoVentasDBRepository;
import co.com.corsan.sqlserver.repository.VendedoresDBRepository;
import co.com.corsan.sqlserver.repository.VentasAnoMesVendedorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VendedoresDBAdapter implements VendedoresRepository {

    private final VendedoresDBRepository vendedoresDBRepository;

    private final VentasAnoMesVendedorRepository ventasAnoMesVendedorRepository;

    private final SeguimientoVentasPptoVentasDBRepository seguimientoVentasPptoVentasDBRepository;


    public VendedoresDBAdapter(VendedoresDBRepository vendedoresDBRepository,
                               VentasAnoMesVendedorRepository ventasAnoMesVendedorRepository,
                               SeguimientoVentasPptoVentasDBRepository seguimientoVentasPptoVentasDBRepository) {
        this.vendedoresDBRepository = vendedoresDBRepository;
        this.ventasAnoMesVendedorRepository = ventasAnoMesVendedorRepository;
        this.seguimientoVentasPptoVentasDBRepository = seguimientoVentasPptoVentasDBRepository;
    }


    @Override
    public List<Vendedores> consultarVendedores() {
        List<VendedoresEntity> vendedores = this.vendedoresDBRepository.findAll();
        if (!vendedores.isEmpty()) {
            return Mapper.mapAll(vendedores, Vendedores.class);
        }
        return new ArrayList<>();
    }


    @Override
    public List<VentasAnoMesVendedor> consultarVentas() {
        List<VentasAnoMesVendedorEntity> ventas = this.ventasAnoMesVendedorRepository.findAll();
        if (!ventas.isEmpty()) {
            return Mapper.mapAll(ventas, VentasAnoMesVendedor.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<SeguimientoVentasPptoVentas> consultarSeguimientoVentasPptoVentas() {
        List<SeguimientoVentasPptoVentasEntity> ventas = this.seguimientoVentasPptoVentasDBRepository.findAll();
        if (!ventas.isEmpty()) {
            return Mapper.mapAll(ventas, SeguimientoVentasPptoVentas.class);
        }
        return new ArrayList<>();
    }
}
