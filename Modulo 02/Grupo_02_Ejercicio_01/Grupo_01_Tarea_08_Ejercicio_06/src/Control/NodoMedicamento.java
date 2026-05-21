package Control;

import Modelo.Medicamento;

public class NodoMedicamento {
    private Medicamento elemento;
    private NodoMedicamento nxt;

    public NodoMedicamento(Medicamento elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Medicamento getElemento() {
        return elemento;
    }

    public void setElemento(Medicamento elemento) {
        this.elemento = elemento;
    }

    public NodoMedicamento getNxt() {
        return nxt;
    }

    public void setNxt(NodoMedicamento nxt) {
        this.nxt = nxt;
    }
    
    
}
