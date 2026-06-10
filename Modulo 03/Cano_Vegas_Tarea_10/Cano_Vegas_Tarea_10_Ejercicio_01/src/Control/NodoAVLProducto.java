package Control;

import Modelo.Producto;

public class NodoAVLProducto {
    private Producto elemento;
    private NodoAVLProducto lC,rC;

    public NodoAVLProducto(Producto elemento) {
        this.elemento = elemento;
        lC = rC = null;
    }
    
    public int getFE() {
        int hl = 0, hr = 0;
        if (getElemento() == null) return 0;
        
        if (getlC() != null) hl = getlC().getH();
        if (getrC() != null) hr = getrC().getH();
        
        return (hr - hl);
    }
    
    public int getH() {
        int hl = 0,hr = 0;
        if (getElemento() == null) return 0;
        
        if (getlC() != null) hl = getlC().getH();
        if (getrC() != null) hr = getrC().getH();
        
        return Math.max(hl, hr) +1;
    }
    

    public Producto getElemento() {
        return elemento;
    }

    public void setElemento(Producto elemento) {
        this.elemento = elemento;
    }

    public NodoAVLProducto getlC() {
        return lC;
    }

    public void setlC(NodoAVLProducto lC) {
        this.lC = lC;
    }

    public NodoAVLProducto getrC() {
        return rC;
    }

    public void setrC(NodoAVLProducto rC) {
        this.rC = rC;
    }
    
    
    
}
