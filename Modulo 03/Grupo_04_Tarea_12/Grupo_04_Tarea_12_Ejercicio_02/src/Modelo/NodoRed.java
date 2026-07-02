package Modelo;

public class NodoRed {
    private String nombre;
    private String proveedorHardware;
    private int anchoBandaMax;

    public NodoRed(String nombre, String proveedorHardware, int anchoBandaMax) {
        this.nombre = nombre;
        this.proveedorHardware = proveedorHardware;
        this.anchoBandaMax = anchoBandaMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedorHardware() {
        return proveedorHardware;
    }

    public void setProveedorHardware(String proveedorHardware) {
        this.proveedorHardware = proveedorHardware;
    }

    public int getAnchoBandaMax() {
        return anchoBandaMax;
    }

    public void setAnchoBandaMax(int anchoBandaMax) {
        this.anchoBandaMax = anchoBandaMax;
    }
    
    
}
