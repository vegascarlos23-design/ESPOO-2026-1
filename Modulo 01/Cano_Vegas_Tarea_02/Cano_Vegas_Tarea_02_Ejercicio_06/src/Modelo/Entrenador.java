
package Modelo;

import Control.Arreglo_Equipos;


public class Entrenador {

    private int codEntrenador;
    private String nombreEntrenador;
    private String especialidad;
    private Arreglo_Equipos objEquipos;

    public Entrenador(int codEntrenador, String nombreEntrenador, String especialidad) {
        this.codEntrenador = codEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.especialidad = especialidad;
        objEquipos = new Arreglo_Equipos();
    }

    public Object[] getRegistro() {
        return new Object[]{codEntrenador, nombreEntrenador, especialidad};
    }

    public int getCodEntrenador() {
        return codEntrenador;
    }

    public void setCodEntrenador(int codEntrenador) {
        this.codEntrenador = codEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Arreglo_Equipos getObjEquipos() {
        return objEquipos;
    }

    public void setObjEquipos(Arreglo_Equipos objEquipos) {
        this.objEquipos = objEquipos;
    }
}
