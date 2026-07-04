package Control;

import Modelo.Pedido;
import Modelo.Repartidor;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Delivery {
    private Map<String,Pedido> hashPedidos = new HashMap<>();
    private Map<String,Repartidor> hashRepartidores = new HashMap<>();
    
    public void AgregarPedido(Pedido elemento) {
        if (hashPedidos.get(elemento.getIdPedido()) != null) {
            JOptionPane.showMessageDialog(null, "El pedido ya existe");
            return;
        }
        
        hashPedidos.put(elemento.getIdPedido(), elemento);
    }
    
    public void AgregarRepartidor(Repartidor elemento) {
        if (hashRepartidores.get(elemento.getIdRepartidor()) != null) {
            JOptionPane.showMessageDialog(null, "El repartidor ya existe");
            return;
        }
        
        hashRepartidores.put(elemento.getIdRepartidor(), elemento);
    }
    
    public void AsignarPedido(String idPedido, String idRepartidor) {
        Repartidor objRepartidor = hashRepartidores.get(idRepartidor);
        Pedido objPedido = hashPedidos.get(idPedido);
        if (objRepartidor == null || objPedido == null) {
            JOptionPane.showMessageDialog(null,"Seleccione opciones validas");
            return;
        }
        objRepartidor.setDisponible(false);
        objPedido.setEstado("En Camino");
        objPedido.setIdRepartidorAsignado(idRepartidor);
    }
    
    public void FinalizarPedido(String idPedido) {
        Pedido objPedido = hashPedidos.get(idPedido);
        Repartidor objRepartidor = hashRepartidores.get(objPedido.getIdRepartidorAsignado());
        
        objPedido.setEstado("Entregado");
        objRepartidor.setDisponible(true);        
    }
    
    public String MostrarRepartidor(String idPedido) {
        Pedido objPedido = hashPedidos.get(idPedido);
        if (objPedido == null) {
            return null;
        }
        
        Repartidor objRepartidor = hashRepartidores.get(objPedido.getIdRepartidorAsignado());
        Object[] registro = objRepartidor.getRegistro();
        
        String msg = "ID: " + registro[0] + "\n"
                + "Ubicacion (X): " + registro[1] + "\n"
                + "Ubicacion (Y): " + registro[2] + "\n"
                + "Estado: " + registro[3];
        return msg;
    }
    
    public void MostrarPedidosRepartidor(JTable control,String idRepartidor) {
        String[] header = {"ID","Restaurante","Estado","Repartidor"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (Pedido cur : hashPedidos.values()) {
            if (cur.getIdRepartidorAsignado() == null) continue;
            if (cur.getIdRepartidorAsignado().equals(idRepartidor) || idRepartidor.equals("Todos")) {
                modTable.addRow(cur.getRegistro());
            }
        }
    } 
    
    public void EliminarPedidoFinalizado(String idPedido) {
        Pedido objPedido = hashPedidos.get(idPedido);
        if (!objPedido.getEstado().equals("Entregado")) {
            JOptionPane.showMessageDialog(null,"El Pedido aun no se entrega");
            return;
        }        
        hashPedidos.remove(idPedido);
    }
    
    public void ListarRepartidores(JTable control) {
        String[] header = {"ID","Ubicacion (X)","Ubicacion (Y)","Estado"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (Repartidor cur : hashRepartidores.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public void ListarPedidos(JTable control) {
        String[] header = {"ID","Restaurante","Estado","Repartidor"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (Pedido cur : hashPedidos.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public String MostrarPedidoId(String idPedido) {
        Pedido objPedido = hashPedidos.get(idPedido);
        if (objPedido == null) {
            return null;
        }
        
        Object[] registro = objPedido.getRegistro();
        
        String msg = "ID: " + registro[0] + "\n"
                + "Restaurante : " + registro[1] + "\n"
                + "Estado: " + registro[2] + "\n"
                + "Repartidor: " + registro[3];
        return msg;
    }
    
    public void ListarRepartidoresDisponibles(JTable control) {
        String[] header = {"ID","Ubicacion (X)","Ubicacion (Y)","Estado"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (Repartidor cur : hashRepartidores.values()) {
            if (cur.isDisponible()) {
                modTable.addRow(cur.getRegistro());                
            }
        }
    }
    
    public void ListarPedidosPendientes(JTable control, String restaurante) {
        String[] header = {"ID","Restaurante","Estado","Repartidor"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for (Pedido cur : hashPedidos.values()) {
            if (cur.getRestaurante().equalsIgnoreCase(restaurante) && cur.getEstado().equals("Pendiente")) {
                modTable.addRow(cur.getRegistro());                
            }
        }
    }
    
    public void LlenarComboRepartidores(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        modCombo.addElement("Todos");
        for (Repartidor cur : hashRepartidores.values()) {
            modCombo.addElement(cur.getIdRepartidor());
        }
    }
}
