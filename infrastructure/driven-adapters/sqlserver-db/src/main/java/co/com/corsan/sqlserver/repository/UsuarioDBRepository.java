package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDBRepository extends JpaRepository<UsuariosEntity, String> {

}
