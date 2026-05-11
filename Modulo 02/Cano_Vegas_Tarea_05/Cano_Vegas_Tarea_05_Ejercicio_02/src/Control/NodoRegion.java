package Control;

import Modelo.Region;

public class NodoRegion {
    private Region elemento;
    private NodoRegion anterior,siguiente;

    public NodoRegion(Region elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Region getElemento() {
        return elemento;
    }

    public void setElemento(Region elemento) {
        this.elemento = elemento;
    }

    public NodoRegion getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoRegion anterior) {
        this.anterior = anterior;
    }

    public NodoRegion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRegion siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
