package Control;

import Modelo.Columna;

public class NodoColumna {
    private Columna elemento;
    private NodoColumna nxt;

    public NodoColumna(Columna elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Columna getElemento() {
        return elemento;
    }

    public void setElemento(Columna elemento) {
        this.elemento = elemento;
    }

    public NodoColumna getNxt() {
        return nxt;
    }

    public void setNxt(NodoColumna nxt) {
        this.nxt = nxt;
    }
    
    
}
