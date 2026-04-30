package Modelo;

public class Computadora {
    private String codigo;
    private String modelo;
    private String marca;
    private String procesador;
    private String memoria_ram;
    private double precio_alquiler;

    public Computadora() {
    }

    public Computadora(String codigo, String modelo, String marca, String procesador, String memoria_ram, double precio_alquiler) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.procesador = procesador;
        this.memoria_ram = memoria_ram;
        this.precio_alquiler = precio_alquiler;
    }
    
    public Object[] getRegistro_Computadora(){
        return new Object[]{codigo, modelo, marca, procesador, memoria_ram, precio_alquiler};
    }
    
    public String getCadena(){
        return codigo + modelo + marca + procesador + memoria_ram + precio_alquiler;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(String memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public double getPrecio_alquiler() {
        return precio_alquiler;
    }

    public void setPrecio_alquiler(double precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }
    
    
}
