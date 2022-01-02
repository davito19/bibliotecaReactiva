package co.com.davito.bibliotecaReactiva.UseCases;

import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import co.com.davito.bibliotecaReactiva.mappers.RecursoMapper;
import co.com.davito.bibliotecaReactiva.repositories.RecursoRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Service
@Validated
public class UseCaseMostrarRecursos  implements Supplier<Flux<RecursoDTO>> {
    private final RecursoRepositorio repositorio;
    private final RecursoMapper mapper;

    public UseCaseMostrarRecursos(RecursoMapper mapper, RecursoRepositorio  repositorio) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Flux<RecursoDTO> get() {
        return repositorio.findAll().map(mapper.mapRecursoToDTO());
    }
}
