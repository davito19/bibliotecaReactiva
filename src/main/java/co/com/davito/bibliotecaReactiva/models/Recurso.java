package co.com.davito.bibliotecaReactiva.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Recurso {
    @Id
    private String id;

    private String nombre;
    private boolean estado;
    private LocalDate fechaPrestamo;
    private String tipo;
    private String tematica;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", tipo='" + tipo + '\'' +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}
