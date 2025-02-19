package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.PreciosEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.PreciosPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreciosDBRepository extends JpaRepository<PreciosEntity, PreciosPK> {


}
