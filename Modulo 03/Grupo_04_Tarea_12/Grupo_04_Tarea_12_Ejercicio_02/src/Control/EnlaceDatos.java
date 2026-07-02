package Control;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EnlaceDatos {
    private NodoConmutacion destino;
    private ArrayList<DetalleMedio> detallesMedios;

    public EnlaceDatos(NodoConmutacion destino) {
        this.destino = destino;
        detallesMedios = new ArrayList<>();
    }
    
    public void AgregarDetallesMedios(DetalleMedio elemento) {
        if (BuscarDetalleMedio(elemento.getTipoSoporte()) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe ese tipo de enlace");
            return;
        }
        detallesMedios.add(elemento);
    }
    
    public void EliminarDetallesMedios(String tipoEliminar) {
        DetalleMedio dmEliminar = BuscarDetalleMedio(tipoEliminar);
        if (dmEliminar != null) detallesMedios.remove(dmEliminar);
    }
    
    public void EditarDetalleMedio(String tipo,double latencia,double perdida) { 
        DetalleMedio dmEditar = BuscarDetalleMedio(tipo);
        if (dmEditar != null) {
            dmEditar.setLatenciaMs(latencia);
            dmEditar.setTasaPerdida(perdida);
        }
    }

    public DetalleMedio BuscarDetalleMedio(String tipo) {
        for (DetalleMedio dm : detallesMedios) {
            if (dm.getTipoSoporte().equalsIgnoreCase(tipo)) {
                return dm;
            }
        }
        return null;
    }
    
    public boolean ExisteTipo(String tipo) {
        return BuscarDetalleMedio(tipo) != null;
    }
    
    public double ObtenerPeso(String tipo, int prioridad, double pesoLatencia, double pesoPerdida) {
        if (tipo.equalsIgnoreCase("CUALQUIERA")) {
            double menor = Double.MAX_VALUE;
            for (DetalleMedio dm : detallesMedios) {
                double peso;
                if (prioridad == 1) peso = dm.getLatenciaMs();
                else if (prioridad == 2) peso = dm.getTasaPerdida();
                else peso = dm.getLatenciaMs()*pesoLatencia + dm.getTasaPerdida()*pesoPerdida;
                
                menor = Math.min(menor, peso);
            }
            return menor;
        }        
        
        DetalleMedio dm = BuscarDetalleMedio(tipo);
           
        if (dm == null) return Double.MAX_VALUE;
        
        if (prioridad == 1) return dm.getLatenciaMs();
        if (prioridad == 2) return dm.getTasaPerdida();
        if (prioridad == 3) return (dm.getLatenciaMs()*pesoLatencia + dm.getTasaPerdida()*pesoPerdida);
        
        return Double.MAX_VALUE;
    }
    
    public NodoConmutacion getDestino() {
        return destino;
    }

    public void setDestino(NodoConmutacion destino) {
        this.destino = destino;
    }

    public ArrayList<DetalleMedio> getDetallesMedios() {
        return detallesMedios;
    }

    public void setDetallesMedios(ArrayList<DetalleMedio> detallesMedios) {
        this.detallesMedios = detallesMedios;
    }
    
    
    
    
}
