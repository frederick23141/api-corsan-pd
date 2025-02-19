package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.DetalleAnalitica;

import java.util.List;

public interface AnaliticaRepository {

    List<DetalleAnalitica> consultarDetalleAnalitica();
}
