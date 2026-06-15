package Control;

import Modelo.EstacionElectrica;
import java.util.ArrayList;

public class NodoEstacionElectrica {
    private EstacionElectrica elemento;
    private ArrayList<LineaTension> adyacentes;
    private boolean visitado;

    public NodoEstacionElectrica(EstacionElectrica elemento) {
        this.elemento = elemento;
        adyacentes = new ArrayList<>();
        visitado = false;
    }
    
    public Object[] getRegistro() {
        return new Object[] {elemento.getNombre(),elemento.getVoltajeOperacion()};
    }
    
    public void AgregarArista(LineaTension arista) {
        adyacentes.add(arista);
    }
    
    public void EliminarArista(int pos) {
        if (pos == -1) return;
        adyacentes.remove(pos);
    }
    
    public int BuscarArista(String nombre) {
        for (int pos = 0; pos < adyacentes.size(); pos++) {
            if (adyacentes.get(pos).getDestino().getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return pos;
            }
        }
        return -1;
    }

    public EstacionElectrica getElemento() {
        return elemento;
    }

    public void setElemento(EstacionElectrica elemento) {
        this.elemento = elemento;
    }

    public ArrayList<LineaTension> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<LineaTension> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
}
