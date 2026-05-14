package Control;

import Modelo.Gasto;

public class NodoGasto {
    private Gasto elemento;
    private NodoGasto anterior,siguiente;

    public NodoGasto(Gasto elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Gasto getElemento() {
        return elemento;
    }

    public void setElemento(Gasto elemento) {
        this.elemento = elemento;
    }

    public NodoGasto getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoGasto anterior) {
        this.anterior = anterior;
    }

    public NodoGasto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGasto siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
