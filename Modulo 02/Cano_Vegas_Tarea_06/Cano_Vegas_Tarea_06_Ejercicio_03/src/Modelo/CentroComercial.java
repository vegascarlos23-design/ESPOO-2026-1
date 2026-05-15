package Modelo;

public class CentroComercial {
    private int IdCentro;
    private String Nombre,Ciudad;
    private int cantidadTiendas;

    public CentroComercial(String titulo, String autor) {
        this.Nombre = titulo;
        this.Ciudad = autor;
        cantidadTiendas = 0;
    }

    public Object[] getRegistro() {
        return new Object[]{IdCentro,Nombre,Ciudad,cantidadTiendas};
    }

    public int getIdCentro() {
        return IdCentro;
    }

    public void setIdCentro(int IdCentro) {
        this.IdCentro = IdCentro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCantidadTiendas() {
        return cantidadTiendas;
    }

    public void setCantidadTiendas(int cantidadTiendas) {
        this.cantidadTiendas = cantidadTiendas;
    }

    
    
    
}
