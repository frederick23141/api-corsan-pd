package co.com.corsan.sqlserver.repository;

import co.com.corsan.sqlserver.entities.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductosDBRepository extends JpaRepository<ProductosEntity, String> {


}
