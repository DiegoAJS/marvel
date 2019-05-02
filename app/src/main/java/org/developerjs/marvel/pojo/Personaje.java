package org.developerjs.marvel.pojo;

public class Personaje extends Item {

    private String nombre;
    private String foto;
    private String estado;
    private String descripcion;

    public Personaje() {
    }

    public Personaje(String nombre, String foto, String estado, String descripcion) {
        this.nombre = nombre;
        this.foto = foto;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
