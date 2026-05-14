package Control;

import Modelo.Paciente;

public class NodoPaciente {
    private Paciente elemento;
    private NodoPaciente nxt;

    public NodoPaciente(Paciente elemento) {
        this.elemento = elemento;
        nxt = null;
    }

    public Paciente getElemento() {
        return elemento;
    }

    public void setElemento(Paciente elemento) {
        this.elemento = elemento;
    }

    public NodoPaciente getNxt() {
        return nxt;
    }

    public void setNxt(NodoPaciente nxt) {
        this.nxt = nxt;
    }
    
    
}
