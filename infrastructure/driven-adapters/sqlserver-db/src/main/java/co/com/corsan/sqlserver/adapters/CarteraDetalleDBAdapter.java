package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.CarteraDetalle;
import co.com.corsan.domain.repositories.CarteraDetalleRepository;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.CarteraDetalleEntity;
import co.com.corsan.sqlserver.repository.CarteraDetalleDBRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarteraDetalleDBAdapter implements CarteraDetalleRepository {


    private final CarteraDetalleDBRepository carteraDetalleDBRepository;

    public CarteraDetalleDBAdapter(CarteraDetalleDBRepository carteraDetalleDBRepository) {
        this.carteraDetalleDBRepository = carteraDetalleDBRepository;
    }

    @Override
    public List<CarteraDetalle> consultarCarteraDetalle() {

        List<CarteraDetalleEntity> cartera = this.carteraDetalleDBRepository.findAll();
        if (!cartera.isEmpty()) {
            return Mapper.mapAll(cartera, CarteraDetalle.class);
        }
        return new ArrayList<>();
    }
}
