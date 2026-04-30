package Modelo;

import Control.ArregloLibros;

public class Categoria {

    private int codCategoria;
    private String nombreCategoria;
    private String valoracion;
    private ArregloLibros objLibros;

    public Categoria(int CodCategoria, String nombreCategoria, String valoracion) {
        this.codCategoria = CodCategoria;
        this.nombreCategoria = nombreCategoria;
        this.valoracion = valoracion;
        objLibros = new ArregloLibros();
    }
    
    public Object[] getRegistro() {
        return new Object[]{codCategoria,nombreCategoria,valoracion};
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int CodCategoria) {
        this.codCategoria = CodCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public ArregloLibros getObjLibros() {
        return objLibros;
    }

    public void setObjLibros(ArregloLibros objLibros) {
        this.objLibros = objLibros;
    }

    

    
}
