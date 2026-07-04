package Control;

import Modelo.Pelicula;
import Modelo.Usuario;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Streaming {

    private Map<String, Pelicula> hashPeliculas = new HashMap<>();
    private Map<String, Usuario> hashUsuarios = new HashMap<>();
    private Map<String, Map<String, Integer>> hashInteracciones = new HashMap<>();

    public void RegistrarPelicula(Pelicula pelicula) {
        if (hashPeliculas.get(pelicula.getIdPelicula()) != null) {
            JOptionPane.showMessageDialog(null, "La pelicula ya existe");
            return;
        }

        hashPeliculas.put(pelicula.getIdPelicula(), pelicula);
    }

    public void RegistrarUsuario(Usuario usuario) {
        if (hashUsuarios.get(usuario.getIdUsuario()) != null) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
            return;
        }

        hashUsuarios.put(usuario.getIdUsuario(), usuario);
        hashInteracciones.put(usuario.getIdUsuario(), new HashMap<>());
    }

    public void AgregarActor(String idPelicula, String actor) {
        Pelicula obj = hashPeliculas.get(idPelicula);
        if (obj == null) {
            JOptionPane.showMessageDialog(null, "La pelicula no existe");
            return;
        }

        obj.getElenco().add(actor);
    }

    public void AgregarGeneroFavorito(String idUsuario, String genero) {
        Usuario obj = hashUsuarios.get(idUsuario);

        if (obj == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            return;
        }

        obj.getGenerosFavoritos().add(genero);
    }

    public void AgregarCalificacion(String idUsuario, String idPelicula, int nota) {
        if (hashUsuarios.get(idUsuario) == null || hashPeliculas.get(idPelicula) == null) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
            return;
        }
        hashInteracciones.get(idUsuario).put(idPelicula, nota);
        hashUsuarios.get(idUsuario).getHistorialVisualizaciones().add(idPelicula);
    }

    public void EliminarPelicula(String idPelicula) {
        if (hashPeliculas.get(idPelicula) == null) {
            JOptionPane.showMessageDialog(null, "No existe");
            return;
        }

        hashPeliculas.remove(idPelicula);

        for (Map<String, Integer> cur : hashInteracciones.values()) {
            cur.remove(idPelicula);
        }
    }

    public void ListarPeliculas(JTable control) {
        String header[] = {"ID", "Titulo", "Genero", "Elenco"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        for (Pelicula cur : hashPeliculas.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }

    public void ListarUsuarios(JTable control) {
        String header[] = {"ID", "Historial", "Generos"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        for (Usuario cur : hashUsuarios.values()) {
            modTable.addRow(cur.getRegistro());
        }
    }
    
    public void ListarActores(JTable control, String idPelicula) {
        String[] header = {"Actor"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        Pelicula objPelicula = hashPeliculas.get(idPelicula);
        if (objPelicula == null) return;
        
        for (String actor : objPelicula.getElenco()) {
            modTable.addRow(new Object[]{actor});
        }
    }
    
    public void ListarGenerosFavoritos(JTable control, String idUsuario) {
        String[] header = {"Genero Favorito"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        Usuario objUsuario = hashUsuarios.get(idUsuario);

        if (objUsuario == null) return;    

        for (String genero : objUsuario.getGenerosFavoritos()) {
            modTable.addRow(new Object[]{genero});
        }

    }

    public void BuscarGenero(JTable control, String genero) {
        String header[] = {"ID", "Titulo", "Genero", "Elenco"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        for (Pelicula cur : hashPeliculas.values()) {
            if (cur.getGenero().equalsIgnoreCase(genero)) {
                modTable.addRow(cur.getRegistro());
            }
        }
    }

    public void PeliculasMejorValoradas(JTable control) {
        String header[] = {"ID", "Titulo", "Genero", "Elenco"};
        DefaultTableModel modTable = new DefaultTableModel(header, 0);
        control.setModel(modTable);

        for (Pelicula pelicula : hashPeliculas.values()) {
            int suma = 0, cant = 0;            

            for (Map<String, Integer> mapa : hashInteracciones.values()) {
                if (mapa.get(pelicula.getIdPelicula()) != null) {
                    suma += mapa.get(pelicula.getIdPelicula());
                    cant++;
                }
            }
            if (cant > 0 && (double)suma/cant > 4) {
                modTable.addRow(pelicula.getRegistro());
            }
        }
    }

    public String Recomendar(String idUsuario) {
        Usuario usuario = hashUsuarios.get(idUsuario);
        if (usuario == null) return null;
        
        for (Usuario otro : hashUsuarios.values()) {
            if (otro.getIdUsuario().equals(idUsuario)) continue;
            
            boolean parecido = false;
            for (String genero : usuario.getGenerosFavoritos()) {
                if (otro.getGenerosFavoritos().contains(genero)) {
                    parecido = true;
                    break;
                }
            }

            if (!parecido) continue;
            Map<String, Integer> mapa = hashInteracciones.get(otro.getIdUsuario());

            for (Map.Entry<String, Integer> cur : mapa.entrySet()) {
                if (cur.getValue() >= 5 && !usuario.getHistorialVisualizaciones().contains(cur.getKey())) {
                    Pelicula peli = hashPeliculas.get(cur.getKey());
                    return peli.getTitulo();
                }
            }
        }
        return "No hay recomendaciones";
    }

    public void LlenarComboUsuarios(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);

        for (Usuario cur : hashUsuarios.values()) {
            modCombo.addElement(cur.getIdUsuario());
        }
    }

    public void LlenarComboPeliculas(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);

        for (Pelicula cur : hashPeliculas.values()) {
            modCombo.addElement(cur.getIdPelicula());
        }
    }

}