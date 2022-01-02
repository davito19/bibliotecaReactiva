package co.com.davito.bibliotecaReactiva.UseCases;

import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarRecurso {
    public Mono<RecursoDTO> apply(RecursoDTO recursoDTO);
}
