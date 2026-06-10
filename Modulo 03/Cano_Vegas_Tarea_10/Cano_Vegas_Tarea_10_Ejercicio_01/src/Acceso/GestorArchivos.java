package Acceso;

import Control.ArregloAlmacen;
import Modelo.Almacen;
import Modelo.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class GestorArchivos {
    public static void GuardarDatos(Almacen[] arreglo) {
        try (PrintWriter pw = new PrintWriter("inventario.txt")) {
            for(Almacen elemento : arreglo) {
                if (elemento == null) continue;
                
                pw.println("ALMACEN;" + elemento.getNombreAlmacen());
                elemento.getProductos().GuardarProductos(pw);
                pw.println();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void CargarDatos(ArregloAlmacen objAlmacen) {
        File archivo = new File("inventario.txt");
        if (!archivo.exists()) return;
        
        try (BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))) {
            String linea;
            Almacen cur = null;
            
            while((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                StringTokenizer st = new StringTokenizer(linea, ";");
                String primerCampo = st.nextToken();
                
                if (primerCampo.equalsIgnoreCase("ALMACEN")) {
                    String nombre = st.nextToken();
                    Almacen elemento = new Almacen(nombre);
                    objAlmacen.Registrar(elemento);
                    
                    cur = elemento;                   
                } else {
                    int codigoSKU = Integer.parseInt(primerCampo);
                    String nombre = st.nextToken();
                    int stock = Integer.parseInt(st.nextToken());
                    double precio = Double.parseDouble(st.nextToken());
                    
                    Producto elemento = new Producto(codigoSKU, nombre, stock, precio);
                    
                    cur.getProductos().Agregar(elemento);
                }
            }          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
