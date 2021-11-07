package com.edwinpaezalonso.visitando.model;

public class Lugar {
    private String nombre;
    private String foto;
    private String descripcion;
    private String direccion;
    private String informacion;
    private String precio;
    private String horario;

    public Lugar(String nombre, String foto, String descripcion, String direccion, String informacion,
                 String precio, String horario){
        this.nombre=nombre;
        this.foto=foto;
        this.descripcion=descripcion;
        this.direccion=direccion;
        this.informacion=informacion;
        this.precio=precio;
        this.horario=horario;

    }

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getHorario() {
        return horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", foto='" + foto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", informacion='" + informacion + '\'' +
                ", precio='" + precio + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
