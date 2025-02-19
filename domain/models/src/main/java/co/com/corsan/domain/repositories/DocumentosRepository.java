package co.com.corsan.domain.repositories;

import co.com.corsan.domain.common.DocumentosLinPed;
import co.com.corsan.domain.common.DocumentosPed;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;

import java.util.List;

public interface DocumentosRepository {

    DocumentosPed consultarDocumentosPed(Long id);

    Long consultarMAXDocumentosPed();

    List<DocumentosPed> guardarDocumentosPed(List<DocumentosPedRequest> documentos);

    DocumentosLinPed consultarDocumentosLinPed(Long id);

    List<DocumentosLinPed> guardarDocumentosLinPed(List<DocumentosLinPedRequest> documentos);
}
