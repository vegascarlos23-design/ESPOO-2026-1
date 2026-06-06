package Control;

import Modelo.Servidor;

public class NodoServidor {
    private Servidor elemento;
    private NodoServidor lC,rC;

    public NodoServidor(Servidor elemento) {
        this.elemento = elemento;
        lC = rC = null;
    }

    public Servidor getElemento() {
        return elemento;
    }

    public void setElemento(Servidor elemento) {
        this.elemento = elemento;
    }

    public NodoServidor getlC() {
        return lC;
    }

    public void setlC(NodoServidor lC) {
        this.lC = lC;
    }

    public NodoServidor getrC() {
        return rC;
    }

    public void setrC(NodoServidor rC) {
        this.rC = rC;
    }
}
