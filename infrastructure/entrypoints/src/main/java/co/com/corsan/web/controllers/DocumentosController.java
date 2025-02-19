package co.com.corsan.web.controllers;

import co.com.corsan.domain.enums.CorsanEnumCodigos;
import co.com.corsan.domain.enums.CorsanEnumMensajes;
import co.com.corsan.domain.presenters.DocumentosLinPedResponse;
import co.com.corsan.domain.presenters.DocumentosPedResponse;
import co.com.corsan.domain.presenters.GeneralResponse;
import co.com.corsan.domain.requesters.DocumentosLinPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;
import co.com.corsan.sqlserver.utils.Validation;
import co.com.corsan.web.services.DocumentosAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/documentos")
public class DocumentosController {

    private final DocumentosAppService documentosAppService;

    @Autowired
    public DocumentosController(DocumentosAppService documentosAppService) {
        this.documentosAppService = documentosAppService;
    }

    /**
     * Controlador que permite consultar los documentos ped almacenados
     *
     * @return ResponseEntity<GeneralResponse < DocumentosPedResponse>>
     * @author Jplondon
     * @since 08/11/2023
     */


    @GetMapping(value = "/consultar-documentos-ped", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<DocumentosPedResponse>> consultarDocumentosPed(@RequestBody DocumentosPedConsultaRequest request) {
        GeneralResponse<DocumentosPedResponse> genericResponse =
                GeneralResponse.<DocumentosPedResponse>builder().build();

        String validacion = Validation.validate(request);
        if (validacion != null && !validacion.isEmpty()) {
            genericResponse.setMensaje(validacion);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(genericResponse);
        }

        try {

            DocumentosPedResponse response = documentosAppService.consultarDocumentosPed(request);
            if (!Objects.isNull(response.getId())) {
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
     * Controlador que permite consultar los documentos ped almacenados
     *
     * @return ResponseEntity<GeneralResponse < List < DocumentosPedResponse>>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @PostMapping(value = "/guardar-documentos-ped", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<DocumentosPedResponse>>> guardarDocumentosPed(@RequestBody List<DocumentosPedRequest> documentos) {
        GeneralResponse<List<DocumentosPedResponse>> genericResponse =
                GeneralResponse.<List<DocumentosPedResponse>>builder().build();

        String validacion = Validation.validate(documentos);
        if (validacion != null && !validacion.isEmpty()) {
            genericResponse.setMensaje(validacion);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(genericResponse);
        }

        try {

            List<DocumentosPedResponse> response = documentosAppService.guardarDocumentosPed(documentos);
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
     * Controlador que permite consultar los documentos lin almacenados
     *
     * @return ResponseEntity<GeneralResponse < List < DocumentosLinResponse>>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @PostMapping(value = "/consultar-documentos-lin-ped", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<DocumentosLinPedResponse>> consultarDocumentosLinPed(DocumentosLinPedConsultaRequest id) {
        GeneralResponse<DocumentosLinPedResponse> genericResponse =
                GeneralResponse.<DocumentosLinPedResponse>builder().build();

        String validacion = Validation.validate(id);
        if (validacion != null && !validacion.isEmpty()) {
            genericResponse.setMensaje(validacion);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(genericResponse);
        }

        try {

            DocumentosLinPedResponse response = documentosAppService.consultarDocumentosLinPed(id);
            if (!Objects.isNull(response.getId())) {
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
     * Controlador que permite consultar los documentos ped almacenados
     *
     * @return ResponseEntity<GeneralResponse < List < DocumentosPedResponse>>>
     * @author Jplondon
     * @since 08/11/2023
     */
    @PostMapping(value = "/guardar-documentos-lin-ped", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GeneralResponse<List<DocumentosLinPedResponse>>> guardarDocumentosLinPed(@RequestBody List<DocumentosLinPedRequest> documentos) {
        GeneralResponse<List<DocumentosLinPedResponse>> genericResponse =
                GeneralResponse.<List<DocumentosLinPedResponse>>builder().build();

        String validacion = Validation.validate(documentos);
        if (validacion != null && !validacion.isEmpty()) {
            genericResponse.setMensaje(validacion);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(genericResponse);
        }

        try {

            List<DocumentosLinPedResponse> response = documentosAppService.guardarDocumentosLinPed(documentos);
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
            ///ESTA VALIDACION ME DEVUELVE EL MENSAJE DEL ERROR, VAMOS A VALIDAR ESTE INGRESO.
            // Obtener información detallada del error
            String mensajeError = e.getMessage(); // Mensaje de error
            String claseError = e.getClass().getName(); // Clase de la excepción
            // Puedes agregar más información si lo deseas, como la traza de la pila
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString(); // Traza de la pila
            // Puedes registrar o imprimir la información detallada del error para debug
            System.out.println("Error : " + mensajeError);
            System.out.println("Clase de error : " + claseError);
            System.out.println("StackTrace : " + stackTrace);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
            // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(genericResponse);
    }

}