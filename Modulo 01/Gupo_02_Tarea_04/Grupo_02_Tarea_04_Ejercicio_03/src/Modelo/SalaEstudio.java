package Modelo;

public class SalaEstudio {
    private String IdSala;
    private int capacidadSillas;
    private String equipamiento;
    private boolean estadoOcupacion;

    public SalaEstudio(String IdSala, int capacidadSillas, String equipamiento, boolean estadoOcupacion) {
        this.IdSala = IdSala;
        this.capacidadSillas = capacidadSillas;
        this.equipamiento = equipamiento;
        this.estadoOcupacion = estadoOcupacion;
    }
    
    public Object[] getRegistro() {
        return new Object[]{IdSala,capacidadSillas,equipamiento,estadoOcupacion};
    }

    public String getIdSala() {
        return IdSala;
    }

    public void setIdSala(String IdSala) {
        this.IdSala = IdSala;
    }

    public int getCapacidadSillas() {
        return capacidadSillas;
    }

    public void setCapacidadSillas(int capacidadSillas) {
        this.capacidadSillas = capacidadSillas;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public boolean isEstadoOcupacion() {
        return estadoOcupacion;
    }

    public void setEstadoOcupacion(boolean estadoOcupacion) {
        this.estadoOcupacion = estadoOcupacion;
    }
    
    
}
