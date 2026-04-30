package Acceso;

import Control.Arreglo_Estudiantes;
import Modelo.Estudiantes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class GestorArchivos {

    private static String fileName = "Estudiantes.txt";

    public static void Guardar(Arreglo_Estudiantes objArreglo_Estudiantes) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            int i = objArreglo_Estudiantes.getI();
            Estudiantes[] arreglo = objArreglo_Estudiantes.getArreglo();

            for (int pos = 0; pos < i; pos++) {
                pw.println(arreglo[pos].getCadena());
            }
            fw.close();
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "muck");
        }
    }

    public static void Abrir(Arreglo_Estudiantes objArreglo_Estudiantes) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            Estudiantes objEstudiantes;
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ";");

                String Nombre = st.nextToken();
                String Apellido = st.nextToken();
                int Edad = Integer.parseInt(st.nextToken());
                int Salon = Integer.parseInt(st.nextToken());
                int DNI = Integer.parseInt(st.nextToken());

                objEstudiantes = new Estudiantes(Nombre, Apellido, Edad, Salon, DNI);
                objArreglo_Estudiantes.Agregar(objEstudiantes);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"muck");
        }
    }
}
