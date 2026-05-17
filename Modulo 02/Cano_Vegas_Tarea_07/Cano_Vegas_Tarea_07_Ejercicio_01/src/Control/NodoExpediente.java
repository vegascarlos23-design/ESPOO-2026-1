package Control;

import Modelo.Expediente;

public class NodoExpediente {
    private Expediente elemento;
    private NodoExpediente nxt;

    public NodoExpediente(Expediente elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Expediente getElemento() {
        return elemento;
    }

    public void setElemento(Expediente elemento) {
        this.elemento = elemento;
    }

    public NodoExpediente getNxt() {
        return nxt;
    }

    public void setNxt(NodoExpediente nxt) {
        this.nxt = nxt;
    }
    
    
}
