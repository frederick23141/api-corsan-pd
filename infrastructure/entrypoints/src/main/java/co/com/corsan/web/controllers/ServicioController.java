package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.presenters.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    public ServicioController() {
    }

    @GetMapping(value = "/verificar-servicio-disponible", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse> verificarServicioDisponible() {
        GeneralResponse genericResponse =
                GeneralResponse.builder().build();

        try {
            genericResponse.setRespuesta("ACTIVO");
            genericResponse.setCodigo(CorsanEnumCodigos.OK.toString());
            ResponseEntity.status(HttpStatus.OK).body(null);

        } catch (Exception e) {
            genericResponse.setRespuesta("INACTIVO");
            genericResponse.setCodigo(CorsanEnumCodigos.DETIENE.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }

}
