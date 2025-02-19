package co.com.corsan.web.controllers;

import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.*;
import co.com.corsan.domain.requesters.BexPendientesFacturaRequest;
import co.com.corsan.sqlserver.utils.Validation;
import co.com.corsan.web.services.BexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/bex")
public class BexController {

    private final BexService bexService;

    @Autowired
    public BexController(BexService bexService) {
        this.bexService = bexService;
    }

    /**
     * Controlador que permite consultar los pendientes facturas almacenados
     *
     * @return ResponseEntity<GeneralResponse < BexPendientesFacturasResponse>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @GetMapping(value = "/consultar-pendientes-facturas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<BexPendientesFacturasResponse>>> consultarPendientesFacturas(@RequestBody BexPendientesFacturaRequest bexPendientesFacturaRequest) {
        GeneralResponse<List<BexPendientesFacturasResponse>> genericResponse =
                GeneralResponse.<List<BexPendientesFacturasResponse>>builder().build();

        String validacion = Validation.validate(bexPendientesFacturaRequest);
        if (validacion != null && !validacion.isEmpty()) {
            genericResponse.setMensaje(validacion);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(genericResponse);
        }

        try {

            List<BexPendientesFacturasResponse> response = this.bexService.consultarPendientesFacturas(bexPendientesFacturaRequest);
            if (!response.isEmpty()) {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            } else {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
                genericResponse.setMensaje(CorsanEnumMensajes.CONSULTARVACIO.getDescripcionError());
            }

        } catch (Exception e) {
            genericResponse.setCodigo(CorsanEnumCodigos.DETIENE.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }

    /**
     * Controlador que permite consultar los tramites almacenados
     *
     * @return ResponseEntity<GeneralResponse < BexTramitesResponse>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @GetMapping(value = "/consultar-tramites", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<BexTramitesResponse>>> consultarTramites() {
        GeneralResponse<List<BexTramitesResponse>> genericResponse =
                GeneralResponse.<List<BexTramitesResponse>>builder().build();

        try {

            List<BexTramitesResponse> response = this.bexService.consultarTramites();
            if (!response.isEmpty()) {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            } else {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
                genericResponse.setMensaje(CorsanEnumMensajes.CONSULTARVACIO.getDescripcionError());
            }

        } catch (Exception e) {
            genericResponse.setCodigo(CorsanEnumCodigos.DETIENE.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }

    /**
     * Controlador que permite consultar los detalles de factura almacenados
     *
     * @return ResponseEntity<GeneralResponse < BexDetalleFacturaCarteraResponse>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @GetMapping(value = "/consultar-detalle-factura-cartera", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<BexDetalleFacturaCarteraResponse>>> consultarDetalleFacturaCartera() {
        GeneralResponse<List<BexDetalleFacturaCarteraResponse>> genericResponse =
                GeneralResponse.<List<BexDetalleFacturaCarteraResponse>>builder().build();

        try {

            List<BexDetalleFacturaCarteraResponse> response = this.bexService.consultarDetalleFacturaCartera();
            if (!response.isEmpty()) {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            } else {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
                genericResponse.setMensaje(CorsanEnumMensajes.CONSULTARVACIO.getDescripcionError());
            }

        } catch (Exception e) {
            genericResponse.setCodigo(CorsanEnumCodigos.DETIENE.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }

    /**
     * Controlador que permite consultar los pagos tramites almacenados
     *
     * @return ResponseEntity<GeneralResponse < BexPagosTramitesResponse>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @GetMapping(value = "/consultar-pagos-tramites", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<BexPagosTramitesResponse>>> consultarPagosTramites() {
        GeneralResponse<List<BexPagosTramitesResponse>> genericResponse =
                GeneralResponse.<List<BexPagosTramitesResponse>>builder().build();

        try {

            List<BexPagosTramitesResponse> response = this.bexService.consultarPagosTramites();
            if (!response.isEmpty()) {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            } else {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
                genericResponse.setMensaje(CorsanEnumMensajes.CONSULTARVACIO.getDescripcionError());
            }

        } catch (Exception e) {
            genericResponse.setCodigo(CorsanEnumCodigos.DETIENE.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }
}
