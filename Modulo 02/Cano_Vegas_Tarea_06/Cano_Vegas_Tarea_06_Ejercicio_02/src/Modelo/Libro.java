package Modelo;

public class Libro {
    private int codigoLibro;
    private String titulo,autor;
    private int cantidadPrestamos;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadPrestamos = 0;
    }

    public Object[] getRegistro() {
        return new Object[]{codigoLibro,titulo,autor,cantidadPrestamos};
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    public void setCantidadPrestamos(int cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }
    
    
}
