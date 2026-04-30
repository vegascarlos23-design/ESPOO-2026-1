package Modelo;

public class Clientes {
private String nombre;
private String tarifa; // Residencial, Comercial
private double consumo;
    public Clientes() {
    }

    public Clientes(String nombre, String tarifa, double consumo) {
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.consumo = consumo;
    }
    
    public Object[] getRegistro(){
        return new Object[]{nombre, tarifa, consumo};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }


}
