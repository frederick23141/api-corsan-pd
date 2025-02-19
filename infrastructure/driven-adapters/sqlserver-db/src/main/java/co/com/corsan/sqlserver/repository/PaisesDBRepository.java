package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.PaisesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisesDBRepository extends JpaRepository<PaisesEntity, String> {

}
