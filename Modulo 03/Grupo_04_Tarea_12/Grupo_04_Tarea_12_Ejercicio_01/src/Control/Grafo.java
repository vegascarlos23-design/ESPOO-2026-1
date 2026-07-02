package Control;

import Modelo.CentroLogistico;
import Modelo.DetalleModalidad;
import Modelo.RutaOptima;
import Modelo.TramoEnvio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {

    private ArrayList<NodoCentroLogistico> lista = new ArrayList<>();

    public ArrayList<NodoCentroLogistico> getLista() {
        return lista;
    }

    public void setLista(ArrayList<NodoCentroLogistico> lista) {
        this.lista = lista;
    }

    public void agregar(CentroLogistico centro) {
        lista.add(new NodoCentroLogistico(centro));
    }

    public void editarCentro(String nombre, String nuevoNombre, String nuevoCodigo, int nuevaCapacidad) {
        NodoCentroLogistico nodo = buscarCentro(nombre);
        if (nodo != null) {
            for (NodoCentroLogistico n : lista) {
                for (TramoEnvio tramo : n.getAdyacentes()) {
                    if (tramo.getDestino().getElemento().getNombre().equals(nombre)) {
                        tramo.getDestino().getElemento().setNombre(nuevoNombre);
                        tramo.getDestino().getElemento().setCodigo_aduana(nuevoCodigo);
                        tramo.getDestino().getElemento().setCapacidad_almacen(nuevaCapacidad);
                    }
                }
            }
            nodo.getElemento().setNombre(nuevoNombre);
            nodo.getElemento().setCodigo_aduana(nuevoCodigo);
            nodo.getElemento().setCapacidad_almacen(nuevaCapacidad);
        }
    }

    public void eliminar(String nombre) {
        NodoCentroLogistico nodo = buscarCentro(nombre);
        lista.remove(nodo);
        eliminarTramosHacia(nombre);
    }

    private void eliminarTramosHacia(String nombre) {
        for (NodoCentroLogistico nodo : lista) {
            ArrayList<TramoEnvio> adyacentes = nodo.getAdyacentes();
            for (int i = adyacentes.size() - 1; i >= 0; i--) {
                if (adyacentes.get(i).getDestino().getElemento().getNombre().equals(nombre)) {
                    adyacentes.remove(i);
                }
            }
        }
    }

    public NodoCentroLogistico buscarCentro(String nombre) {
        for (NodoCentroLogistico nodo : lista) {
            if (nodo.getElemento().getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }

    public void agregarTramo(String origen, String destino) {
        if (lista.size() >= 2) {
            NodoCentroLogistico nodoOrigen = buscarCentro(origen);
            NodoCentroLogistico nodoDestino = buscarCentro(destino);
            if (nodoOrigen != null && nodoDestino != null && nodoOrigen.buscarTramo(destino) == -1) {
                nodoOrigen.agregarTramo(new TramoEnvio(nodoDestino));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registre almenos 2 Centros", "REQUISITO", 2);
        }

    }

    public void agregarModalidadATramo(String origen, String destino, DetalleModalidad detalle) {
        NodoCentroLogistico nodoOrigen = buscarCentro(origen);
        if (nodoOrigen != null) {
            int pos = nodoOrigen.buscarTramo(destino);
            if (pos != -1) {
                nodoOrigen.getAdyacentes().get(pos).agregarModalidad(detalle);
            }
        }
    }

    public void editarModalidadDeTramo(String origen, String destino, DetalleModalidad detalle) {
        NodoCentroLogistico nodoOrigen = buscarCentro(origen);
        if (nodoOrigen != null) {
            int pos = nodoOrigen.buscarTramo(destino);
            if (pos != -1) {
                nodoOrigen.getAdyacentes().get(pos).agregarModalidad(detalle);
            }
        }
    }

    public void eliminarTramo(String origen, String destino) {
        NodoCentroLogistico nodoOrigen = buscarCentro(origen);
        if (nodoOrigen != null) {
            int pos = nodoOrigen.buscarTramo(destino);
            if (pos != -1) {
                nodoOrigen.eliminarTramo(pos);
            }
        }
    }

    public void eliminarModalidadDeTramo(String origen, String destino, String tipo_modalidad) {
        NodoCentroLogistico nodoOrigen = buscarCentro(origen);
        if (nodoOrigen != null) {
            int pos = nodoOrigen.buscarTramo(destino);
            if (pos != -1) {
                nodoOrigen.getAdyacentes().get(pos).eliminarModalidad(tipo_modalidad);
            }
        }
    }

    public void listarCentros(JTable tabla) {
        String[] cabecera = {"Centro Logístico", "Código Aduana", "Capacidad (TEU)"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        tabla.setDefaultEditor(Object.class, null);
        for (NodoCentroLogistico nodo : lista) {
            modelo.addRow(nodo.getElemento().getRegistro());
        }
    }

    public RutaOptima RutaOptima(String origen, String destino, int criterio, String modalidad, double pesotiempo, double pesohuella) {
        NodoCentroLogistico inicio = buscarCentro(origen);
        NodoCentroLogistico fin = buscarCentro(destino);

        if (inicio == null || fin == null) {
            return new RutaOptima("Centro no encontrado", -1);
        }
        int n = lista.size();

        double[] distancia = new double[n];
        boolean[] visitado = new boolean[n];
        int[] previo = new int[n];
        for (int i = 0; i < n; i++) {
            distancia[i] = Double.MAX_VALUE;
            visitado[i] = false;
            previo[i] = -1;
        }
        int origentamaño = lista.indexOf(inicio);
        int destinotama = lista.indexOf(fin);

        distancia[origentamaño] = 0;
        for (int k = 0; k < n; k++) {
            int actual = -1;
            double menor = Double.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!visitado[i] && distancia[i] < menor) {
                    menor = distancia[i];
                    actual = i;
                }
            }
            if (actual == -1) {
                break;
            }
            visitado[actual] = true;
            NodoCentroLogistico nodoActual = lista.get(actual);
            for (TramoEnvio tramo : nodoActual.getAdyacentes()) {
                int vecino = lista.indexOf(tramo.getDestino());
                double costo = tramo.obtenercosto(criterio, modalidad, pesotiempo, pesohuella);
                if (costo == Double.MAX_VALUE) {
                    continue;
                }
                if (distancia[actual] + costo < distancia[vecino]) {
                    distancia[vecino] = distancia[actual] + costo;
                    previo[vecino] = actual;
                }
            }

        }
        if (distancia[destinotama] == Double.MAX_VALUE) {
            return new RutaOptima("No existe ruta optima", -1);
        }
        String ruta = getRuta(previo, destinotama);
        return new RutaOptima(ruta, distancia[destinotama]);
    }

    public String getRuta(int[] previo, int destinoidx) {
        ArrayList<String> ruta = new ArrayList<>();
        int actual = destinoidx;
        while (actual != -1) {
            ruta.add(lista.get(actual).getElemento().getNombre());
            actual = previo[actual];
        }
        String camino = "";
        for (int i = ruta.size() - 1; i >= 0; i--) {
            camino += ruta.get(i);
            if (i > 0) {
                camino += " >>> ";
            }
        }
        return camino;
    }

    public void Mostrar_Matriz_Adyacencia(JTable control, int criterio, String modalidad, double pesotiempo, double pesohuella) {
        int n = lista.size();
        String[] cabecera = new String[n + 1];
        cabecera[0] = "";

        for (int i = 0; i < n; i++) {
            cabecera[i + 1] = lista.get(i).getElemento().getNombre();
        }
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);

        for (int i = 0; i < n; i++) {
            Object[] fila = new Object[n + 1];
            fila[0] = lista.get(i).getElemento().getNombre();
            for (int j = 0; j < n; j++) {
                fila[j + 1] = "-1";
            }
            NodoCentroLogistico origen = lista.get(i);

            for (TramoEnvio tramo : origen.getAdyacentes()) {
                int destino = lista.indexOf(tramo.getDestino());
                double costo = tramo.obtenercosto(criterio, modalidad, pesotiempo, pesohuella);
                if (costo != Double.MAX_VALUE) {
                    fila[destino + 1] = costo;
                }
            }
            modtabla.addRow(fila);
        }
        control.setModel(modtabla);
        control.setDefaultEditor(Object.class, null);
    }

}
