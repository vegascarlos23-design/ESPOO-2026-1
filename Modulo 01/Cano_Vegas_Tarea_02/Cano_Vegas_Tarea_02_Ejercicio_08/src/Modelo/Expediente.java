package Modelo;

public class Expediente {
    private int numero_expediente;
    private String nombre;
    private String fechaInicio;
    private String tipo;

    public Expediente() {
    }

    public Expediente(int numero_expediente, String nombre, String fechaInicio, String tipo) {
        this.numero_expediente = numero_expediente;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.tipo = tipo;
    }
    
    public Object[] getRegistro_Expediente(){
        return new Object[]{numero_expediente, nombre, fechaInicio, tipo};
    }
    
    public int getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(int numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
