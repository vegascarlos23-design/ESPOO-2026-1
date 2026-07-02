package Control;

import Modelo.Helipuerto;
import java.util.ArrayList;

public class NodoHelipuerto {
    private Helipuerto elemento;
    private ArrayList<RutaAerea> adyacentes;
    private boolean visitado;

    public NodoHelipuerto(Helipuerto elemento) {
        this.elemento = elemento;
        adyacentes = new ArrayList<>();
        visitado = false;
    }
    
    public Object[] getRegistro() {
        return new Object[]{elemento.getNombre(),elemento.getAltitudMsnm()};
    }
    
    public void AgregarArista(RutaAerea arista) {
        adyacentes.add(arista);
    }
    
    public void EditarArista(int pos, int consumoBateria, double distanciaLineal) {
        adyacentes.get(pos).setConsumoBateria(consumoBateria);
        adyacentes.get(pos).setDistanciaLinealM(distanciaLineal);
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

    public Helipuerto getElemento() {
        return elemento;
    }

    public void setElemento(Helipuerto elemento) {
        this.elemento = elemento;
    }

    public ArrayList<RutaAerea> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<RutaAerea> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    
}
