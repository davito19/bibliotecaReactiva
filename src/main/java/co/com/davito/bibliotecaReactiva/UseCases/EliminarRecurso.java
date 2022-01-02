package co.com.davito.bibliotecaReactiva.UseCases;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface EliminarRecurso {
    Mono<Void> deleteById(String id);
}
