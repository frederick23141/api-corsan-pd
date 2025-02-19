package co.com.corsan.usecases.adapters;

import co.com.corsan.domain.presenters.DocumentosLinPedResponse;
import co.com.corsan.domain.presenters.DocumentosPedResponse;
import co.com.corsan.domain.repositories.DocumentosRepository;
import co.com.corsan.domain.requesters.DocumentosLinPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedConsultaRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.usecases.ports.DocumentosPort;
import org.springframework.core.env.Environment;

import java.util.List;

public class DocumentosAdapter implements DocumentosPort {
    private final DocumentosRepository documentosRepository;
    private final Environment env;

    public DocumentosAdapter(DocumentosRepository documentosRepository,
                             Environment env) {
        this.documentosRepository = documentosRepository;
        this.env = env;
    }

    @Override
    public DocumentosPedResponse consultarDocumentosPed(DocumentosPedConsultaRequest id) {
        return Mapper.map(this.documentosRepository.consultarDocumentosPed(id.getId()), DocumentosPedResponse.class);
    }

    @Override
    public List<DocumentosPedResponse> guardarDocumentosPed(List<DocumentosPedRequest> documentos) {
        Long ultimoNumero = this.documentosRepository.consultarMAXDocumentosPed();

        if (ultimoNumero == null) {
            ultimoNumero = 0L; // En caso de que no haya registros, empezar desde 0
        }

        for (DocumentosPedRequest documento : documentos) {

            //if (Objects.isNull(documento.getNumero())) {
            ultimoNumero++; // Incrementas el número para el próximo documento
            documento.setNumero(ultimoNumero);
            //}

        }

        return Mapper.mapAll(this.documentosRepository.guardarDocumentosPed(documentos), DocumentosPedResponse.class);
    }

    @Override
    public DocumentosLinPedResponse consultarDocumentosLinPed(DocumentosLinPedConsultaRequest id) {
        return Mapper.map(this.documentosRepository.consultarDocumentosLinPed(id.getId()), DocumentosLinPedResponse.class);
    }

    @Override
    public List<DocumentosLinPedResponse> guardarDocumentosLinPed(List<DocumentosLinPedRequest> documentos) {
        return Mapper.mapAll(this.documentosRepository.guardarDocumentosLinPed(documentos), DocumentosLinPedResponse.class);
    }
}
