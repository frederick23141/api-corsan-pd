package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.CarteraDetalleResponse;
import co.com.corsan.domain.repositories.CarteraDetalleRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.CarteraDetallePort;

import java.util.List;

public class CarteraDetalleAdapter implements CarteraDetallePort {

    private final CarteraDetalleRepository carteraDetalleRepository;

    public CarteraDetalleAdapter(CarteraDetalleRepository carteraDetalleRepository) {
        this.carteraDetalleRepository = carteraDetalleRepository;
    }


    @Override
    public List<CarteraDetalleResponse> consultarCarteraDetalle() {
        return Mapper.mapAll(
                this.carteraDetalleRepository.consultarCarteraDetalle(), CarteraDetalleResponse.class);
    }
}
