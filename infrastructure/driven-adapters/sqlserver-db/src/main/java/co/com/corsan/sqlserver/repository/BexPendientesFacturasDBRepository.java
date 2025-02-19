package co.com.corsan.sqlserver.repository;


import co.com.corsan.sqlserver.entities.BexPendientesFacturasEntity;
import co.com.corsan.sqlserver.entities.embeddedPK.BexPendientesFacturaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BexPendientesFacturasDBRepository extends JpaRepository<BexPendientesFacturasEntity, BexPendientesFacturaPK> {
    List<BexPendientesFacturasEntity> findById_Numero(Long numero);

    @Query("SELECT b FROM BexPendientesFacturasEntity b WHERE " +
            "(:numero IS NULL OR b.id.numero = :numero) " +
            "AND (:codigo IS NULL OR b.id.codigo = :codigo) " +
            "AND (:bodega IS NULL OR b.bodega = :bodega) " +
            "AND (:vendedor IS NULL OR b.vendedor = :vendedor) " +
            "AND (:region IS NULL OR b.region = :region) " +
            "AND (:ciudad IS NULL OR b.ciudad = :ciudad) " +
            "AND (:canal IS NULL OR b.canal = :canal) " +
            "AND (:nitReal IS NULL OR b.nitReal = :nitReal) " +
            "AND (:nit IS NULL OR b.nit = :nit)")
    List<BexPendientesFacturasEntity> findPendientesFactura(
            @Param("numero") Long numero,
            @Param("codigo") String codigo,
            @Param("bodega") Integer bodega,
            @Param("vendedor") Long vendedor,
            @Param("region") String region,
            @Param("ciudad") String ciudad,
            @Param("canal") String canal,
            @Param("nitReal") Long nitReal,
            @Param("nit") Long nit);
}
