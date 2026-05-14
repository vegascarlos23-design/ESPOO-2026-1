package Control;

import Modelo.Partido;

public class NodoPartido {
    private Partido elemento;
    private NodoPartido anterior,siguiente;

    public NodoPartido(Partido elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Partido getElemento() {
        return elemento;
    }

    public void setElemento(Partido elemento) {
        this.elemento = elemento;
    }

    public NodoPartido getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPartido anterior) {
        this.anterior = anterior;
    }

    public NodoPartido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPartido siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
