package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.DetalleAnaliticaResponse;
import co.com.corsan.domain.repositories.AnaliticaRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.AnaliticaPort;

import java.util.List;

public class AnaliticaAdapter implements AnaliticaPort {

    private final AnaliticaRepository analiticaRepository;

    public AnaliticaAdapter(AnaliticaRepository analiticaRepository) {
        this.analiticaRepository = analiticaRepository;
    }

    @Override
    public List<DetalleAnaliticaResponse> consultarDetalleAnalitica() {
        return Mapper.mapAll(this.analiticaRepository.consultarDetalleAnalitica(), DetalleAnaliticaResponse.class);
    }
}
