package Control;

import Modelo.CentroComercial;

public class NodoCentroComercial {
    private CentroComercial elemento;
    private NodoCentroComercial nxt;

    public NodoCentroComercial(CentroComercial elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public CentroComercial getElemento() {
        return elemento;
    }

    public void setElemento(CentroComercial elemento) {
        this.elemento = elemento;
    }

    public NodoCentroComercial getNxt() {
        return nxt;
    }

    public void setNxt(NodoCentroComercial nxt) {
        this.nxt = nxt;
    }
    
    
}
