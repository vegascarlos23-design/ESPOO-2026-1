package Control;

import Modelo.VentaDiaria;

public class NodoVentaDiaria {
    private VentaDiaria elemento;
    private NodoVentaDiaria pre,nxt;

    public NodoVentaDiaria(VentaDiaria elemento) {
        this.elemento = elemento;
        nxt = pre = null;
    }

    public VentaDiaria getElemento() {
        return elemento;
    }

    public void setElemento(VentaDiaria elemento) {
        this.elemento = elemento;
    }

    public NodoVentaDiaria getPre() {
        return pre;
    }

    public void setPre(NodoVentaDiaria pre) {
        this.pre = pre;
    }

    public NodoVentaDiaria getNxt() {
        return nxt;
    }

    public void setNxt(NodoVentaDiaria nxt) {
        this.nxt = nxt;
    }

    
    
    
}
