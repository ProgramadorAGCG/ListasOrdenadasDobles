package listasordenadasdobles;

import java.util.ArrayList;
import java.util.List;

public class ListaDoble {

    private Nodo cabezera;
    private Nodo puntero;

    public ListaDoble() {
        this.cabezera = this.puntero = null;
    }

    public void insertarNodo(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (cabezera == null) {
            this.cabezera = this.puntero = nuevo;
        } else {
            Nodo anterior = this.puntero;
            this.puntero.setSiguiente(nuevo);
            this.puntero = nuevo;
            this.puntero.setAnterior(anterior);
            if(this.cabezera.getSiguiente() == null){
                this.cabezera.setSiguiente(nuevo);
            }
        }
    }

    public void eliminarNodo(int valor) {
        if (cabezera != null) {
            Nodo actual = cabezera;
            Nodo anterior = null;
            while (actual != null) {
                if (actual.getValor() == valor) {
                    if(anterior == null){
                        cabezera = cabezera.getSiguiente();
                        actual.setSiguiente(null);
                        actual = cabezera;
                    }else {
                        anterior.setSiguiente(actual.getSiguiente());
                        actual.setSiguiente(null);
                        actual = anterior.getSiguiente();
                    }
                }else{
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    public void ordenarLista() {
        Nodo indice, subIndice;
        Nodo indiceMenor;
        for (indice = cabezera; indice != null; indice = indice.getSiguiente()) {
            indiceMenor = indice;
            for (subIndice = indice.getSiguiente(); subIndice != null; subIndice = subIndice.getSiguiente()) {
                if (indiceMenor.getValor() > subIndice.getValor()) {
                    indiceMenor = subIndice;
                }
            }
            if (indice != indiceMenor) {
                intercambio(indice, indiceMenor);
            }
        }
    }

    private void intercambio(Nodo nodo1, Nodo nodo2) {
        int aux = nodo1.getValor();
        nodo1.setValor(nodo2.getValor());
        nodo2.setValor(aux);
    }

    public List<Integer> retornarLista() {
        Nodo nodo = cabezera;
        List<Integer> lista = new ArrayList<>();
        int contador = 0;
        while (nodo != null) {
            /*if(nodo.getAnterior() != null){
                System.out.println("Anterior: "+nodo.getAnterior().getValor());
            }
            System.out.println("Actual: "+nodo.getValor());
            if(nodo.getSiguiente() != null){
                System.out.println("Siguiente: "+nodo.getSiguiente().getValor());
            }
            System.out.println("--------------------------------");*/
            lista.add(nodo.getValor());
            nodo = nodo.getSiguiente();
            contador++;
        }
        return lista;
    }
}
