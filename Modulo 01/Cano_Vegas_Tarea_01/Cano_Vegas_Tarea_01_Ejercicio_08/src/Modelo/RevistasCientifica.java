package Modelo;

public class RevistasCientifica extends ProductoEditorial{
    private String areaInvestigacion;
    
    public RevistasCientifica(int id, String titulo, String autor, double precio, String areaInvestigacion) {
        super(id, titulo, autor, precio);
        this.areaInvestigacion = areaInvestigacion;
    }

    @Override
    public int mostrarTipo() {
        return 3;
    }
    
    @Override
    public Object[] getRegistro() {
        return new Object[]{id,titulo,autor,precio,areaInvestigacion};
    }

    @Override
    public String getDatoAdicional() {
        return areaInvestigacion;
    }

    
}
