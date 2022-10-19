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
            this.puntero.setSiguiente(nuevo);
            this.cabezera.setInicio(this.puntero);
            this.puntero = nuevo;
        }
    }
    
    public void eliminarNodo(int entrada){
        Nodo actual = cabezera;
        Nodo atras = new Nodo();
        while(actual != null){
            if(actual.getValor() == entrada){
                if(actual == cabezera){
                    cabezera = cabezera.getSiguiente();
                    cabezera.setInicio(null);
                }else{
                    atras.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setInicio(actual.getInicio());
                }
            }
            atras = actual;
            actual = actual.getSiguiente();
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
        while (nodo != null) {
            lista.add(nodo.getValor());
            nodo = nodo.getSiguiente();
        }
        return lista;
    }
}
