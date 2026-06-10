package Modelo;

public class Producto {
    private int codigo_sku;
    private String nombreProducto;
    private int stockDisponible;
    private double precioUnitario;

    public Producto(int codigo_sku, String nombreProducto, int stockDisponible, double precioUnitario) {
        this.codigo_sku = codigo_sku;
        this.nombreProducto = nombreProducto;
        this.stockDisponible = stockDisponible;
        this.precioUnitario = precioUnitario;
    }
    
    public Object[] getRegistro() {
        return  new Object[]{codigo_sku,nombreProducto,stockDisponible,precioUnitario};
    }

    public int getCodigo_sku() {
        return codigo_sku;
    }

    public void setCodigo_sku(int codigo_sku) {
        this.codigo_sku = codigo_sku;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}


