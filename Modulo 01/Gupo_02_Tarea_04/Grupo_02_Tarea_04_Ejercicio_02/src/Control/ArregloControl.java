package Control;

import Modelo.Componente;
import Modelo.Proveedor;
import Modelo.OrdenCompra;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloControl {
    // ----------------
    // --- ARREGLOS ---
    // ----------------
    // Arreglo Proveedores
    Proveedor[] arregloProveedores = new Proveedor[8];
    int cantProveedores = 0;
    
    // Arreglo Componentes
    Componente[] arregloComponente = new Componente[20];
    int cantComponentes = 0;
    
    // Arreglo Ordenes de Compra
    OrdenCompra[] arregloOrdenes = new OrdenCompra[30];
    int cantOrdenes = 0;
    
    // -------------------------
    // --- REGISTRAR OBJETOS ---
    // -------------------------
    // Registrar un proveedor
    public void registrarProveedor(Proveedor dato){
        try {
            if (buscarProveedor(dato.getRucProveedor()) == -1){
                arregloProveedores[cantProveedores] = dato;
                cantProveedores++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Lista de proveedores llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Registrar un Componente
    public void registrarComponente(Componente dato){
        try {
            if (buscarComponente(dato.getCodComponente()) == -1){
                arregloComponente[cantComponentes] = dato;
                cantComponentes++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Lista de componentes llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Registrar una orden
    public void registrarOrden(String ruc, int codigo, int cantidad){
        try  {
            int posProveedor = buscarProveedor(ruc);
            int posComponente = buscarComponente(codigo);
            
            if (posProveedor == -1 || posComponente == -1){
                JOptionPane.showMessageDialog(null, 
                        "Proveedor o componente no encontrado",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Proveedor objProveedor = arregloProveedores[posProveedor];
            Componente objComponente = arregloComponente[posComponente];
            
            OrdenCompra objOrden = new OrdenCompra(objProveedor, objComponente, cantidad);
            arregloOrdenes[cantOrdenes] = objOrden;
            cantOrdenes++;
            
            objProveedor.setDeudaPendiente(objProveedor.getDeudaPendiente() + objOrden.getSubTotalOrden());
            
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Lista de ordenes llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // ---------------------------------------------------------
    // --- RETORNAR POSICIÓN DE UN OBJETO POR LLAVE PRIMARIA ---
    // ---------------------------------------------------------
    // Retornar posición de proveedor por RUC
    public int buscarProveedor(String ruc){
        for (int j = 0; j < cantProveedores; j++){
            if (arregloProveedores[j].getRucProveedor().equalsIgnoreCase(ruc)){
                return j;
            }
        }
        return -1;
    }
    
    // Retornar posición de Componente por código
    public int buscarComponente(int codigo){
        for (int j = 0; j < cantComponentes; j++){
            if (arregloComponente[j].getCodComponente() == codigo){
                return j;
            }
        }
        
        return -1;
    }
    
    // ---------------------------
    // --- MÉTODOS ADICIONALES ---
    // ---------------------------
    public void pagarDeuda(String ruc, double monto){
        int pos = buscarProveedor(ruc);
        
        if (pos == -1){
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado",
                    "¡Atención!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Proveedor objProveedor = arregloProveedores[pos];
        double nuevaDeuda = objProveedor.getDeudaPendiente() - monto;
        
        if (nuevaDeuda < 0){nuevaDeuda = 0;}
        
        objProveedor.setDeudaPendiente(nuevaDeuda);
        
        JOptionPane.showMessageDialog(null, "Pago realizado correctamente",
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // --------------------------
    // ---BÚSQUEDA DE OBJETOS ---
    // --------------------------
    // Lista a todos los objetos por el RUC de su proveedor
    public void buscarOrdenesPorRuc(JTable control, String ruc){
        String[] cabecera = {"Proveedor", "Componente", "Unidades", "Sub Total"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        boolean encontrado = false;
        
        for (int i = 0; i < cantOrdenes; i++){
            if (arregloOrdenes[i].getProveedorVendedor().getRucProveedor().equalsIgnoreCase(ruc)){
                modTabla.addRow(arregloOrdenes[i].getRegistro());
                encontrado = true;
            }
        }
        
        if (!encontrado){
            JOptionPane.showMessageDialog(null,
                    "No se encontraron órdenes para ese proveedor",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Busca y lista a un componente con un código en específico
    public void mostrarComponente(JTable control, int codigo){
        int pos = buscarComponente(codigo);
        
        if (pos == -1){
            JOptionPane.showMessageDialog(null, "Componente no encontrado",
                    "¡Atención!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String[] cabecera = {"Código", "Nombre", "Marca", "Precio Unitario"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        modTabla.addRow(arregloComponente[pos].getRegistro());
    }
    
    // ----------------------------------------
    // --- MÉTODOS PARA LISTAR EN UN JTABLE ---
    // ----------------------------------------
    // Lista los proveedores en un JTable
    public void listarProveedores(JTable control){
        String[] cabecera = {"RUC", "Razón social", "Calificación", "Deuda"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        for (int i = 0; i < cantProveedores; i++){
            modTabla.addRow(arregloProveedores[i].getRegistro());
        }
    }
    
    // Lista a los componentes en un JTable
    public void listarComponentes(JTable control){
        String[] cabecera = {"Código", "Nombre", "Marca", "Precio Unitario"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        for (int i = 0; i < cantComponentes; i++){
            modTabla.addRow(arregloComponente[i].getRegistro());
        }
    }
    
    // Lista a las ordenes en un JTable
    public void listarOrdenes(JTable control){
        String[] cabecera = {"Proveedor", "Componente", "Unidades", "Sub Total"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        for (int i = 0; i < cantOrdenes; i++){
            modTabla.addRow(arregloOrdenes[i].getRegistro());
        }
    }
    
    // -------------------------------
    // --- MÉTODOS DE ORDENAMIENTO ---
    // -------------------------------
    // Ordena a los proveedores por su deuda pendiente
    public void quickSortProveedores(int izq, int der){
        int i = izq;
        int j = der;
        
        double pivote = arregloProveedores[(izq + der)/2].getDeudaPendiente();
        
        while (i <= j){
            while (arregloProveedores[i].getDeudaPendiente() < pivote) i++;
            while (arregloProveedores[j].getDeudaPendiente() > pivote) j--;
            
            if (i <= j){
                Proveedor temp = arregloProveedores[i];
                arregloProveedores[i] = arregloProveedores[j];
                arregloProveedores[j] = temp;
                i++;
                j--;
            }
        }
        
        if (izq < j) quickSortProveedores(izq, j);
        if (i < der) quickSortProveedores(i, der);
    }
    
    // Ordena a los componentes por su precio
    public void mergeSortComponentes(int izq, int der){
        if (izq < der){
            int med = (izq + der) / 2;
            
            mergeSortComponentes(izq, med);
            mergeSortComponentes(med + 1, der);
            
            merge(izq, med, der);
        }
    }
    
    private void merge(int izq, int med, int der){
        int n1 = med - izq + 1;
        int n2 = der - med;
        
        Componente[] izqArr = new Componente[n1];
        Componente[] derArr = new Componente[n2];
        
        for (int i = 0; i < n1; i++){
            izqArr[i] = arregloComponente[izq + i];
        }
        
        for (int j = 0; j < n2; j++){
            derArr[j] = arregloComponente[med + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int k = izq;
        
        while (i < n1 && j < n2){
            if (izqArr[i].getPrecioUnitario() <= derArr[j].getPrecioUnitario()){
                arregloComponente[k] = izqArr[i];
                i++;
            } else {
                arregloComponente[k] = derArr[j];
                j++;
            }
            
            k++;
        }
        
        while (i < n1){
            arregloComponente[k] = izqArr[i];
            i++;
            k++;
        }
        
        while (j < n2){
            arregloComponente[k] = derArr[j];
            j++;
            k++;
        }
    }
    
    // Llama a los métodos de ordenamiento()
    public void ordenarProveedoresPorMont(){
        if (cantProveedores > 0){
            quickSortProveedores(0, cantProveedores - 1); 
        }
    }
    
    public void ordenarComponentesPorPrecio(){
        if (cantComponentes > 0){
            mergeSortComponentes(0, cantOrdenes  - 1);
        }
    }
    
    // ---------------
    // --- GETTERS ---
    // ---------------
    public int getCantidadProveedores(){
        return cantProveedores;
    }
    
    public int getCantidadComponentes(){
        return cantComponentes;
    }
    
    public Proveedor getProveedor(int i){
        return arregloProveedores[i];
    }
    
    public Componente getComponente(int i){
        return arregloComponente[i];
    }
}
