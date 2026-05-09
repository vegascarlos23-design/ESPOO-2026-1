package Control;

import Modelo.Cuenta;

public class Nodo_Cuenta {
    private Cuenta elemento;
    private Nodo_Cuenta siguiente;

    public Nodo_Cuenta(Cuenta elemento) {
        this.elemento = elemento;
        siguiente = null;
    }

    public Cuenta getElemento() {
        return elemento;
    }

    public void setElemento(Cuenta elemento) {
        this.elemento = elemento;
    }

    public Nodo_Cuenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Cuenta siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
