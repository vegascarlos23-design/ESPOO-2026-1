package Control;

import Modelo.Paciente;

public class NodoPaciente {
    private Paciente elemento;
    private NodoPaciente lC,rC;

    public NodoPaciente(Paciente elemento) {
        this.elemento = elemento;
        lC = rC = null;
    }

    public Paciente getElemento() {
        return elemento;
    }

    public void setElemento(Paciente elemento) {
        this.elemento = elemento;
    }

    public NodoPaciente getlC() {
        return lC;
    }

    public void setlC(NodoPaciente lC) {
        this.lC = lC;
    }

    public NodoPaciente getrC() {
        return rC;
    }

    public void setrC(NodoPaciente rC) {
        this.rC = rC;
    }
}
