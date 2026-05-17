package Control;

import Modelo.Contenedor;

public class NodoContenedor {
    private Contenedor elemento;
    private NodoContenedor nxt;

    public NodoContenedor(Contenedor elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Contenedor getElemento() {
        return elemento;
    }

    public void setElemento(Contenedor elemento) {
        this.elemento = elemento;
    }

    public NodoContenedor getNxt() {
        return nxt;
    }

    public void setNxt(NodoContenedor nxt) {
        this.nxt = nxt;
    }
    
    
    
}
