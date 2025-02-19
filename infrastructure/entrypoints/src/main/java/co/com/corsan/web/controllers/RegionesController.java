package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.CiudadesDptoResponse;
import co.com.corsan.domain.presenters.DepartamentoResponse;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.domain.presenters.PaisesResponse;
import co.com.corsan.web.services.RegionesService;
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
@RequestMapping("/regiones")
public class RegionesController {

    private final RegionesService regionesService;

    @Autowired
    public RegionesController(RegionesService regionesService) {
        this.regionesService = regionesService;
    }

    @GetMapping(value = "/consultar-paises", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<PaisesResponse>>> consultarPaises() {
        GeneralResponse<List<PaisesResponse>> genericResponse =
                GeneralResponse.<List<PaisesResponse>>builder().build();

        try {

            List<PaisesResponse> response = this.regionesService.consultarPaises();
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

    @GetMapping(value = "/consultar-departamentos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<DepartamentoResponse>>> consultarDepartamento() {
        GeneralResponse<List<DepartamentoResponse>> genericResponse =
                GeneralResponse.<List<DepartamentoResponse>>builder().build();

        try {

            List<DepartamentoResponse> response = this.regionesService.consultarDepartamento();
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


    @GetMapping(value = "/consultar-ciudades", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<CiudadesDptoResponse>>> consultarCiudades() {
        GeneralResponse<List<CiudadesDptoResponse>> genericResponse =
                GeneralResponse.<List<CiudadesDptoResponse>>builder().build();

        try {

            List<CiudadesDptoResponse> response = this.regionesService.consultarCiudades();
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
