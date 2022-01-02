package co.com.davito.bibliotecaReactiva.dtos;

import java.time.LocalDate;

public class RecursoDTO {
    private String id;
    private String nombre;
    private boolean estado;
    private LocalDate fechaPrestamo;
    private String tipo;
    private String tematica;

    public RecursoDTO(){

    }

    public RecursoDTO(String id, String nombre, boolean estado, LocalDate fechaPrestamo, String tipo, String tematica) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaPrestamo = fechaPrestamo;
        this.tipo = tipo;
        this.tematica = tematica;
    }

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
        return "RecursoDto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", tipo='" + tipo + '\'' +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}
