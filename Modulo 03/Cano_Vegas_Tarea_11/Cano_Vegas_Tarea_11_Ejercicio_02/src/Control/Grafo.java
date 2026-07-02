package Control;

import Modelo.Helipuerto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {
    private ArrayList<NodoHelipuerto> lista;

    public Grafo() {
        lista = new ArrayList<>();
    }
    
    public void AgregarNodo(Helipuerto elemento) {
        if (BuscarNodo(elemento.getNombre()) != null) {
            JOptionPane.showMessageDialog(null, "El Helipuerto ya existe");
            return;
        }
        
        NodoHelipuerto newNode = new NodoHelipuerto(elemento);
        lista.add(newNode);
    }
    
    public void EditarNodo(String nombreEditar, Object[] elemento) {
        NodoHelipuerto nodoEditar = BuscarNodo(nombreEditar);
        String nombre = elemento[0].toString();
        int altitud = Integer.parseInt(elemento[1].toString());
        
        if (!nombre.equalsIgnoreCase(nombreEditar) && BuscarNodo(nombre) != null) {
            JOptionPane.showMessageDialog(null, "El nuevo nombre de el Helipuerto ya existe");
        } else {
            nodoEditar.getElemento().setNombre(nombre);
            nodoEditar.getElemento().setAltitudMsnm(altitud);
        }
    }
    
    public void EliminarNodo(String nombre) {
        NodoHelipuerto nodoEliminar = BuscarNodo(nombre);
        for(NodoHelipuerto nodo : lista) {
            nodo.getAdyacentes().removeIf(arista -> arista.getDestino() == nodoEliminar);
        }
        
        lista.remove(nodoEliminar);
    }
    
    public void AgregarConexion(String origen, RutaAerea conexion) {
        NodoHelipuerto nodoOrigen = BuscarNodo(origen);
        nodoOrigen.AgregarArista(conexion);
    }
    
    public void EditarConexion(String origen, String destino,int cantidadBateria, double distanciaLineal) {
        NodoHelipuerto nodoOrigen = BuscarNodo(origen);
        nodoOrigen.EditarArista(nodoOrigen.BuscarArista(destino), cantidadBateria, distanciaLineal);
    }
    
    public void EliminarConexion(String origen, String destino) {
        NodoHelipuerto nodoOrigen = BuscarNodo(origen);
        nodoOrigen.EliminarArista(nodoOrigen.BuscarArista(destino));        
    }
    
    
    public NodoHelipuerto BuscarNodo(String nombre) {
        for (int pos = 0; pos < lista.size(); pos++) {
            if (lista.get(pos).getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return lista.get(pos);
            }
        }
        return null;
    }
    
    public void ListarDfs(JTable control, NodoHelipuerto root) {
        String[] Header = {"Nombre","Altitud msnm",""};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
                
        Dfs(root, modTable);
    }
    
    private void Dfs(NodoHelipuerto cur, DefaultTableModel modTable) {
        modTable.addRow(cur.getRegistro());
        cur.setVisitado(true);
        String conexiones = "";
        
        for(RutaAerea arista : cur.getAdyacentes()) {
            NodoHelipuerto destino = arista.getDestino();
            conexiones += "[" + destino.getElemento().getNombre() + 
                    " (" + arista.getConsumoBateria() + "%) " + arista.getDistanciaLinealM() +"m]";
        }
        
        if (modTable.getColumnCount() > 0) {
            modTable.setValueAt(conexiones, modTable.getRowCount()-1, 2);
        }
        
        for (RutaAerea arista : cur.getAdyacentes()) {
            NodoHelipuerto destino = arista.getDestino();
            if (destino.isVisitado()) continue;
            Dfs(destino, modTable);
        }
    }
    
    public void ListarBfs(JTable control,NodoHelipuerto root) {
        String[] Header = {"Nombre","Altitud msnm",""};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
        
        Queue<NodoHelipuerto> cola = new LinkedList<>();
        cola.add(root);
        
        while(!cola.isEmpty()) {
            NodoHelipuerto cur = cola.poll();
            modTable.addRow(cur.getRegistro());
            cur.setVisitado(true);
            String conexiones = "";
            
            for(RutaAerea arista : cur.getAdyacentes()) {
                NodoHelipuerto destino = arista.getDestino();
                conexiones += "[" + destino.getElemento().getNombre() + 
                    " (" + arista.getConsumoBateria() + "%) " + arista.getDistanciaLinealM() +"m]";
                
                if (destino.isVisitado()) continue;
                cola.add(destino);
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
            columnas[i+1] = lista.get(i).getElemento().getNombre();
        }

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (int i = 0; i < n; i++) {
            Object[] fila = new Object[n+1];
            fila[0] = lista.get(i).getElemento().getNombre();

            for (int j = 0; j < n; j++) {
                fila[j+1] = 0;
            }

            for (RutaAerea arista : lista.get(i).getAdyacentes()) {
                int j = lista.indexOf(arista.getDestino());
                fila[j+1] = arista.getConsumoBateria();
            }
            modelo.addRow(fila);
        }
        control.setModel(modelo);
    }   
}

