package co.com.davito.bibliotecaReactiva.mappers;

import co.com.davito.bibliotecaReactiva.dtos.RecursoDTO;
import co.com.davito.bibliotecaReactiva.models.Recurso;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

@Component
public class RecursoMapper {

    public Function<RecursoDTO, Recurso> mapperToRecurso() {
        return updateRecurso -> {
            var recurso = new Recurso();
            recurso.setId(updateRecurso.getId());
            recurso.setNombre(updateRecurso.getNombre());
            recurso.setEstado(updateRecurso.isEstado());
            recurso.setFechaPrestamo(updateRecurso.getFechaPrestamo());
            recurso.setTematica(updateRecurso.getTematica());
            recurso.setTipo(updateRecurso.getTipo());
            return recurso;
        };
    }

    public Function<Recurso, RecursoDTO> mapRecursoToDTO() {
        return entity -> new RecursoDTO(
                entity.getId(),
                entity.getNombre(),
                entity.isEstado(),
                entity.getFechaPrestamo(),
                entity.getTipo(),
                entity.getTematica()
        );
    }


    public Recurso fromDTO(RecursoDTO dto){
        Recurso recurso = new Recurso();
        recurso.setId(dto.getId());
        recurso.setNombre(dto.getNombre());
        recurso.setEstado(dto.isEstado());
        recurso.setFechaPrestamo(dto.getFechaPrestamo());
        recurso.setTipo(dto.getTipo());
        recurso.setTematica(dto.getTematica());
        return recurso;
    }

    public RecursoDTO fromCollection(Recurso collection){
        RecursoDTO recursoDto = new RecursoDTO();
        recursoDto.setId(collection.getId());
        recursoDto.setNombre(collection.getNombre());
        recursoDto.setEstado(collection.isEstado());
        recursoDto.setFechaPrestamo(collection.getFechaPrestamo());
        recursoDto.setTipo(collection.getTipo());
        recursoDto.setTematica(collection.getTematica());
        return recursoDto;
    }

    public List<RecursoDTO> fromCollectionsList(List<Recurso> collections) {
        if (collections == null) return null;
        List<RecursoDTO> list = new ArrayList<>(collections.size());
        Iterator listTracks = collections.iterator();

        while (listTracks.hasNext()){
            Recurso recurso = (Recurso) listTracks.next();
            list.add(fromCollection(recurso));
        }

        return list;
    }
}
