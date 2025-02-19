package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.SeguimientoVentasPptoVentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguimientoVentasPptoVentasDBRepository extends JpaRepository<SeguimientoVentasPptoVentasEntity, Long> {

}
