package Control;

import Modelo.Tienda;

public class NodoTienda {
    private Tienda elemento;
    private NodoTienda pre,nxt;

    public NodoTienda(Tienda elemento) {
        this.elemento = elemento;
        nxt = pre = null;
    }

    public Tienda getElemento() {
        return elemento;
    }

    public void setElemento(Tienda elemento) {
        this.elemento = elemento;
    }

    public NodoTienda getPre() {
        return pre;
    }

    public void setPre(NodoTienda pre) {
        this.pre = pre;
    }

    public NodoTienda getNxt() {
        return nxt;
    }

    public void setNxt(NodoTienda nxt) {
        this.nxt = nxt;
    }
    
    
}
