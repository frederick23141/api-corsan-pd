package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.domain.presenters.SeguimientoVentasPptoVentasResponse;
import co.com.corsan.web.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/ventas")
public class VentasController {

    private final VentasService ventasService;

    @Autowired
    public VentasController(VentasService ventasService) {
        this.ventasService = ventasService;
    }

    @GetMapping(value = "/consultar-seguimiento-ventas-ppto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<SeguimientoVentasPptoVentasResponse>>> consultarSeguimientoVentasPpto() {
        GeneralResponse<List<SeguimientoVentasPptoVentasResponse>> genericResponse =
                GeneralResponse.<List<SeguimientoVentasPptoVentasResponse>>builder().build();

        try {

            List<SeguimientoVentasPptoVentasResponse> response = ventasService.consultarSeguimientoVentasPpto();
            if (!response.isEmpty()) {
                genericResponse.setRespuesta(response);
                genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            } else {
                genericResponse.setRespuesta(null);
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