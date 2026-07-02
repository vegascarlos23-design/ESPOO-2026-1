package Control;

import Modelo.CentroLogistico;
import Modelo.TramoEnvio;
import java.util.ArrayList;

public class NodoCentroLogistico {
    private CentroLogistico elemento;
    private ArrayList<TramoEnvio> adyacentes;
    private boolean visitado;

    public NodoCentroLogistico(CentroLogistico elemento) {
        this.elemento = elemento;
        this.adyacentes = new ArrayList<>();
        this.visitado = false;
    }

    public void agregarTramo(TramoEnvio tramo) {
        adyacentes.add(tramo);
    }

    public void eliminarTramo(int pos) {
        adyacentes.remove(pos);
    }

    public int buscarTramo(String nombre) {
        for (int i = 0; i < adyacentes.size(); i++) {
            if (adyacentes.get(i).getDestino().getElemento().getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public CentroLogistico getElemento() { return elemento; }
    public void setElemento(CentroLogistico elemento) { this.elemento = elemento; }
    public ArrayList<TramoEnvio> getAdyacentes() { return adyacentes; }
    public void setAdyacentes(ArrayList<TramoEnvio> adyacentes) { this.adyacentes = adyacentes; }
    public boolean isVisitado() { return visitado; }
    public void setVisitado(boolean visitado) { this.visitado = visitado; }
}