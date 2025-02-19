package co.com.corsan.sqlserver.adapters;

import co.com.corsan.domain.common.DocumentosLinPed;
import co.com.corsan.domain.common.DocumentosPed;
import co.com.corsan.domain.repositories.DocumentosRepository;
import co.com.corsan.domain.requesters.DocumentosLinPedRequest;
import co.com.corsan.domain.requesters.DocumentosPedRequest;
import co.com.corsan.domain.utils.Mapper;
import co.com.corsan.sqlserver.entities.DocumentosLinPedEntity;
import co.com.corsan.sqlserver.entities.DocumentosPedEntity;
import co.com.corsan.sqlserver.repository.DocumentosLinPedDBRepository;
import co.com.corsan.sqlserver.repository.DocumentosPedDBRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentosDBAdapter implements DocumentosRepository {

    private final DocumentosPedDBRepository documentosPedDBRepository;
    private final DocumentosLinPedDBRepository documentosLinPedDBRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public DocumentosDBAdapter(DocumentosPedDBRepository documentosPedDBRepository,
                               DocumentosLinPedDBRepository documentosLinPedDBRepository) {
        this.documentosPedDBRepository = documentosPedDBRepository;
        this.documentosLinPedDBRepository = documentosLinPedDBRepository;
    }

    @Override
    public DocumentosPed consultarDocumentosPed(Long id) {
        return this.documentosPedDBRepository
                .findById(id)
                .map(documento -> Mapper.map(documento, DocumentosPed.class))
                .orElse(new DocumentosPed());
    }

    @Override
    public Long consultarMAXDocumentosPed() {
        return this.documentosPedDBRepository.consultarMAXDocumentosPed();
    }

    @Override
    public List<DocumentosPed> guardarDocumentosPed(List<DocumentosPedRequest> documentos) {

        return Mapper.mapAll(this.documentosPedDBRepository.saveAllAndFlush(Mapper.mapAll(documentos, DocumentosPedEntity.class)), DocumentosPed.class);
    }

    @Override
    public DocumentosLinPed consultarDocumentosLinPed(Long id) {
        return this.documentosLinPedDBRepository
                .findById(id)
                .map(documentoLinPed -> Mapper.map(documentoLinPed, DocumentosLinPed.class))
                .orElse(new DocumentosLinPed());

    }

    @Override
    public List<DocumentosLinPed> guardarDocumentosLinPed(List<DocumentosLinPedRequest> documentos) {
        return Mapper.mapAll(this.documentosLinPedDBRepository.saveAllAndFlush(Mapper.mapAll(documentos, DocumentosLinPedEntity.class)), DocumentosLinPed.class);
    }
}
