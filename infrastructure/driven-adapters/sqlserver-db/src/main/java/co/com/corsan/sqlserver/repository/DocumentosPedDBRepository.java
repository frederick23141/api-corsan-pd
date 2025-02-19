package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.DocumentosPedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosPedDBRepository extends JpaRepository<DocumentosPedEntity, Long> {


    @Query("SELECT MAX(d.numero) FROM DocumentosPedEntity d WHERE d.sw = 1")
    Long consultarMAXDocumentosPed();
}