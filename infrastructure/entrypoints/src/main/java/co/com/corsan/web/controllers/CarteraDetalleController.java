package co.com.corsan.web.controllers;

import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.CarteraDetalleResponse;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.web.services.CarteraDetalleService;
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
@RequestMapping("/cartera")
public class CarteraDetalleController {

    private final CarteraDetalleService carteraDetalleService;

    @Autowired
    public CarteraDetalleController(CarteraDetalleService carteraDetalleService) {
        this.carteraDetalleService = carteraDetalleService;
    }

    @GetMapping(value = "/consultar-cartera-detalle", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<CarteraDetalleResponse>>> consultarPrecios() {
        GeneralResponse<List<CarteraDetalleResponse>> genericResponse =
                GeneralResponse.<List<CarteraDetalleResponse>>builder().build();

        try {

            List<CarteraDetalleResponse> response = this.carteraDetalleService.consultarCarteraDetalle();
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
