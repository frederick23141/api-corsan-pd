package co.com.corsan.sqlserver.repository;


import co.com.corsan.domain.common.embeddedPK.CiudadesDptoDTOPK;
import co.com.corsan.sqlserver.entities.CiudadesDptoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 @Repository
public interface CiudadesDptoDBRepository extends JpaRepository<CiudadesDptoEntity,co.com.corsan.sqlserver.entities.embeddedPK.PiCiudadesDptoPK> {

}

