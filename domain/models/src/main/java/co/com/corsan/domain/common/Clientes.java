package co.com.corsan.domain.common;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Clientes {


    public BigDecimal nit;
    public Integer bloqueo;
    public Integer digito;
    public BigDecimal nitReal;
    public String nombres;
    public String razonComercial;
    public String direccion;
    public Long vendedor;
    public BigDecimal cupoCredito;
    public String telefonoUno;
    public String celular;
    public String idActividad;
    public String actividadCliente;
    public String idRegion;
    public String region;
    public String idCanal;
    public String canal;
    public Integer lista;
    public String idRuta;
    public String ruta;
    public String diasCred;
    public String mail;
    public String secVisita;
    public String fecActDoc;
    public String yDepartamento;
    public String nombreDepartamento;
    public String ciudad;
    public String idRutaDos;
    public String idRutaTres;
    public String clave;
    public Long tipoUsuario;
    public String yCiudad;
    public LocalDateTime fechaModificacion;
    public String tipo;
    public BigDecimal cupoAdicional;
    public BigDecimal cupoTotalMargen;
    public BigDecimal saldoCartera;
    public BigDecimal dispSinPte;
    public BigDecimal cupoTotal;
    public BigDecimal valorPendientes;
    public BigDecimal saldoFavor;
    public Double disponible;
    public String docVencidos;
    public String nombreVendedor;
    public String territorio;
    public String tipoTercero;
    public String sector;
    public Long promDiasPago;
    public Long promDiasCartera;
    public String infoCupoDisponible;
    public String quienCompra;
    public String telQuienCompra;
    public String mailQuienCompra;
    private LocalDateTime fechaCreacion;
}
