package Modelo;

public class Herramienta {
    private int codigo_barras;
    private String descripcion;
    private String categoria;
    private int stock;

    public Herramienta(int codigo_barras, String descripcion, String categoria, int stock) {
        this.codigo_barras = codigo_barras;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.stock = stock;
    }
    
    public Object[] getRegistro() {
        return new Object[]{codigo_barras,descripcion,categoria,stock};
    }

    public int getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(int codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

}
