package Modelo;

public class Ebook extends ProductoEditorial{
    private String formato;

    public Ebook(int id, String titulo, String autor, double precio, String formato) {
        super(id, titulo, autor, precio);
        this.formato = formato;
    }
    
    @Override
    public int mostrarTipo() {
        return 2;
    }
    
    @Override
    public Object[] getRegistro() {
        return new Object[]{id,titulo,autor,precio,formato};
    }

    @Override
    public String getDatoAdicional() {
        return formato;
    }
}
