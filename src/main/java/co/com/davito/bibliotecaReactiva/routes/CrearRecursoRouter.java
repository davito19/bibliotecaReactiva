package co.com.davito.bibliotecaReactiva.routes;

import co.com.davito.bibliotecaReactiva.UseCases.UseCaseCrearRecurso;
import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CrearRecursoRouter {

    @Bean
    public RouterFunction<ServerResponse> crearRecurso(UseCaseCrearRecurso useCaseCrearRecurso){
        return route(POST("/recurso").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(RecursoDTO.class)
                        .flatMap(recursoDTO -> useCaseCrearRecurso.apply(recursoDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result)))
        );
    }
}
