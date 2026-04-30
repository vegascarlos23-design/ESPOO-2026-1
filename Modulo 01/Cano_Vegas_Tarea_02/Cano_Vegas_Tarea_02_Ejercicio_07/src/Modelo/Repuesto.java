package Modelo;

public class Repuesto {
    private int id;
    private String nombre;
    private String tipo;
    private String codigo;
    private double precio;
    private int stock;
    private String marca;
    private double peso;
    private String fechaIngreso;
    private String ubicacion;

    public Repuesto() {
    }

    public Repuesto(int id, String nombre, String tipo, String codigo, double precio, int stock, String marca, double peso, String fechaIngreso, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
        this.peso = peso;
        this.fechaIngreso = fechaIngreso;
        this.ubicacion = ubicacion;
    }
    
    public Object[] getRegistro_Repuesto() {
        return new Object[]{id, nombre, tipo, codigo, precio, stock, marca, peso, fechaIngreso, ubicacion};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Override
    public String toString(){
        return marca;
    }
}
