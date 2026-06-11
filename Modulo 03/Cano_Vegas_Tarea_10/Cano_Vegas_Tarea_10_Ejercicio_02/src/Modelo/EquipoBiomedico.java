package Modelo;

public class EquipoBiomedico {
    private int numeroSerie;
    private String tipoEquipo;
    private int horasUso;
    private String estadoMantenimiento;

    public EquipoBiomedico(int numeroSerie, String tipoEquipo, int horasUso, String estadoMantenimiento) {
        this.numeroSerie = numeroSerie;
        this.tipoEquipo = tipoEquipo;
        this.horasUso = horasUso;
        this.estadoMantenimiento = estadoMantenimiento;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public String getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    public void setEstadoMantenimiento(String estadoMantenimiento) {
        this.estadoMantenimiento = estadoMantenimiento;
    }
    
    
}
