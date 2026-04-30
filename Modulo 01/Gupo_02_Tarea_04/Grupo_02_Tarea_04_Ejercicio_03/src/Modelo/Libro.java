package Modelo;

public class Libro {
    private String isbn;
    private String tituloLibro;
    private String autor;
    private int anioPublicacion;

    public Libro(String isbn, String tituloLibro, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public Object[] getRegistro() {
        return new Object[]{isbn,tituloLibro,autor,anioPublicacion};
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    
}
