package co.com.davito.bibliotecaReactiva.repositories;

import co.com.davito.bibliotecaReactiva.models.Recurso;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecursoRepositorio extends ReactiveMongoRepository<Recurso, String> {
}
