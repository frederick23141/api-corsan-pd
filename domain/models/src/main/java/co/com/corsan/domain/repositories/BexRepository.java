package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.BexDetalleFacturaCartera;
import co.com.corsan.domain.common.BexPagosTramites;
import co.com.corsan.domain.common.BexPendientesFacturas;
import co.com.corsan.domain.common.BexTramites;

import java.util.List;

public interface BexRepository {
    List<BexPendientesFacturas> consultarPendientesFacturas(
            Long numero,
            String codigo,
            Integer bodega,
            Long vendedor,
            String region,
            String ciudad,
            String canal,
            Long nitReal,
            Long nit);

    List<BexTramites> consultarTramites();

    List<BexDetalleFacturaCartera> consultarDetalleFacturaCartera();

    List<BexPagosTramites> consultarPagosTramites();
}
