package co.com.davito.bibliotecaReactiva.routes;

import co.com.davito.bibliotecaReactiva.UseCases.UseCaseEliminarRecurso;
import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BorrarRecursoRouter {
    @Bean
    public RouterFunction<ServerResponse> borrarRecurso(UseCaseEliminarRecurso useCaseEliminar) {
        return route(DELETE("/recursos/borrar/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(useCaseEliminar.deleteById(request.pathVariable("id")), RecursoDTO.class)
        );
    }
}