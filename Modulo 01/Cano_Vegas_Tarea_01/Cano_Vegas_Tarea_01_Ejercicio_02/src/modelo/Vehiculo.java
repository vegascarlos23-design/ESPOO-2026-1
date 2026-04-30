package modelo;

public class Vehiculo {
    private String placa,modelo,marca;
    int anio;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int anio) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }
    
    public Object[] getRegistro() {
        return new Object[]{placa,marca,modelo,anio};
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
