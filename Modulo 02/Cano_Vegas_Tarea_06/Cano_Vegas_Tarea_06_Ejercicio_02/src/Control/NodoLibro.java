package Control;

import Modelo.Libro;

public class NodoLibro {
    private Libro elemento;
    private NodoLibro nxt;

    public NodoLibro(Libro elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Libro getElemento() {
        return elemento;
    }

    public void setElemento(Libro elemento) {
        this.elemento = elemento;
    }

    public NodoLibro getNxt() {
        return nxt;
    }

    public void setNxt(NodoLibro nxt) {
        this.nxt = nxt;
    }
    
    
}
