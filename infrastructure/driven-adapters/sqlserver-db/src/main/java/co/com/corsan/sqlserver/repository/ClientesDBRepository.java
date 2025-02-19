package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ClientesDBRepository extends JpaRepository<ClientesEntity, BigDecimal> {

}
