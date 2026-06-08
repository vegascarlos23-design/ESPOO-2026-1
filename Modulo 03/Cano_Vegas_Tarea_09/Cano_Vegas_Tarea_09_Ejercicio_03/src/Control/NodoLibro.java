package Control;

import Modelo.Libro;

public class NodoLibro {
    private Libro elemento;
    private NodoLibro lC,rC;

    public NodoLibro(Libro elemento) {
        this.elemento = elemento;
        lC = rC = null;
    }

    public Libro getElemento() {
        return elemento;
    }

    public void setElemento(Libro elemento) {
        this.elemento = elemento;
    }

    public NodoLibro getlC() {
        return lC;
    }

    public void setlC(NodoLibro lC) {
        this.lC = lC;
    }

    public NodoLibro getrC() {
        return rC;
    }

    public void setrC(NodoLibro rC) {
        this.rC = rC;
    }
}
