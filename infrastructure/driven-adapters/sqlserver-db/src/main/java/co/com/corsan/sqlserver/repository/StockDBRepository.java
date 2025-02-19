package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockDBRepository extends JpaRepository<StockEntity, String> {

}
