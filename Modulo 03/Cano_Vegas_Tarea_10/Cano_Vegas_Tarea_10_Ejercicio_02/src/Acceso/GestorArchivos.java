package Acceso;

import Control.ArregloPabellon;
import Modelo.EquipoBiomedico;
import Modelo.Pabellon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class GestorArchivos {
    public static void GuardarArchivos(Pabellon[] arreglo) {
        try (PrintWriter pw = new PrintWriter("equipos_medicos.txt")){
            for (Pabellon elemento : arreglo) {
                if (elemento == null) continue;
                
                pw.println("PABELLON;" + elemento.getCodigoPabellon()+";"+elemento.getPiso());
                elemento.getEquipos().GuardarEquipos(pw);
                pw.println();
            }   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void CargarArchivos(ArregloPabellon arreglo) {
        File archivo = new File("equipos_medicos.txt");
        if (!archivo.exists()) return;
        
        try (BufferedReader br = new BufferedReader(new FileReader("equipos_medicos.txt"))){
            String linea;
            Pabellon cur = null;
            
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                StringTokenizer st = new StringTokenizer(linea, ";");
                String primerCampo = st.nextToken();
                
                if (primerCampo.equalsIgnoreCase("PABELLON")) {
                    String codigoPabellon = st.nextToken();
                    int piso = Integer.parseInt(st.nextToken());
                    
                    Pabellon elemento = new Pabellon(codigoPabellon, piso);
                    arreglo.Agregar(elemento);
                    cur = elemento;
                } else {
                    int numSerie = Integer.parseInt(primerCampo);
                    String tipoEquipo = st.nextToken();
                    int horasUso = Integer.parseInt(st.nextToken());
                    String estadoMantenimiento = st.nextToken();
                    
                    EquipoBiomedico elemento = new EquipoBiomedico(numSerie, tipoEquipo, horasUso, estadoMantenimiento);
                    cur.getEquipos().Agregar(elemento);                    
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
