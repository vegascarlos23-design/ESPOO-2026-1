package Modelo;

public class Periodico extends ProductoEditorial{
    private String fecha;
    
    public Periodico(int id, String titulo, String autor, double precio, String fecha) {
        super(id, titulo, autor, precio);
        this.fecha = fecha;
    }

    @Override
    public int mostrarTipo() {
        return 4;
    }
    
    @Override
    public Object[] getRegistro() {
        return new Object[]{id,titulo,autor,precio,fecha};
    }

    @Override
    public String getDatoAdicional() {
        return fecha;
    }

}
