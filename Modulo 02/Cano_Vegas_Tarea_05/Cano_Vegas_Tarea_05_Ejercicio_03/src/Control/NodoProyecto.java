package Control;

import Modelo.Proyecto;

public class NodoProyecto {
    private Proyecto elemento;
    private NodoProyecto anterior,siguiente;

    public NodoProyecto(Proyecto elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Proyecto getElemento() {
        return elemento;
    }

    public void setElemento(Proyecto elemento) {
        this.elemento = elemento;
    }

    public NodoProyecto getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoProyecto anterior) {
        this.anterior = anterior;
    }

    public NodoProyecto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProyecto siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
