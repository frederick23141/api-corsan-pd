package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.DepartamentoEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.DepartamentoPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoDBRepository extends JpaRepository<DepartamentoEntity, DepartamentoPk> {

}
