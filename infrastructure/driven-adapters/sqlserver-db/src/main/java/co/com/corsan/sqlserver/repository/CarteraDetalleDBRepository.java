package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.CarteraDetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteraDetalleDBRepository extends JpaRepository<CarteraDetalleEntity, Long> {

}
