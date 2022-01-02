package co.com.davito.bibliotecaReactiva.UseCases;

import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import co.com.davito.bibliotecaReactiva.mappers.RecursoMapper;
import co.com.davito.bibliotecaReactiva.repositories.RecursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseBuscarRecurso implements BuscarRecurso{

    private final RecursoRepositorio repositorio;
    private final RecursoMapper mapper;

    @Autowired
    public UseCaseBuscarRecurso(RecursoRepositorio repositorio, RecursoMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Mono<RecursoDTO> findById(String id) {
        return repositorio.findById(id).map(mapper.mapRecursoToDTO());
    }
}
