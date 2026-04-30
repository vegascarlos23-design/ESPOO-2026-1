
package Modelo;

public class Equipo {

    private int codEntrenador;
    private int idEquipo;
    private String nombreEquipo;
    private Entrenador entrenador;

    public Equipo(int codEntrenador, int idEquipo, String nombreEquipo, Entrenador entrenador) {
        this.codEntrenador = codEntrenador;
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
    }

    public Object[] getRegistro() {
        return new Object[]{codEntrenador, idEquipo, nombreEquipo};
    }

    public int getCodEntrenador() {
        return codEntrenador;
    }

    public void setCodEntrenador(int codEntrenador) {
        this.codEntrenador = codEntrenador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}
