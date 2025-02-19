package co.com.corsan.sqlserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@ToString
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pi_clientes")
public class ClientesEntity implements Serializable {

    @Id
    @Column(name = "nit")
    public BigDecimal nit;
    @Column(name = "bloqueo")
    public Integer bloqueo;
    @Column(name = "digito")
    public Integer digito;
    @Column(name = "nit_real")
    public BigDecimal nitReal;
    @Column(name = "nombres")
    public String nombres;
    @Column(name = "razon_comercial")
    public String razonComercial;
    @Column(name = "direccion")
    public String direccion;
    @Column(name = "vendedor")
    public Long vendedor;
    @Column(name = "cupo_credito")
    public BigDecimal cupoCredito;
    @Column(name = "telefono_1")
    public String telefonoUno;
    @Column(name = "celular")
    public String celular;
    @Column(name = "id_actividad")
    public String idActividad;
    @Column(name = "actividad_cliente")
    public String actividadCliente;
    @Column(name = "id_region")
    public String idRegion;
    @Column(name = "region")
    public String region;
    @Column(name = "id_canal")
    public String idCanal;
    @Column(name = "canal")
    public String canal;
    @Column(name = "lista")
    public Integer lista;
    @Column(name = "id_ruta")
    public String idRuta;
    @Column(name = "ruta")
    public String ruta;
    @Column(name = "dias_cred")
    public String diasCred;
    @Column(name = "mail")
    public String mail;
    @Column(name = "sec_visita")
    public String secVisita;
    @Column(name = "fec_act_doc")
    public String fecActDoc;
    @Column(name = "y_dpto")
    public String yDepartamento;
    @Column(name = "nomdpto")
    public String nombreDepartamento;
    @Column(name = "ciudad")
    public String ciudad;
    @Column(name = "id_ruta2")
    public String idRutaDos;
    @Column(name = "id_ruta3")
    public String idRutaTres;
    @Column(name = "clave")
    public String clave;
    @Column(name = "tipo_usuario")
    public Long tipoUsuario;
    @Column(name = "y_ciudad")
    public String yCiudad;
    @Column(name = "fecha_modificacion")
    public LocalDateTime fechaModificacion;
    @Column(name = "tipo")
    public String tipo;
    @Column(name = "Cupo_adicional")
    public BigDecimal cupoAdicional;
    @Column(name = "Cupo_totalmargen")
    public BigDecimal cupoTotalMargen;
    @Column(name = "saldo_cartera")
    public BigDecimal saldoCartera;
    @Column(name = "dispsinpte")
    public BigDecimal dispSinPte;
    @Column(name = "Cupo_total")
    public BigDecimal cupoTotal;
    @Column(name = "vr_ptes")
    public BigDecimal valorPendientes;
    @Column(name = "saldo_favor")
    public BigDecimal saldoFavor;
    @Column(name = "disponible")
    public Double disponible;
    @Column(name = "Doc_vencidos")
    public String docVencidos;
    @Column(name = "nombre_vendedor")
    public String nombreVendedor;
    @Column(name = "territorio")
    public String territorio;
    @Column(name = "tipo_tercero")
    public String tipoTercero;
    @Column(name = "sector")
    public String sector;
    @Column(name = "prom_dias_pago")
    public Long promDiasPago;
    @Column(name = "Prom_dias_cartera")
    public Long promDiasCartera;
    @Column(name = "Info_Cupo_Disponible")
    public String infoCupoDisponible;
    @Column(name = "Quien_compra")
    public String quienCompra;
    @Column(name = "Tel_Quien_compra")
    public String telQuienCompra;
    @Column(name = "Mail_Quien_compra")
    public String mailQuienCompra;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
}
