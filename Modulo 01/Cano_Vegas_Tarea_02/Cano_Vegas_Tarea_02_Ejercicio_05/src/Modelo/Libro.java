package Modelo;

public class Libro {
    private int codCategoria;
    private int idLibro;
    private String Titulo;
    private Categoria categoria;

    public Libro(int codCategoria, int idLibro, String Titulo, Categoria categoria) {
        this.codCategoria = codCategoria;
        this.idLibro = idLibro;
        this.Titulo = Titulo;
        this.categoria = categoria;
    }

    public Object[] getRegistro() {
        return new Object[]{codCategoria,idLibro,Titulo};
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
