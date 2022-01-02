package co.com.davito.bibliotecaReactiva.routes;

import co.com.davito.bibliotecaReactiva.UseCases.UseCaseMostrarRecursos;
import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
@Configuration
public class ListarRecursosRouter {

    @Bean
    public RouterFunction<ServerResponse> listarRecursos(UseCaseMostrarRecursos useCaseMostrarRecursos){
        return route(GET("/recursos").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(useCaseMostrarRecursos.get(), RecursoDTO.class)
        );
    }
}
