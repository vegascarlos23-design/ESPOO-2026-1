package Control;

import Modelo.CitaMedica;
import Modelo.Especialidad;
import Modelo.Medico;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglos {
    // ===============================================
    // --- DEFINICIÓN E INICIALIZACIÓN DE ARREGLOS ---
    // ===============================================

    // Definimos e inicializamos el arreglo de tipo Especialidad
    private Especialidad[] arregloEspecialidades = new Especialidad[10];
    private int cantEspecialidades = 0;

    // Definimos e inicializamos el arreglo de tipo Medico
    private Medico[] arregloMedicos = new Medico[12];
    private int cantMedicos = 0;

    // Definimos e inicializamos el arreglo de tipo CitaMedica
    private CitaMedica[] arregloCitas = new CitaMedica[25];
    private int cantCitas = 0;
    
    
    // ---------------
    // --- GETTERS ---
    // ---------------
    public Especialidad getEspecialidad(int pos){
        return arregloEspecialidades[pos];
    }
    
    public Medico getMedico(int pos){
        return arregloMedicos[pos];
    }
    
    public int getCantidadEspecialidades(){
        return cantEspecialidades;
    }
    
    public int getCantidadMedicos(){
        return cantMedicos;
    }
    
    // =========================================================
    // ---  REGISTRAR DATOS (ESPECIALIDADES, MEDICOS, CITAS) ---
    // =========================================================
    // Método para registrar una cita
    public void registrarEspecialidad(Especialidad dato) {
        try {
            if (buscarEspecialidad(dato.getCodEspecialidad()) == -1) {
                arregloEspecialidades[cantEspecialidades] = dato;
                cantEspecialidades++;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ya existe otra especialidad con ese código",
                        "¡Advertencia!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lista de especialidades llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para registrar un médico
    public void registrarMedico(Medico dato) {
        try {
            if (buscarMedico(dato.getDniMedico()) == -1) {
                arregloMedicos[cantMedicos] = dato;
                cantMedicos++;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ya existe un médico registrado con este DNI",
                        "¡Advertencia!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lista de médicos llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para registrar una cita
    public void registrarCita(CitaMedica dato, String dni, String codigo) {
        int posMed = buscarMedico(dni);
        int posEsp = buscarEspecialidad(codigo);

        if (posMed == -1 || posEsp == -1) {
            JOptionPane.showMessageDialog(null, "Médico o especialidad no encontrados",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            CitaMedica objCita = dato;

            arregloCitas[cantCitas] = objCita;
            cantCitas++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lista de citas médicas llena",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ===========================================================================
    // --- RETORNAR POSICIÓN DE UN OBJETO EN EL ARREGLO POR UNA LLAVE PRIMARIA ---
    // ===========================================================================
    // Buscar una especialidad por su código y retornar su posición
    public int buscarEspecialidad(String codigo) {
        for (int j = 0; j < cantEspecialidades; j++) {
            if (arregloEspecialidades[j].getCodEspecialidad().equalsIgnoreCase(codigo)) {
                return j;
            }
        }
        return -1;
    }

    // Buscar un médico por su DNI y retornar su posición
    public int buscarMedico(String dni) {
        for (int j = 0; j < cantMedicos; j++) {
            if (arregloMedicos[j].getDniMedico().equalsIgnoreCase(dni)) {
                return j;
            }
        }
        return -1;
    }

    // =======================================================
    // --- BUSCAR OBJETOS POR UN DATO Y RETORNAR EL OBJETO ---
    // =======================================================
    // Lista en un JTable a todos los médico que pertenezcan a cierta especialidad
    public void buscarMedicosPorArea(JTable control, String nombreArea) {
        String[] cabecera = {"DNI", "Nombre", "Años Exp.", "Horas Sem.", "Especialidad"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        int encontrados = 0;

        for (int j = 0; j < cantMedicos; j++) {
            if (arregloMedicos[j].getEspecialidad().getNombreArea().equalsIgnoreCase(nombreArea)) {
                modTabla.addRow(arregloMedicos[j].getRegistro());
                encontrados++;
            }
        }

        if (encontrados == 0) {
            JOptionPane.showMessageDialog(null,
                    "No se encontraron coincidencias",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Encuentra a una especialidad por su código y lo lista
    public void buscarEspecialidadPorCodigo(JTable control, String codigo) {
        String[] cabecera = {"Código", "Área", "Costo", "Piso"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        boolean encontrado = false;

        for (int j = 0; j < cantEspecialidades; j++) {
            if (arregloEspecialidades[j].getCodEspecialidad().equalsIgnoreCase(codigo)) {
                modTabla.addRow(arregloEspecialidades[j].getRegistro());

                encontrado = true;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe alguna especialidad con ese código",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ===============================
    // --- MÉTODOS DE ORDENAMIENTO ---
    // ===============================
    // Ordenar a los Médicos por experiencia usando Quick Sort
    private void quickSortMedicos(int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = arregloMedicos[(izq + der) / 2].getAniosExperiencia();

        while (i <= j) {
            while (arregloMedicos[i].getAniosExperiencia() < pivote) {
                i++;
            }
            while (arregloMedicos[j].getAniosExperiencia() > pivote) {
                j--;
            }

            if (i <= j) {
                Medico temp = arregloMedicos[i];
                arregloMedicos[i] = arregloMedicos[j];
                arregloMedicos[j] = temp;
                i++;
                j--;
            }
        }

        if (izq < j) {
            quickSortMedicos(izq, j);
        }
        if (i < der) {
            quickSortMedicos(i, der);
        }
    }

    // Ordenar a las citas por el monto
    private void mergeSortCitas(int izq, int der) {
        if (izq < der) {
            int med = (izq + der) / 2;
            mergeSortCitas(izq, med);
            mergeSortCitas(med + 1, der);
            merge(izq, med, der);
        }
    }

    // Fusiona dos arreglos ordenados en uno solo ordenado
    private void merge(int izq, int med, int der) {
        int n1 = med - izq + 1;
        int n2 = der - med;

        CitaMedica[] citasIzq = new CitaMedica[n1];
        CitaMedica[] citasDer = new CitaMedica[n2];

        for (int i = 0; i < n1; i++) {
            citasIzq[i] = arregloCitas[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            citasDer[j] = arregloCitas[med + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = izq;

        while (i < n1 && j < n2) {
            if (citasIzq[i].getMontoFinal() <= citasDer[j].getMontoFinal()) {
                arregloCitas[k] = citasIzq[i];
                i++;
            } else {
                arregloCitas[k] = citasDer[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arregloCitas[k++] = citasIzq[i++];
        }

        while (j < n2) {
            arregloCitas[k++] = citasDer[j++];
        }
    }

    // Llama a los métodos de ordenamiento
    public void ordenarCitasPorMonto() {
        if (cantCitas > 0) {
            mergeSortCitas(0, cantCitas - 1);
        }
    }

    public void ordenarMedicosPorExp() {
        if (cantMedicos > 0) {
            quickSortMedicos(0, cantMedicos - 1);
        }
    }

    // =================================
    // --- LISTA DATOS EN UN JTABLE ---
    // =================================
    public void ordenarMedicos(JTable control) {
        String[] cabecera = {"DNI", "Nombres", "Años Exp.", "Horas Sem.", "Especialidad"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (int j = 0; j < cantMedicos; j++) {
            modTabla.addRow(arregloMedicos[j].getRegistro());
        }
    }

    public void ordenarEspecialidades(JTable control) {
        String[] cabecera = {"Código Especialidad", "´Área", "Costo consulta", "Piso ubicacion"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (int j = 0; j < cantEspecialidades; j++) {
            modTabla.addRow(arregloEspecialidades[j].getRegistro());
        }
    }

    public void ordenarCitas(JTable control) {
        String[] cabecera = {"Médico", "Especialidad", "Fecha Cita", "Monto"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (int j = 0; j < cantCitas; j++) {
            modTabla.addRow(arregloCitas[j].getRegistro());
        }
    }
}
