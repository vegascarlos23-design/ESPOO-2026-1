package Control;

import Modelo.AlumnoMatriculado;

public class NodoAVLAlumno {
    private AlumnoMatriculado elemento;
    private NodoAVLAlumno nl,nr;

    public NodoAVLAlumno(AlumnoMatriculado elemento) {
        this.elemento = elemento;
        nl = nr = null;
    }
    
    public Object[] getRegistro() {
        return new Object[]{elemento.getCodigoEstudiante(),elemento.getNombreCompleto(),elemento.getPromedioPonderado(),elemento.getSituacionAcademica()};
    }
    
    public int getFE() {
        int hl = 0, hr = 0;
        if (getElemento() == null) return 0;
        
        if (getNl() != null) hl = getNl().getH();
        if (getNr() != null) hr = getNr().getH();
        
        return (hr - hl);
    }
    
    public int getH() {
        int hl = 0, hr = 0;
        if(getElemento() == null) return 0;
        
        if (getNl() != null) hl = getNl().getH();
        if(getNr() != null) hr = getNr().getH();
        
        return Math.max(hl, hr) + 1;
    }

    public AlumnoMatriculado getElemento() {
        return elemento;
    }

    public void setElemento(AlumnoMatriculado elemento) {
        this.elemento = elemento;
    }

    public NodoAVLAlumno getNl() {
        return nl;
    }

    public void setNl(NodoAVLAlumno nl) {
        this.nl = nl;
    }

    public NodoAVLAlumno getNr() {
        return nr;
    }

    public void setNr(NodoAVLAlumno nr) {
        this.nr = nr;
    }
    
    
}
