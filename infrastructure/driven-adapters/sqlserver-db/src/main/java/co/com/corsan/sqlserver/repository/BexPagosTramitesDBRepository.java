package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.BexPagosTramitesEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.BexPagosTramitesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BexPagosTramitesDBRepository extends JpaRepository<BexPagosTramitesEntity, BexPagosTramitesPK> {

}
