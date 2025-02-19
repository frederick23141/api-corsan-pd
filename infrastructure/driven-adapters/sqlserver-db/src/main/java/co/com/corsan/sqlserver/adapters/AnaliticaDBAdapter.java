package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.DetalleAnalitica;
import co.com.corsan.domain.repositories.AnaliticaRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.DetalleAnaliticaEntity;
import co.com.corsan.sqlserver.repository.AnaliticaDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AnaliticaDBAdapter implements AnaliticaRepository {

    private final AnaliticaDBRepository analiticaDBRepository;


    public AnaliticaDBAdapter(AnaliticaDBRepository analiticaDBRepository) {
        this.analiticaDBRepository = analiticaDBRepository;
    }

    @Override
    public List<DetalleAnalitica> consultarDetalleAnalitica() {
        List<DetalleAnaliticaEntity> detalles = this.analiticaDBRepository.findAll();
        if (!detalles.isEmpty()) {
            return Mapper.mapAll(detalles, DetalleAnalitica.class);
        }
        return new ArrayList<>();
    }
}
