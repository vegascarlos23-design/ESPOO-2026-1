package Control;

import Modelo.Libro;
import Modelo.RegistroPrestamo;
import Modelo.SalaEstudio;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloBiblioteca {

    private Libro[] ArregloLibro = new Libro[40];
    private SalaEstudio[] ArregloSalaEstudio = new SalaEstudio[15];
    private RegistroPrestamo[] ArregloRegistroPrestamo = new RegistroPrestamo[50];
    private int iLibro = 0;
    private int iSala = 0;
    private int iPrestamo = 0;

    public void RegistrarLibro(Libro dato) {
        try {
            if (buscarLinealLibro(dato.getIsbn()) == -1) {
                ArregloLibro[iLibro] = dato;
                iLibro++;
                quickSort(0, iLibro - 1);              
            } else {
                JOptionPane.showMessageDialog(null, "El ISBN del libro ya existe");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la mxima capacidad (40)");
        }
    }

    public void RegistrarSala(SalaEstudio dato) {
        try {
            if (buscarLinealSala(dato.getIdSala()) == -1) {
                ArregloSalaEstudio[iSala] = dato;
                iSala++;
                mergeSort(0, iSala-1);
            } else {
                JOptionPane.showMessageDialog(null, "El ID de la sala ya existe");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la mxima capacidad (15)");
        }
    }

    public void registrarPrestamo(RegistroPrestamo dato, String isbn, String idSala) {
        Libro objlibro = ArregloLibro[buscarLinealLibro(isbn)];
        SalaEstudio sala = ArregloSalaEstudio[buscarLinealSala(idSala)];
        try {
            if (!sala.isEstadoOcupacion()) {
                dato.setLibroSolicitado(objlibro);
                dato.setSalaAsignada(sala);
                sala.setEstadoOcupacion(true);

                ArregloRegistroPrestamo[iPrestamo] = dato;
                iPrestamo++;
            } else {
                JOptionPane.showMessageDialog(null, "La sala ya esta ocupada");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la mxima capacidad (50)");
        }
    }
    
    public void CancelarPrestamo(String ISBN, String IdSala) {
        for (int pos = 0; pos < iPrestamo; pos++) {
            if (ArregloRegistroPrestamo[pos].getLibroSolicitado().getIsbn().equalsIgnoreCase(ISBN) &&
                    ArregloRegistroPrestamo[pos].getSalaAsignada().getIdSala().equalsIgnoreCase(IdSala)){
                ArregloRegistroPrestamo[pos].getSalaAsignada().setEstadoOcupacion(false);
                for (int pos2 = pos; pos2 < iPrestamo-1; pos2++) {
                    ArregloRegistroPrestamo[pos2] = ArregloRegistroPrestamo[pos2+1];
                }
                ArregloRegistroPrestamo[iPrestamo-1] = null;
                iPrestamo--;
                break;
            }
        }
    }

    public void ListarLibros(JTable control) {
        
        String[] cabecera = {"ISBN", "Título", "Autor", "Año de publicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < iLibro; pos++) {
            modTabla.addRow(ArregloLibro[pos].getRegistro());
        }
    }

    public void ListarSalas(JTable control) {        
        String[] cabecera = {"ID", "Capacidad de sillas", "Equipamiento", "Estado de ocupación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < iSala; pos++) {
            modTabla.addRow(ArregloSalaEstudio[pos].getRegistro());
        }
    }
    
    public void ListarSalaFiltro(JTable control, String idSala) {
        String[] cabecera = {"ID", "Capacidad de sillas", "Equipamiento", "Estado de ocupación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        int pos = buscarLinealSala(idSala);
        if (pos != -1) {
            modTabla.addRow(ArregloSalaEstudio[pos].getRegistro());
        }           
    }

    public void ListarPrestamos(JTable control) {
        String[] cabecera = {"Libro", "Sala", "Nombre del estudiante", "Días de préstamo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < iPrestamo; pos++) {
            modTabla.addRow(ArregloRegistroPrestamo[pos].getRegistro());
        }
    }
    
    public void ListarPrestamosAutor(JTable control, String autor) {
        String[] cabecera = {"Libro", "Sala", "Nombre del estudiante", "Días de préstamo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < iPrestamo; pos++) {
            if (ArregloRegistroPrestamo[pos].getLibroSolicitado().getAutor().toUpperCase().contains(autor.toUpperCase())) {
                modTabla.addRow(ArregloRegistroPrestamo[pos].getRegistro());
            }          
        }
    }

    public int buscarLinealLibro(String isbn) {
        for (int pos = 0; pos < iLibro; pos++) {
            if (ArregloLibro[pos].getIsbn().equalsIgnoreCase(isbn)) {
                return pos;
            }
        }
        return -1;
    }

    public int buscarLinealSala(String idSala) {
        for (int pos = 0; pos < iSala; pos++) {
            if (ArregloSalaEstudio[pos].getIdSala().equalsIgnoreCase(idSala)) {
                return pos;
            }
        }
        return -1;
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);

            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = ArregloLibro[high].getAnioPublicacion();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (ArregloLibro[j].getAnioPublicacion() <= pivot) {
                i++;
                Libro temp = ArregloLibro[i];
                ArregloLibro[i] = ArregloLibro[j];
                ArregloLibro[j] = temp;
            }
        }
        Libro temp = ArregloLibro[i + 1];
        ArregloLibro[i + 1] = ArregloLibro[high];
        ArregloLibro[high] = temp;
        return i + 1;
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left+right)/2;

            mergeSort(left, mid);
            mergeSort(mid+1, right);

            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        SalaEstudio[] L = new SalaEstudio[n1];
        SalaEstudio[] R = new SalaEstudio[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = ArregloSalaEstudio[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = ArregloSalaEstudio[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].getCapacidadSillas() <= R[j].getCapacidadSillas()) {
                ArregloSalaEstudio[k] = L[i];
                i++;
            } else {
                ArregloSalaEstudio[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            ArregloSalaEstudio[k] = L[i];
            i++; k++;
        }

        while (j < n2) {
            ArregloSalaEstudio[k] = R[j];
            j++; k++;
        }
    }

}
