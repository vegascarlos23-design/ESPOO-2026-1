package Control;

import Modelo.Herramienta;

public class NodoHerramienta {
    private Herramienta elemento;
    private NodoHerramienta lC,rC;

    public NodoHerramienta(Herramienta elemento) {
        this.elemento = elemento;
        lC = rC = null;
    }

    public Herramienta getElemento() {
        return elemento;
    }

    public void setElemento(Herramienta elemento) {
        this.elemento = elemento;
    }

    public NodoHerramienta getlC() {
        return lC;
    }

    public void setlC(NodoHerramienta lC) {
        this.lC = lC;
    }

    public NodoHerramienta getrC() {
        return rC;
    }

    public void setrC(NodoHerramienta rC) {
        this.rC = rC;
    }
}
