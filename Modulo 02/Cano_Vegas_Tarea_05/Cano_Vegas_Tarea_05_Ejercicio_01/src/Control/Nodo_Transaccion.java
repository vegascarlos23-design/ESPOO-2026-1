package Control;

import Modelo.Transaccion;

public class Nodo_Transaccion {
    private Transaccion elemento;
    private Nodo_Transaccion siguiente;

    public Nodo_Transaccion(Transaccion elemento) {
        this.elemento = elemento;
        siguiente = null;
    }

    public Transaccion getElemento() {
        return elemento;
    }

    public void setElemento(Transaccion elemento) {
        this.elemento = elemento;
    }

    public Nodo_Transaccion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Transaccion siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
