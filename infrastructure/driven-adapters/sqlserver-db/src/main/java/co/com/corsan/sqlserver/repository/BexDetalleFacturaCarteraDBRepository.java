package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.BexDetalleFacturaCarteraEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.BexDetalleFacturaCarteraPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BexDetalleFacturaCarteraDBRepository extends JpaRepository<BexDetalleFacturaCarteraEntity, BexDetalleFacturaCarteraPK> {
}
