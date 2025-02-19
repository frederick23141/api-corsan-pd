package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.DetalleAnaliticaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnaliticaDBRepository extends JpaRepository<DetalleAnaliticaEntity, Long> {

}
