package Control;

import Modelo.Paciente;

public class NodoPaciente {
    private Paciente elemento;
    private NodoPaciente nxt;
    private PilaMedicamentos objPilaMedicamentos;
    
    public NodoPaciente(Paciente elemento) {
        this.elemento = elemento;
        nxt = null;
        objPilaMedicamentos = new PilaMedicamentos();
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

    public PilaMedicamentos getMedicamentos() {
        return objPilaMedicamentos;
    }

    public void setMedicamentos(PilaMedicamentos medicamentos) {
        this.objPilaMedicamentos = medicamentos;
    }
    
    
}
