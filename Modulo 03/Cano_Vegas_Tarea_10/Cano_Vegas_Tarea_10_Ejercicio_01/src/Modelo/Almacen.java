package Modelo;

import Control.TreeProductos;

public class Almacen {
    private String nombreAlmacen;
    private TreeProductos productos;

    public Almacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
        productos = new TreeProductos();
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public TreeProductos getProductos() {
        return productos;
    }

    public void setProductos(TreeProductos productos) {
        this.productos = productos;
    }
    
    
    
}
