package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.BexDetalleFacturaCartera;
import co.com.corsan.domain.common.BexPagosTramites;
import co.com.corsan.domain.common.BexPendientesFacturas;
import co.com.corsan.domain.common.BexTramites;
import co.com.corsan.domain.repositories.BexRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.BexDetalleFacturaCarteraEntity;
import co.com.corsan.sqlserver.entities.BexPagosTramitesEntity;
import co.com.corsan.sqlserver.entities.BexPendientesFacturasEntity;
import co.com.corsan.sqlserver.entities.BexTramitesEntity;
import co.com.corsan.sqlserver.repository.BexDetalleFacturaCarteraDBRepository;
import co.com.corsan.sqlserver.repository.BexPagosTramitesDBRepository;
import co.com.corsan.sqlserver.repository.BexPendientesFacturasDBRepository;
import co.com.corsan.sqlserver.repository.BexTramitesDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BexDBAdapter implements BexRepository {

    private final BexPendientesFacturasDBRepository bexPendientesFacturasDBRepository;

    private final BexTramitesDBRepository bexTramitesDBRepository;

    private final BexDetalleFacturaCarteraDBRepository bexDetalleFacturaCarteraDBRepository;

    private final BexPagosTramitesDBRepository bexPagosTramitesDBRepository;

    public BexDBAdapter(BexPendientesFacturasDBRepository bexPendientesFacturasDBRepository,
                        BexTramitesDBRepository bexTramitesDBRepository,
                        BexDetalleFacturaCarteraDBRepository bexDetalleFacturaCarteraDBRepository,
                        BexPagosTramitesDBRepository bexPagosTramitesDBRepository) {
        this.bexPendientesFacturasDBRepository = bexPendientesFacturasDBRepository;
        this.bexTramitesDBRepository = bexTramitesDBRepository;
        this.bexDetalleFacturaCarteraDBRepository = bexDetalleFacturaCarteraDBRepository;
        this.bexPagosTramitesDBRepository = bexPagosTramitesDBRepository;
    }

    @Override
    public List<BexPendientesFacturas> consultarPendientesFacturas(Long numero,
                                                                   String codigo,
                                                                   Integer bodega,
                                                                   Long vendedor,
                                                                   String region,
                                                                   String ciudad,
                                                                   String canal,
                                                                   Long nitReal,
                                                                   Long nit) {
        List<BexPendientesFacturasEntity> pendientes = this.bexPendientesFacturasDBRepository.findPendientesFactura(numero, codigo,
                bodega,
                vendedor,
                region,
                ciudad,
                canal,
                nitReal,
                nit
        );

        if (!pendientes.isEmpty()) {
            return Mapper.mapAll(pendientes, BexPendientesFacturas.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<BexTramites> consultarTramites() {
        List<BexTramitesEntity> tramite = this.bexTramitesDBRepository.findAll();
        if (!tramite.isEmpty()) {
            return Mapper.mapAll(tramite, BexTramites.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<BexDetalleFacturaCartera> consultarDetalleFacturaCartera() {
        List<BexDetalleFacturaCarteraEntity> detalle = this.bexDetalleFacturaCarteraDBRepository.findAll();
        if (!detalle.isEmpty()) {
            return Mapper.mapAll(detalle, BexDetalleFacturaCartera.class);
        }
        return new ArrayList<>();
    }

    @Override
    public List<BexPagosTramites> consultarPagosTramites() {
        List<BexPagosTramitesEntity> pagos = this.bexPagosTramitesDBRepository.findAll();
        if (!pagos.isEmpty()) {
            return Mapper.mapAll(pagos, BexPagosTramites.class);
        }
        return new ArrayList<>();
    }
}
