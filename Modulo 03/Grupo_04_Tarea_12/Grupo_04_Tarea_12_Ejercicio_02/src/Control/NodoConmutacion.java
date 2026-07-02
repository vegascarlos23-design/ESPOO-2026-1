package Control;

import Modelo.NodoRed;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NodoConmutacion {
    private NodoRed elemento;
    private ArrayList<EnlaceDatos> adyacentes;
    private boolean visitado;
    private double distancia;
    private NodoConmutacion anterior;

    public NodoConmutacion(NodoRed elemento) {
        this.elemento = elemento;
        adyacentes = new ArrayList<>();
        visitado = false;
        distancia = Double.MAX_VALUE;
        anterior = null;
    }
    
    public Object[] getRegistro() {
        return new Object[] {elemento.getNombre(),elemento.getProveedorHardware(),elemento.getAnchoBandaMax()};
    }

    public void AgregarArista(EnlaceDatos arista) {
        if (BuscarArista(arista.getDestino().getElemento().getNombre()) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe esa conexion");
            return;
        }
        adyacentes.add(arista);
    }
    
    public void EliminarArista(String nombreEliminar) {
        EnlaceDatos edEliminar = BuscarArista(nombreEliminar);
        if (edEliminar != null) {
            adyacentes.remove(edEliminar);
        }
    }
    
    public void EditarArista(String destino, DetalleMedio dm) {
        EnlaceDatos enlace = BuscarArista(destino);
        if (enlace == null) {
            JOptionPane.showMessageDialog(null, "No existe la conexion");
            return;
        }
        if (!enlace.ExisteTipo(dm.getTipoSoporte())) {
            JOptionPane.showMessageDialog(null, "No existe ese soporte");
            return;
        }
        enlace.EditarDetalleMedio(dm.getTipoSoporte(), dm.getLatenciaMs(), dm.getTasaPerdida());
    }
    
    public EnlaceDatos BuscarArista(String nombre) {
        for (EnlaceDatos ed : adyacentes) {
            if (ed.getDestino().getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return ed;
            }
        }
        return null;
    }
    
    public NodoRed getElemento() {
        return elemento;
    }

    public void setElemento(NodoRed elemento) {
        this.elemento = elemento;
    }

    public ArrayList<EnlaceDatos> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<EnlaceDatos> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public NodoConmutacion getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoConmutacion anterior) {
        this.anterior = anterior;
    }   
}
