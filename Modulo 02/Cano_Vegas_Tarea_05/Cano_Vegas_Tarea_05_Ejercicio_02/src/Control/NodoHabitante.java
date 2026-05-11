package Control;

import Modelo.Habitante;

public class NodoHabitante {
    private Habitante elemento;
    private NodoHabitante anterior,siguiente;

    public NodoHabitante(Habitante elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Habitante getElemento() {
        return elemento;
    }

    public void setElemento(Habitante elemento) {
        this.elemento = elemento;
    }

    public NodoHabitante getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoHabitante anterior) {
        this.anterior = anterior;
    }

    public NodoHabitante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHabitante siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
