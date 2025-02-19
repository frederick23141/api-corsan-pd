package co.com.corsan.web.controllers;


import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.domain.presenters.PreciosResponse;
import co.com.corsan.domain.presenters.ProductosResponse;
import co.com.corsan.domain.presenters.StockResponse;
import co.com.corsan.web.services.ProductosService;
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
@RequestMapping("/productos")
public class ProductosController {

    private final ProductosService productosService;

    @Autowired
    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }

    @GetMapping(value = "/consultar-precios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<PreciosResponse>>> consultarPrecios() {
        GeneralResponse<List<PreciosResponse>> genericResponse =
                GeneralResponse.<List<PreciosResponse>>builder().build();

        try {

            List<PreciosResponse> response = productosService.consultarPrecios();
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

    @GetMapping(value = "/consultar-stock", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<StockResponse>>> consultarStock() {
        GeneralResponse<List<StockResponse>> genericResponse =
                GeneralResponse.<List<StockResponse>>builder().build();

        try {

            List<StockResponse> response = productosService.consultarStock();
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

    @GetMapping(value = "/consultar-productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<ProductosResponse>>> consultarProductos() {
        GeneralResponse<List<ProductosResponse>> genericResponse =
                GeneralResponse.<List<ProductosResponse>>builder().build();

        try {

            List<ProductosResponse> response = productosService.consultarProductos();
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
