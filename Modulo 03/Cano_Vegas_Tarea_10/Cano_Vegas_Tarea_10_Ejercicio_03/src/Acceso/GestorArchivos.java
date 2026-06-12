package Acceso;

import Control.ArregloCarrera;
import Modelo.AlumnoMatriculado;
import Modelo.Carrera;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class GestorArchivos {
    public static void GuardarArchivos(Carrera[] arreglo) {
        try (PrintWriter pw = new PrintWriter("matriculas_universitarias.txt")){
            for (Carrera elemento : arreglo) {
                if (elemento == null) continue;
                
                pw.println("CARRERA;" + elemento.getNombreCarrera()+";"+elemento.getFacultad());
                elemento.getEquipos().GuardarAlumnos(pw);
                pw.println();
            }   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void CargarArchivos(ArregloCarrera arreglo) {
        File archivo = new File("matriculas_universitarias.txt");
        if (!archivo.exists()) return;
        
        try (BufferedReader br = new BufferedReader(new FileReader("matriculas_universitarias.txt"))){
            String linea;
            Carrera cur = null;
            
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                StringTokenizer st = new StringTokenizer(linea, ";");
                String primerCampo = st.nextToken();
                
                if (primerCampo.equalsIgnoreCase("CARRERA")) {
                    String nombreCarrera = st.nextToken();
                    String facultad = st.nextToken();
                    
                    Carrera elemento = new Carrera(nombreCarrera, facultad);
                    arreglo.Agregar(elemento);
                    cur = elemento;
                } else {
                    int codEstudiante = Integer.parseInt(primerCampo);
                    String nombreCompleto = st.nextToken();
                    double promedioPonderado = Double.parseDouble(st.nextToken());
                    String situacionAcademica = st.nextToken();
                    
                    AlumnoMatriculado elemento = new AlumnoMatriculado(codEstudiante, nombreCompleto, promedioPonderado, situacionAcademica);
                    cur.getEquipos().Agregar(elemento);                    
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
