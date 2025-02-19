package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.DocumentosLinPedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosLinPedDBRepository extends JpaRepository<DocumentosLinPedEntity, Long> {

}