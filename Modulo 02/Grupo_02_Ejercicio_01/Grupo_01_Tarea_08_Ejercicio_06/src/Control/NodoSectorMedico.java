package Control;

import Modelo.SectorMedico;

public class NodoSectorMedico {
    private SectorMedico elemento;
    private NodoSectorMedico nxt,pre;
    private ColaPacientes objColaPacientes;
    
    public NodoSectorMedico(SectorMedico elemento) {
        this.elemento = elemento;
        pre = nxt = null;
        objColaPacientes = new ColaPacientes();
    }

    public SectorMedico getElemento() {
        return elemento;
    }

    public void setElemento(SectorMedico elemento) {
        this.elemento = elemento;
    }

    public NodoSectorMedico getNxt() {
        return nxt;
    }

    public void setNxt(NodoSectorMedico nxt) {
        this.nxt = nxt;
    }

    public NodoSectorMedico getPre() {
        return pre;
    }

    public void setPre(NodoSectorMedico pre) {
        this.pre = pre;
    }

    public ColaPacientes getObjColaPacientes() {
        return objColaPacientes;
    }

    public void setObjColaPacientes(ColaPacientes objColaPacientes) {
        this.objColaPacientes = objColaPacientes;
    }

}
