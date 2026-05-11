package Modelo;

public class Region {
    private int codRegion;
    private String nombreRegion;
    private double superficie;

    public Region(int codRegion, String nombreRegion, double superficie) {
        this.codRegion = codRegion;
        this.nombreRegion = nombreRegion;
        this.superficie = superficie;
    }
    
    public Object[] getRegistro() {
        return new Object[]{codRegion,nombreRegion,superficie};
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    
}
