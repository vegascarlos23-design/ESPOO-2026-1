package Modelo;

public class Habitante {
    private int IdPersona;
    private String NombreCompleto;
    private int edad;
    private int CodRegion;

    public Habitante(int IdPersona, String NombreCompleto, int edad, int CodRegion) {
        this.IdPersona = IdPersona;
        this.NombreCompleto = NombreCompleto;
        this.edad = edad;
        this.CodRegion = CodRegion;
    }
    
    public Object[] getRegistro() {
        return new Object[]{IdPersona,NombreCompleto,edad,CodRegion};
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodRegion() {
        return CodRegion;
    }

    public void setCodRegion(int CodRegion) {
        this.CodRegion = CodRegion;
    }
    
    
}
