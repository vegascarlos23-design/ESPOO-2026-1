package Control;

import Modelo.Equipo;
import Modelo.Partido;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaPartidos {
    private NodoPartido inicio,fin;

    public ListaPartidos() {
        inicio = fin = null;
    }
    
    public boolean Agregar(Partido elemento, ListaEquipos objEquipo) {
        if (getNodoPorId(elemento.getIdPartido()) != null) {
            JOptionPane.showMessageDialog(null, "El partido ya fue registrado");
            return false;
        }
        
        Equipo local = objEquipo.getNodoPorId(elemento.getIdEquipoLocal()).getElemento();
        Equipo visitante = objEquipo.getNodoPorId(elemento.getIdEquipoVisitante()).getElemento();
        int[] pnts = new int[]{1,3};
        
        if (elemento.getGolesLocal() == elemento.getGolesVisitante()) {
            local.setPuntosAcumulados(local.getPuntosAcumulados() + pnts[0]);
            visitante.setPuntosAcumulados(visitante.getPuntosAcumulados() + pnts[0]);            
        } else if (elemento.getGolesLocal() > elemento.getGolesVisitante()) {
            local.setPuntosAcumulados(local.getPuntosAcumulados() + pnts[1]);
        } else {
            visitante.setPuntosAcumulados(visitante.getPuntosAcumulados() + pnts[1]);     
        }
        
        NodoPartido nuevo = new NodoPartido(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }        
        return true;
    }  
  
    public void Listar(JTable control) {
        String[] cabecera = {"ID Partido","Equipo Local","Equipo Visitante","Goles Local","Goles Visitante"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoPartido cur = inicio;
        
        while(cur != null) {   
            modTabla.addRow(cur.getElemento().getRegistro());                                                    
            cur = cur.getSiguiente();
        }
    }    
    
    public void ListarPorIdEquipo(JTable control, int idEquipo) {
        String[] cabecera = {"ID Partido","Equipo Local","Equipo Visitante","Goles Local","Goles Visitante"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoPartido cur = inicio;
        
        while(cur != null) {   
            if (cur.getElemento().getIdEquipoLocal()== idEquipo || cur.getElemento().getIdEquipoVisitante()== idEquipo) {
                modTabla.addRow(cur.getElemento().getRegistro());                            
            }            
            cur = cur.getSiguiente();
        }
    } 
    
    public NodoPartido getNodoPorId(int idPartido) {
        NodoPartido cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getIdPartido()== idPartido) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
}
