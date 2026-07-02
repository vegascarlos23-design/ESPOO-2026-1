package Control;

import Modelo.Microservicio;
import java.util.ArrayList;

public class NodoMicroservicio {
    private Microservicio elemento;
    private ArrayList<PeticionRed> adyacentes;
    private boolean visitado;

    public NodoMicroservicio(Microservicio elemento) {
        this.elemento = elemento;
        adyacentes = new ArrayList<>();
        visitado = false;
    }
    
    public Object[] getRegistro() {
        return new Object[]{elemento.getNombre(),elemento.getIpContenedor()};
    }
    
    public void AgregarArista(PeticionRed arista) {
        adyacentes.add(arista);
    }
    
    public void EditarArista(int pos, double latenciaMs, double cargaDatosKb) {
        adyacentes.get(pos).setLatenciaMs(latenciaMs);
        adyacentes.get(pos).setCargaDatosKb(cargaDatosKb);
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

    public Microservicio getElemento() {
        return elemento;
    }

    public void setElemento(Microservicio elemento) {
        this.elemento = elemento;
    }

    public ArrayList<PeticionRed> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<PeticionRed> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    
}
