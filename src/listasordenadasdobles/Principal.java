
package listasordenadasdobles;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.insertarNodo(5);
        lista.insertarNodo(1);
        lista.insertarNodo(3);
        lista.insertarNodo(10);
        lista.insertarNodo(4);
        lista.insertarNodo(20);
        
        lista.eliminarNodo(3);
        
        lista.ordenarLista();
        
        
        List<Integer> arreglo = lista.retornarLista();
        for(Integer elemento : arreglo){
            System.out.println(elemento);
        }
    }
    
}
