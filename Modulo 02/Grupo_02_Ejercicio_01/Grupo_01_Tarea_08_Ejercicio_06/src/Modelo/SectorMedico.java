package Modelo;

import java.util.UUID;

public class SectorMedico {
    private String idSector;
    private String nombre;
    private int camasLibres;

    public SectorMedico(String nombre, int camasLibres) {
        String hash = UUID.randomUUID().toString().replace("-", "").substring(0,6).toUpperCase();
        
        idSector = hash;
        this.nombre = nombre;
        this.camasLibres = camasLibres;
    }
    
    public Object[] getRegistro() {
        return new Object[]{idSector,nombre,camasLibres};
    }

    public String getIdSector() {
        return idSector;
    }

    public void setIdSector(String idSector) {
        this.idSector = idSector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCamasLibres() {
        return camasLibres;
    }

    public void setCamasLibres(int camasLibres) {
        this.camasLibres = camasLibres;
    }
}
