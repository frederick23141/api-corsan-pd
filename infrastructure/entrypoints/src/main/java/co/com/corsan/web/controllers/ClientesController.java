package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.ClientesResponse;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.web.services.ClientesService;
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
@RequestMapping("/clientes")
public class ClientesController {

    private final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }


    @GetMapping(value = "/consultar-clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<ClientesResponse>>> consultarPaises() {
        GeneralResponse<List<ClientesResponse>> genericResponse =
                GeneralResponse.<List<ClientesResponse>>builder().build();

        try {

            List<ClientesResponse> response = this.clientesService.consultarCliente();
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
