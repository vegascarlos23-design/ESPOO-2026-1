package Control;

import Modelo.Equipo;

public class NodoEquipo {
    private Equipo elemento;
    private NodoEquipo anterior,siguiente;

    public NodoEquipo(Equipo elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Equipo getElemento() {
        return elemento;
    }

    public void setElemento(Equipo elemento) {
        this.elemento = elemento;
    }

    public NodoEquipo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEquipo anterior) {
        this.anterior = anterior;
    }

    public NodoEquipo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEquipo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
