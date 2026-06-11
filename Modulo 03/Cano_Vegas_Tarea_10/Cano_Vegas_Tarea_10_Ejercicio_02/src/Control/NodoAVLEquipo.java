package Control;

import Modelo.EquipoBiomedico;

public class NodoAVLEquipo {
    private EquipoBiomedico elemento;
    private NodoAVLEquipo nl,nr;

    public NodoAVLEquipo(EquipoBiomedico elemento) {
        this.elemento = elemento;
        nl = nr = null;
    }
    
    public Object[] getRegistro() {
        return new Object[]{elemento.getNumeroSerie(),elemento.getTipoEquipo(),elemento.getHorasUso(),elemento.getEstadoMantenimiento()};
    }
    
    public int getFE() {
        int hl = 0, hr = 0;
        if (getElemento() == null) return 0;
        
        if (getNl() != null) hl = getNl().getH();
        if (getNr() != null) hr = getNr().getH();
        
        return (hr - hl);
    }
    
    public int getH() {
        int hl = 0, hr = 0;
        if(getElemento() == null) return 0;
        
        if (getNl() != null) hl = getNl().getH();
        if(getNr() != null) hr = getNr().getH();
        
        return Math.max(hl, hr) + 1;
    }

    public EquipoBiomedico getElemento() {
        return elemento;
    }

    public void setElemento(EquipoBiomedico elemento) {
        this.elemento = elemento;
    }

    public NodoAVLEquipo getNl() {
        return nl;
    }

    public void setNl(NodoAVLEquipo nl) {
        this.nl = nl;
    }

    public NodoAVLEquipo getNr() {
        return nr;
    }

    public void setNr(NodoAVLEquipo nr) {
        this.nr = nr;
    }
    
    
}
