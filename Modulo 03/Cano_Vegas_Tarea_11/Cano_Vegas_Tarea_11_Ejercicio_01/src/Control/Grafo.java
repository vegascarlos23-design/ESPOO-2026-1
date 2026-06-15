package Control;

import Modelo.EstacionElectrica;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {
    private ArrayList<NodoEstacionElectrica> lista;

    public Grafo() {
        lista = new ArrayList<>();
    }
    
    public void AgregarNodo(EstacionElectrica elemento) {
        if (BuscarNodoNombre(elemento.getNombre()) != null) {
            JOptionPane.showMessageDialog(null, "La estacion Electrica ya existe");
            return;
        }
        NodoEstacionElectrica newNode = new NodoEstacionElectrica(elemento);
        lista.add(newNode);
    }
    
    public void EditarNodo(String nombreEditar, Object[] elemento) {
        NodoEstacionElectrica NodoEdi = BuscarNodoNombre(nombreEditar);
        String nombre = elemento[0].toString();
        double voltaje = Double.parseDouble(elemento[1].toString());
        
        if (!nombre.equalsIgnoreCase(nombreEditar) && BuscarNodoNombre(nombre) != null) {
            JOptionPane.showMessageDialog(null, "El nuevo nombre de la estacion electrica ya existe");
        } else {
            NodoEdi.getElemento().setNombre(nombre);
            NodoEdi.getElemento().setVoltajeOperacion(voltaje);
        } 
    }
    
    public void EliminarNodo(String nombreEliminar) {
        NodoEstacionElectrica nodoEliminar = BuscarNodoNombre(nombreEliminar);
        for (NodoEstacionElectrica nodo : lista) {
            nodo.getAdyacentes().removeIf(arista -> arista.getDestino() == nodoEliminar);
        }
        
        lista.remove(nodoEliminar);    
    }
    
    public NodoEstacionElectrica BuscarNodoNombre(String nombre) {
        for (int pos = 0; pos < lista.size(); pos++) {
            if (lista.get(pos).getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return lista.get(pos);
            }
        }
        return null;
    }
    
    public void AgregarConexion(String origen,LineaTension Conexion) {
        NodoEstacionElectrica NodoOrigen = BuscarNodoNombre(origen);
        NodoOrigen.AgregarArista(Conexion);        
    }
    
    public void EditarConexion(String origen,String destino, double perdidadKw, double longitud) {
        NodoEstacionElectrica NodoOrigen = BuscarNodoNombre(origen);
        int posEdi = NodoOrigen.BuscarArista(destino);
        NodoOrigen.getAdyacentes().get(posEdi).setPerdidaKw(perdidadKw);
        NodoOrigen.getAdyacentes().get(posEdi).setLongitudMetros(longitud);
    }
    
    public void EliminarConexion(String origen, String destino) {
        NodoEstacionElectrica NodoOrigen = BuscarNodoNombre(origen);
        int posEli = NodoOrigen.BuscarArista(destino);
        NodoOrigen.EliminarArista(posEli);
    }
    
    public void ListarDfs(JTable control, NodoEstacionElectrica origen) {
        String[] header = {"Nombre","Voltaje en Operacion","Conexiones"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        if (origen == null) return;
        
        for(NodoEstacionElectrica cur : lista) {
            cur.setVisitado(false);
        }
        
        
        dfs(origen,modTable);
    }
    
    private void dfs(NodoEstacionElectrica cur, DefaultTableModel modTable) {
        modTable.addRow(cur.getRegistro());
        cur.setVisitado(true);
        String conexiones = "";
        
        for (LineaTension arista : cur.getAdyacentes()) {
            NodoEstacionElectrica destino = arista.getDestino();
            conexiones += " [" + destino.getElemento().getNombre() +
                    " (" + arista.getPerdidaKw() + " kW) " + arista.getLongitudMetros() + " m]";
        }
        if (modTable.getColumnCount() > 0) {
            modTable.setValueAt(conexiones, modTable.getRowCount()-1, 2);
        }
        
        
        for (LineaTension arista : cur.getAdyacentes()) {
            NodoEstacionElectrica destino = arista.getDestino();
            if (destino.isVisitado()) continue;             
            dfs(destino, modTable);
        }
    }
    
    public void ListarBfs(JTable control, NodoEstacionElectrica origen) {
        String[] header = {"Nombre","Voltaje en Operacion","Conexiones"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(NodoEstacionElectrica cur : lista) {
            cur.setVisitado(false);
        }
        
        Queue<NodoEstacionElectrica> cola = new LinkedList<>();
        
        if (lista.isEmpty()) return;
        cola.add(origen);
        origen.setVisitado(true);
        
        while(!cola.isEmpty()) {
            NodoEstacionElectrica cur = cola.poll();
            modTable.addRow(cur.getRegistro());
            String conexiones = "";
            for(LineaTension arista : cur.getAdyacentes()) {                
                NodoEstacionElectrica destino = arista.getDestino();
                if (!destino.isVisitado()) {
                    destino.setVisitado(true);
                    cola.add(destino);
                }
                conexiones += " [" + destino.getElemento().getNombre() +
                    " (" + arista.getPerdidaKw() + " kW) " + arista.getLongitudMetros() + " m]";
            }
            if (modTable.getColumnCount() > 0) {
                modTable.setValueAt(conexiones, modTable.getRowCount()-1, 2);
            }
        }
    }
    
    public void CargarCombo(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        for (int pos = 0; pos < lista.size(); pos++) {
            modCombo.addElement(lista.get(pos).getElemento().getNombre());
        }
    }
    
    public void MostrarMatrizAdyacencia(JTable control) {
        int n = lista.size();

        String[] columnas = new String[n+1];
        columnas[0] = "";

        for (int i = 0; i < n; i++) {
            columnas[i + 1] = lista.get(i).getElemento().getNombre();
        }

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (int i = 0; i < n; i++) {
            Object[] fila = new Object[n+1];
            fila[0] = lista.get(i).getElemento().getNombre();

            for (int j = 0; j < n; j++) {
                fila[j+1] = 0;
            }

            for (LineaTension arista : lista.get(i).getAdyacentes()) {
                int j = lista.indexOf(arista.getDestino());
                fila[j+1] = arista.getPerdidaKw();
            }
            modelo.addRow(fila);
        }
        control.setModel(modelo);
    }   
}
