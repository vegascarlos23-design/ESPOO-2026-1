package Control;

import Modelo.Prestamo;

public class NodoPrestamo {
    private Prestamo elemento;
    private NodoPrestamo pre,nxt;

    public NodoPrestamo(Prestamo elemento) {
        this.elemento = elemento;
        nxt = pre = null;
    }

    public Prestamo getElemento() {
        return elemento;
    }

    public void setElemento(Prestamo elemento) {
        this.elemento = elemento;
    }

    public NodoPrestamo getPre() {
        return pre;
    }

    public void setPre(NodoPrestamo pre) {
        this.pre = pre;
    }

    public NodoPrestamo getNxt() {
        return nxt;
    }

    public void setNxt(NodoPrestamo nxt) {
        this.nxt = nxt;
    }
    
    
}
