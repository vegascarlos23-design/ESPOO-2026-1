package Modelo;

public class Proveedor {
    // Atributos
    private String rucProveedor;
    private String razonSocial;
    private int calificacionServicio;
    private double deudaPendiente;
    
    // Constructor
    public Proveedor(String rucProveedor, String razonSocial, int calificacionServicio) {
        this.rucProveedor = rucProveedor;
        this.razonSocial = razonSocial;
        this.calificacionServicio = calificacionServicio;
        this.deudaPendiente = 0;
    }
    
    // Getters y Setters
    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCalificacionServicio() {
        return calificacionServicio;
    }

    public void setCalificacionServicio(int calificacionServicio) {
        this.calificacionServicio = calificacionServicio;
    }

    public double getDeudaPendiente() {
        return deudaPendiente;
    }

    public void setDeudaPendiente(double deudaPendiente) {
        this.deudaPendiente = deudaPendiente;
    }
    
    // Obtener un registro
    public Object[] getRegistro(){
        return new Object[]{rucProveedor, razonSocial, calificacionServicio, deudaPendiente};
    }
}
