package co.com.corsan.usecases.ports;

import co.com.corsan.domain.presenters.DocumentosLinPedResponse;
import co.com.corsan.domain.presenters.DocumentosPedResponse;
import co.com.corsan.domain.requesters.DocumentosLinPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;

import java.util.List;

public interface DocumentosPort {

    DocumentosPedResponse consultarDocumentosPed(DocumentosPedConsultaRequest id);

    List<DocumentosPedResponse> guardarDocumentosPed(List<DocumentosPedRequest> documentos);

    DocumentosLinPedResponse consultarDocumentosLinPed(DocumentosLinPedConsultaRequest id);

    List<DocumentosLinPedResponse> guardarDocumentosLinPed(List<DocumentosLinPedRequest> documentos);
}
