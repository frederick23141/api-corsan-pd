package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.VentasAnoMesVendedorEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.VentasAnoMesVendedorPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasAnoMesVendedorRepository extends JpaRepository<VentasAnoMesVendedorEntity, VentasAnoMesVendedorPk> {

}
