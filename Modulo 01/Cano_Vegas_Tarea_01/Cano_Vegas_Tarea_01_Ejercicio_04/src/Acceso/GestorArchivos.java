package Acceso;

import control.Arreglo_Empleados;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import modelo.Empleado;


public class GestorArchivos {
    private static String fileName = "Empleados.txt";
    public static void Guardar(Arreglo_Empleados objArreglo_Empleados) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            int i = objArreglo_Empleados.getI();
            Empleado[] arreglo = objArreglo_Empleados.getArreglo();
            
            for (int pos = 0; pos < i; pos++) {
                pw.println(arreglo[pos].getCadena());
            }
            fw.close();
            pw.close();                      
        } catch (Exception e) {           
        }
    }
    
    public static void Abrir(Arreglo_Empleados objArreglo_Empleados) {
        try {
            Empleado objEmpleado;
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            
            String lineaT = null;
            while((lineaT = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(lineaT, ";");
                
                String Dni = st.nextToken();
                String nombre = st.nextToken();
                String cargo = st.nextToken();
                double suledo = Double.parseDouble(st.nextToken());
                String fechaInicio = st.nextToken();
                
                objEmpleado = new Empleado(Dni, nombre, cargo, suledo, fechaInicio);
                objArreglo_Empleados.Agregar(objEmpleado);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
        }
    }
}
