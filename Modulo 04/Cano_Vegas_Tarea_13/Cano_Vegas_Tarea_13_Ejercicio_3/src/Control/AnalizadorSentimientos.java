package Control;

import Modelo.UsuarioRed;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AnalizadorSentimientos {

    private Map<String, Integer> hashDiccionario = new HashMap<>();
    private Map<String, Integer> hashFrecuenciaPalabras = new HashMap<>();
    private Map<String, UsuarioRed> hashPerfilUsuarios = new HashMap<>();

    public void RegistrarPalabra(String palabra, int puntuacion) {
        if (hashDiccionario.get(palabra) != null) {
            JOptionPane.showMessageDialog(null, "La palabra ya existe");
            return;
        }
        hashDiccionario.put(palabra, puntuacion);
    }

    public void EditarPuntuacion(String palabra, int puntuacion) {
        if (hashDiccionario.get(palabra) == null) {
            JOptionPane.showMessageDialog(null, "La palabra no existe");
            return;
        }
        hashDiccionario.put(palabra, puntuacion);
    }

    public void RegistrarUsuario(UsuarioRed usuario) {
        if (hashPerfilUsuarios.get(usuario.getIdUsuario()) != null) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
            return;
        }
        hashPerfilUsuarios.put(usuario.getIdUsuario(), usuario);
    }

    public void AgregarTema(String idUsuario, String tema) {
        UsuarioRed objUsuario = hashPerfilUsuarios.get(idUsuario);

        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            return;
        }
        objUsuario.getTemasInteres().add(tema);
    }
    
    public void EditarTemaInteres(String idUsuario, String temaAnterior, String temaNuevo) {
        UsuarioRed objUsuario = hashPerfilUsuarios.get(idUsuario);

        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            return;
        }
        if (!objUsuario.getTemasInteres().contains(temaAnterior)) {
            JOptionPane.showMessageDialog(null, "El tema no existe");
            return;
        }
        int pos = objUsuario.getTemasInteres().indexOf(temaAnterior);
        objUsuario.getTemasInteres().set(pos, temaNuevo);
    }

    private int AnalizarTexto(String texto) {
        int suma = 0;
        String palabras[] = texto.split("\\s+");
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            if (hashDiccionario.get(palabra) != null) {
                suma += hashDiccionario.get(palabra);
                if (hashFrecuenciaPalabras.get(palabra) == null) {
                    hashFrecuenciaPalabras.put(palabra, 1);
                } else {
                    hashFrecuenciaPalabras.put(palabra, hashFrecuenciaPalabras.get(palabra) + 1);
                }
            }
        }
        return suma;
    }

    public void RegistrarAnalisis(String idUsuario, String texto) {
        UsuarioRed objUsuario = hashPerfilUsuarios.get(idUsuario);
        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            return;
        }
        int puntuacion = AnalizarTexto(texto);
        if (puntuacion > 0) {
            JOptionPane.showMessageDialog(null, "Analizis Positivo");
        } else if (puntuacion < 0) {
            JOptionPane.showMessageDialog(null, "Analizis Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Analizis Neutro");
        }
        objUsuario.setPuntuacionPromedio(puntuacion);
    }

    public String BuscarUsuario(String idUsuario) {
        UsuarioRed objUsuario = hashPerfilUsuarios.get(idUsuario);
        if (objUsuario == null) {
            return null;
        }
        Object registro[] = objUsuario.getRegistro();
        String msg = "ID: " + registro[0]
                + "\nTemas: " + registro[1]
                + "\nPuntuacion Promedio: " + registro[2];

        return msg;
    }

    public void ListarUsuarios(JTable control) {
        String header[] = {"ID", "Temas", "Puntuacion"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        for (UsuarioRed cur : hashPerfilUsuarios.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public void ListarTemas(JList control, String idUsuario) {
        DefaultListModel modList = new DefaultListModel();
        control.setModel(modList);
        
        UsuarioRed objUsuario = hashPerfilUsuarios.get(idUsuario);
        for(String tema : objUsuario.getTemasInteres()) {
            modList.addElement(tema);
        }
    }
    
    public void ListarPalabras(JTable control) {
        String[] header = {"Palabra","Puntuacion"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        
        for(Map.Entry<String,Integer> cur : hashDiccionario.entrySet()) {
            modTable.addRow(new Object[]{cur.getKey(), cur.getValue()});
        }
    }

    public void FiltrarUsuarios(JTable control, String tema) {
        String header[] = {"ID", "Temas", "Puntuacion"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);
        for (UsuarioRed cur : hashPerfilUsuarios.values()) {
            if (cur.getPuntuacionPromedio() > 0 && cur.getTemasInteres().contains(tema)) {
                modTable.addRow(cur.getRegistro());
            }
        }
    }

    public void LlenarComboUsuarios(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);

        for (UsuarioRed cur : hashPerfilUsuarios.values()) {
            modCombo.addElement(cur.getIdUsuario());
        }
    }

}