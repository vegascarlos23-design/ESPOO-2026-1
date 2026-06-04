package Modelo;

public class Libro {
    private int isbn;
    private String titulo;
    private String genero;
    private int paginas;

    public Libro(int isbn, String titulo, String genero, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
    }
    
    public Object[] getRegistro() {
        return new Object[]{isbn,titulo,genero,paginas};
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    

}
