package org.example;

public class Area {
    private long id;
    private String nombre;
    private String descripcion;
    private String encargado;
    private int numeroEmpleados;
    private String ubicacion;
    private double presupuesto;
    private String telefonoContacto;
    private String emailContacto;
    private String fechaCreacion;
    private boolean activa;

    public Area() {
    }

    public Area(long id, String nombre, String descripcion, String encargado, int numeroEmpleados, String ubicacion, double presupuesto, String telefonoContacto, String emailContacto, String fechaCreacion, boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.encargado = encargado;
        this.numeroEmpleados = numeroEmpleados;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.telefonoContacto = telefonoContacto;
        this.emailContacto = emailContacto;
        this.fechaCreacion = fechaCreacion;
        this.activa = activa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", encargado='" + encargado + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", ubicacion='" + ubicacion + '\'' +
                ", presupuesto=" + presupuesto +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", emailContacto='" + emailContacto + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", activa=" + activa +
                '}';
    }
}
