package Modelo;

public class LibroImpreso extends ProductoEditorial{
    private int numPaginas;

    public LibroImpreso(int id, String titulo, String autor, double precio, int numPaginas) {
        super(id, titulo, autor, precio);
        this.numPaginas = numPaginas;
    }

    public LibroImpreso() {
    }

    @Override
    public int mostrarTipo() {
        return 1;
    }

    @Override
    public Object[] getRegistro() {
        return new Object[]{id,titulo,autor,precio,numPaginas};
    }

    @Override
    public String getDatoAdicional() {
        return numPaginas+"";
    }

    
    
    
}
