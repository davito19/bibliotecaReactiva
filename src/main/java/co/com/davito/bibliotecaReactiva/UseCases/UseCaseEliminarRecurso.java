package co.com.davito.bibliotecaReactiva.UseCases;

import co.com.davito.bibliotecaReactiva.mappers.RecursoMapper;
import co.com.davito.bibliotecaReactiva.repositories.RecursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseEliminarRecurso implements EliminarRecurso{

    private final RecursoRepositorio repositorio;
    private final RecursoMapper mapper;

    @Autowired
    public UseCaseEliminarRecurso(RecursoRepositorio repositorio, RecursoMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return repositorio.deleteById(id);
    }
}
