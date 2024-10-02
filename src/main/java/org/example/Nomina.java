package org.example;

public class Nomina {
    private String idNomina;
    private String idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private double salarioBase;
    private double horasExtras;
    private double deducciones;
    private double totalNeto;
    private String periodoPago;
    private String fechaPago;

    public Nomina() {
    }

    public Nomina(String idNomina, String idEmpleado, String nombreEmpleado, String apellidoEmpleado, double salarioBase, double horasExtras, double deducciones, double totalNeto, String periodoPago, String fechaPago) {
        this.idNomina = idNomina;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.deducciones = deducciones;
        this.totalNeto = totalNeto;
        this.periodoPago = periodoPago;
        this.fechaPago = fechaPago;
    }

    public String getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public String getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(String periodoPago) {
        this.periodoPago = periodoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
}
