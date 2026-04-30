package modelo;

public class Libro {
    private String ISBN,Titulo,Autor,Editorial;
    double precio;
    int stock;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, String Editorial, double precio, int stock) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.precio = precio;
        this.stock = stock;
    }

    public Object[] getRegistro() {
        return new Object[]{ISBN,Titulo,Autor,Editorial,precio,stock};
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
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

    
}
