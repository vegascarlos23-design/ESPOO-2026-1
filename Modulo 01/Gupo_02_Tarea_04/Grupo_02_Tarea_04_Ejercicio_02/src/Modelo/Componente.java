package Modelo;

public class Componente {
    // Atributos
    private int codComponente;
    private String nombrePieza;
    private String marca;
    private double precioUnitario;
    
    // Constructor
    public Componente(int codComponente, String nombrePieza, String marca, double precioUnitario) {
        this.codComponente = codComponente;
        this.nombrePieza = nombrePieza;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
    }
    
    // Getters y Setters
    public int getCodComponente() {
        return codComponente;
    }

    public void setCodComponente(int codComponente) {
        this.codComponente = codComponente;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    // Obtener un registro
    public Object[] getRegistro(){
        return new Object[]{codComponente, nombrePieza, marca, precioUnitario};
    }
}
