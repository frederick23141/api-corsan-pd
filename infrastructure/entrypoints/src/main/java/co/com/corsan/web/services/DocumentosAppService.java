package co.com.corsan.web.services;

import co.com.corsan.domain.presenters.DocumentosLinPedResponse;
import co.com.corsan.domain.presenters.DocumentosPedResponse;
import co.com.corsan.domain.requesters.DocumentosLinPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;
import co.com.corsan.usecases.ports.DocumentosPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DocumentosAppService {

    private final DocumentosPort documentosPort;

    public DocumentosAppService(DocumentosPort documentosPort) {
        this.documentosPort = documentosPort;
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public DocumentosPedResponse consultarDocumentosPed(DocumentosPedConsultaRequest id) {
        return this.documentosPort.consultarDocumentosPed(id);
    }

    @Transactional(value = "controlTransactionManager", readOnly = false, rollbackFor = Exception.class)
    public List<DocumentosPedResponse> guardarDocumentosPed(List<DocumentosPedRequest> documentos) {
        return this.documentosPort.guardarDocumentosPed(documentos);
    }

    @Transactional(value = "controlTransactionManager", readOnly = true, rollbackFor = Exception.class)
    public DocumentosLinPedResponse consultarDocumentosLinPed(DocumentosLinPedConsultaRequest id) {
        return this.documentosPort.consultarDocumentosLinPed(id);
    }

    @Transactional(value = "controlTransactionManager", readOnly = false, rollbackFor = Exception.class)
    public List<DocumentosLinPedResponse> guardarDocumentosLinPed(List<DocumentosLinPedRequest> documentos) {
        return this.documentosPort.guardarDocumentosLinPed(documentos);
    }
}
