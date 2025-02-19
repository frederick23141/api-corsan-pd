package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.BexTramitesEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.BexTramitesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BexTramitesDBRepository extends JpaRepository<BexTramitesEntity, BexTramitesPK> {

}
