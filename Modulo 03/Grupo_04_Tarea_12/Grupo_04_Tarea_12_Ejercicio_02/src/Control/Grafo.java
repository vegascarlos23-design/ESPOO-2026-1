package Control;

import Modelo.NodoRed;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {
    private ArrayList<NodoConmutacion> lista;

    public Grafo() {
        lista = new ArrayList<>();
    }
    
    public void AgregarNodo(NodoRed elemento) {
        NodoConmutacion newNode = new NodoConmutacion(elemento);
        lista.add(newNode);
    }
    
    public void AgregarConexion(String origen, EnlaceDatos arista) {
        NodoConmutacion nodoOrigen = BuscarNodo(origen);
        nodoOrigen.AgregarArista(arista);
    }
    
    public void EliminarNodo(String nombre) {
        NodoConmutacion nodoEliminar = BuscarNodo(nombre);
        
        for (NodoConmutacion nodo : lista) nodo.EliminarArista(nombre);
         
        lista.remove(nodoEliminar);
    }
    
    public void EliminarConexion(String origen, String destino) {
        NodoConmutacion nodoOrigen = BuscarNodo(origen);
        if (nodoOrigen != null) nodoOrigen.EliminarArista(destino);
    }
    
    public void EditarNodo(String nombreEditar, Object[] elemento) {
        NodoConmutacion nodoEditar = BuscarNodo(nombreEditar);
        String nombre = elemento[0].toString();
        String proveedorHardware = elemento[1].toString();
        int anchoBandaMax = Integer.parseInt(elemento[2].toString());
        
        if (!nombreEditar.equalsIgnoreCase(nombre) && BuscarNodo(nombre) != null) {
            JOptionPane.showMessageDialog(null, "El nuevo NodoRed ya existe");
            return;
        }
        
        nodoEditar.getElemento().setNombre(nombre);
        nodoEditar.getElemento().setProveedorHardware(proveedorHardware);
        nodoEditar.getElemento().setAnchoBandaMax(anchoBandaMax);
    }
    
    public void EditarConexion(String origen, String destino, DetalleMedio dm) {
        NodoConmutacion nodoOrigen = BuscarNodo(origen);
        nodoOrigen.EditarArista(destino, dm);
    }
    
    public void ListarDfs(JTable control, NodoConmutacion root) {
        String[] Header = {"Nombre","Proveedor de Hardware","Ancho de Banda Max"};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
                
        Dfs(root, modTable);
    }
    
    private void Dfs(NodoConmutacion cur, DefaultTableModel modTable) {
        modTable.addRow(cur.getRegistro());
        cur.setVisitado(true);
       
        for (EnlaceDatos arista : cur.getAdyacentes()) {
            NodoConmutacion destino = arista.getDestino();
            if (destino.isVisitado()) continue;
            Dfs(destino, modTable);
        }
    }
    
    public void ListarBfs(JTable control,NodoConmutacion root) {
        String[] Header = {"Nombre","Proveedor de Hardware","Ancho de Banda Max"};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
        
        Queue<NodoConmutacion> cola = new LinkedList<>();
        cola.add(root);
        root.setVisitado(true);
        
        while(!cola.isEmpty()) {
            NodoConmutacion cur = cola.poll();
            modTable.addRow(cur.getRegistro());
            
            for(EnlaceDatos arista : cur.getAdyacentes()) {
                NodoConmutacion destino = arista.getDestino();
                
                if (destino.isVisitado()) continue;
                cur.setVisitado(true);
                cola.add(destino);
            }
        }
    }
    
    public void ListarEnlaces(JTable control) {
        String[] Header = {"Origen", "Destino"};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);

        for (NodoConmutacion origen : lista) {
            for (EnlaceDatos arista : origen.getAdyacentes()) {
                Object[] registro = {origen.getElemento().getNombre(),arista.getDestino().getElemento().getNombre()};
                modTable.addRow(registro);
            }
        }
    }
    
    public void CargarCombo(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        for (NodoConmutacion elemento : lista) {
            modCombo.addElement(elemento.getElemento().getNombre());
        }
    }
    
    public NodoConmutacion BuscarNodo(String nombre) {
        for (NodoConmutacion elemento : lista) {
            if (elemento.getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return elemento;
            }
        }
        return null;
    }
    
    public ArrayList<String> Dijkstra(NodoConmutacion origen,NodoConmutacion destino, String tipo, int prioridad, double pesoLatencia) {
        for (NodoConmutacion nodo : lista) {
            nodo.setDistancia(Double.MAX_VALUE);
            nodo.setAnterior(null);
            nodo.setVisitado(false);
        }
        
        PriorityQueue<NodoConmutacion> cola = new PriorityQueue<>((a,b) -> Double.compare(a.getDistancia(), b.getDistancia()));
        origen.setDistancia(0);
        cola.add(origen);
        
        while(!cola.isEmpty()) {
            NodoConmutacion cur = cola.poll();
            
            if (cur == destino) break;
            
            if (cur.isVisitado()) continue;
            cur.setVisitado(true);
            
            for (EnlaceDatos arista : cur.getAdyacentes()) {
                NodoConmutacion vecino = arista.getDestino();
                double peso = arista.ObtenerPeso(tipo, prioridad, pesoLatencia, 1-pesoLatencia);
                
                if (peso == Double.MAX_VALUE) continue;
                
                double nuevaDistancia = cur.getDistancia() + peso;
                if (nuevaDistancia < vecino.getDistancia()) {
                    vecino.setDistancia(nuevaDistancia);
                    vecino.setAnterior(cur);
                    cola.add(vecino);
                }
            }
        }
        
        ArrayList<String> camino = new ArrayList<>();
        
        NodoConmutacion cur = destino;
        
        if (destino.getDistancia() == Double.MAX_VALUE) {
            return new ArrayList<>();
        }
        while(cur != null) {
            camino.add(0, cur.getElemento().getNombre());
            cur = cur.getAnterior();
        }
        
        return camino;
    }   
}
