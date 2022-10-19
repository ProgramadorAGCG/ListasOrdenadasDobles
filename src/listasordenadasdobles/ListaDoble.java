package listasordenadasdobles;

import java.util.ArrayList;
import java.util.List;

public class ListaDoble {

    private Nodo cabecera;
    private Nodo puntero;

    public ListaDoble() {
        this.cabecera = this.puntero = null;
    }

    public void insertarNodo(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (cabecera == null) {
            this.cabecera = this.puntero = nuevo;
        } else {
            Nodo anterior = this.puntero;
            this.puntero.setSiguiente(nuevo);
            this.puntero = nuevo;
            this.puntero.setAnterior(anterior);

        }
    }

    public void eliminarNodo(int valor) {
        if (cabecera != null) {
            Nodo actual = cabecera;
            Nodo anterior = null;
            while (actual != null) {
                if (actual.getValor() == valor) {
                    if (anterior == null) {
                        cabecera = cabecera.getSiguiente();
                        actual.setSiguiente(null);
                        actual = cabecera;
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                        actual.setSiguiente(null);
                        actual = anterior.getSiguiente();
                    }
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    public void ordenarLista() {
        Nodo subIndice;
        Nodo indiceMenor;
        for (Nodo indice = cabecera; indice != null; indice = indice.getSiguiente()) {
            indiceMenor = indice;
            for (subIndice = indice.getSiguiente(); subIndice != null; subIndice = subIndice.getSiguiente()) {
                if (indiceMenor.getValor() > subIndice.getValor()) {
                    indiceMenor = subIndice;
                }
            }
            if (indice != indiceMenor) {
                int aux = indice.getValor();
                indice.setValor(indiceMenor.getValor());
                indiceMenor.setValor(aux);
            }
        }
    }

    public List<Integer> retornarLista() {
        Nodo nodo = cabecera;
        List<Integer> lista = new ArrayList<>();
        int contador = 0;
        while (nodo != null) {
            if (nodo.getAnterior() != null) {
                System.out.println("Anterior: " + nodo.getAnterior().getValor());
            }
            System.out.println("Actual: " + nodo.getValor());
            if (nodo.getSiguiente() != null) {
                System.out.println("Siguiente: " + nodo.getSiguiente().getValor());
            }
            System.out.println("--------------------------------");
            lista.add(nodo.getValor());
            nodo = nodo.getSiguiente();
            contador++;
        }
        return lista;
    }
}
