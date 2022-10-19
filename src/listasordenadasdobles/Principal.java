
package listasordenadasdobles;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.insertarNodo(8);
        lista.insertarNodo(4);
        lista.insertarNodo(3);
        lista.insertarNodo(5);
        List<Integer> arreglo = lista.retornarLista();
        for(Integer elemento : arreglo){
            System.out.println(elemento);
        }
    }
    
}
