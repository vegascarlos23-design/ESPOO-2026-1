package Modelo;

import Control.TreeEquipoBiomedico;

public class Pabellon {
    private String codigoPabellon;
    private int piso;
    private TreeEquipoBiomedico equipos;

    public Pabellon(String codigoPabellon, int piso) {
        this.codigoPabellon = codigoPabellon;
        this.piso = piso;
        equipos = new TreeEquipoBiomedico();
    }

    public String getCodigoPabellon() {
        return codigoPabellon;
    }

    public void setCodigoPabellon(String codigoPabellon) {
        this.codigoPabellon = codigoPabellon;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public TreeEquipoBiomedico getEquipos() {
        return equipos;
    }

    public void setEquipos(TreeEquipoBiomedico equipos) {
        this.equipos = equipos;
    }

    
    
}
