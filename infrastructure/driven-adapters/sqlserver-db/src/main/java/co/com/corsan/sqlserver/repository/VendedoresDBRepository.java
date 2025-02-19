package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.VendedoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VendedoresDBRepository extends JpaRepository<VendedoresEntity, Long> {

}
