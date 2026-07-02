package Control;

import Modelo.Microservicio;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {
    private ArrayList<NodoMicroservicio> lista;

    public Grafo() {
        lista = new ArrayList<>();
    }
    
    public void AgregarNodo(Microservicio elemento) {
        if (BuscarNodo(elemento.getNombre()) != null) {
            JOptionPane.showMessageDialog(null, "El Microservicio ya existe");
            return;
        }
        
        NodoMicroservicio newNode = new NodoMicroservicio(elemento);
        lista.add(newNode);
    }
    
    public void EditarNodo(String nombreEditar, Object[] elemento) {
        NodoMicroservicio nodoEditar = BuscarNodo(nombreEditar);
        String nombre = elemento[0].toString();
        String ipContenedor = elemento[1].toString();
        
        if (!nombre.equalsIgnoreCase(nombreEditar) && BuscarNodo(nombre) != null) {
            JOptionPane.showMessageDialog(null, "El nuevo nombre de el Microservicio ya existe");
        } else {
            nodoEditar.getElemento().setNombre(nombre);
            nodoEditar.getElemento().setIpContenedor(ipContenedor);
        }
    }
    
    public void EliminarNodo(String nombre) {
        NodoMicroservicio nodoEliminar = BuscarNodo(nombre);
        
        String desconectados = "";
        for (PeticionRed arista : nodoEliminar.getAdyacentes()) {
            NodoMicroservicio destino = arista.getDestino();
            desconectados += destino.getElemento().getNombre() + "\n";
        }
        if (desconectados.isEmpty()) desconectados = "Ninguno";
        
        int rpta = JOptionPane.showConfirmDialog(null, "Microservicios desconectados:\n" + desconectados, "Desea Eliminar?", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if (rpta == JOptionPane.OK_OPTION) {
            for(NodoMicroservicio nodo : lista) {
                nodo.getAdyacentes().removeIf(arista -> arista.getDestino() == nodoEliminar);
            }
            lista.remove(nodoEliminar);
        }
    }
    
    public void AgregarConexion(String origen, PeticionRed conexion) {
        NodoMicroservicio nodoOrigen = BuscarNodo(origen);
        nodoOrigen.AgregarArista(conexion);
    }
    
    public void EditarConexion(String origen, String destino,double latenciaMs, double cargaDatosKb) {
        NodoMicroservicio nodoOrigen = BuscarNodo(origen);
        nodoOrigen.EditarArista(nodoOrigen.BuscarArista(destino), latenciaMs, cargaDatosKb);
    }
    
    public void EliminarConexion(String origen, String destino) {
        NodoMicroservicio nodoOrigen = BuscarNodo(origen);
        nodoOrigen.EliminarArista(nodoOrigen.BuscarArista(destino));        
    }
    
    
    public NodoMicroservicio BuscarNodo(String nombre) {
        for (int pos = 0; pos < lista.size(); pos++) {
            if (lista.get(pos).getElemento().getNombre().equalsIgnoreCase(nombre)) {
                return lista.get(pos);
            }
        }
        return null;
    }
    
    public void ListarDfs(JTable control, NodoMicroservicio root) {
        String[] Header = {"Nombre","Ip Contenedor",""};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
                
        Dfs(root, modTable);
    }
    
    private void Dfs(NodoMicroservicio cur, DefaultTableModel modTable) {
        modTable.addRow(cur.getRegistro());
        cur.setVisitado(true);
        String conexiones = "";
        
        for(PeticionRed arista : cur.getAdyacentes()) {
            NodoMicroservicio destino = arista.getDestino();
            conexiones += "[" + destino.getElemento().getNombre() + 
                    " (" + arista.getLatenciaMs() + "ms) " + arista.getCargaDatosKb() +"kb]";
        }
        
        if (modTable.getColumnCount() > 0) {
            modTable.setValueAt(conexiones, modTable.getRowCount()-1, 2);
        }
        
        for (PeticionRed arista : cur.getAdyacentes()) {
            NodoMicroservicio destino = arista.getDestino();
            if (destino.isVisitado()) continue;
            Dfs(destino, modTable);
        }
    }
    
    public void ListarBfs(JTable control,NodoMicroservicio root) {
        String[] Header = {"Nombre","Ip Contenedor",""};
        DefaultTableModel modTable = new DefaultTableModel(Header, 0);
        control.setModel(modTable);
        
        if (root == null) return;
        
        for (int pos = 0; pos < lista.size(); pos++) {
            lista.get(pos).setVisitado(false);
        }
        
        Queue<NodoMicroservicio> cola = new LinkedList<>();
        cola.add(root);
        
        while(!cola.isEmpty()) {
            NodoMicroservicio cur = cola.poll();
            modTable.addRow(cur.getRegistro());
            cur.setVisitado(true);
            String conexiones = "";
            
            for(PeticionRed arista : cur.getAdyacentes()) {
                NodoMicroservicio destino = arista.getDestino();
                conexiones += "[" + destino.getElemento().getNombre() + 
                    " (" + arista.getLatenciaMs() + "ms) " + arista.getCargaDatosKb() +"kb]";
                
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

            for (PeticionRed arista : lista.get(i).getAdyacentes()) {
                int j = lista.indexOf(arista.getDestino());
                fila[j+1] = arista.getLatenciaMs();
            }
            modelo.addRow(fila);
        }
        control.setModel(modelo);
    }   
}

