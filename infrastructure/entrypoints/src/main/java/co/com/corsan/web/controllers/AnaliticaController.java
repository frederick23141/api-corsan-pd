package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.DetalleAnaliticaResponse;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.web.services.AnaliticaService;
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
@RequestMapping("/analitica")
public class AnaliticaController {

    private final AnaliticaService analiticaService;

    @Autowired
    public AnaliticaController(AnaliticaService analiticaService) {
        this.analiticaService = analiticaService;
    }

    @GetMapping(value = "/consultar-detalle-analitica", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<DetalleAnaliticaResponse>>> consultarDetalleAnalitica() {
        GeneralResponse<List<DetalleAnaliticaResponse>> genericResponse =
                GeneralResponse.<List<DetalleAnaliticaResponse>>builder().build();

        try {

            List<DetalleAnaliticaResponse> response = analiticaService.consultarDetalleAnalitica();
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
