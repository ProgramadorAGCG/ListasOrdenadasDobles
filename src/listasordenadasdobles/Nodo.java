
package listasordenadasdobles;

public class Nodo {
    
    private Nodo inicio;
    private Nodo siguiente;
    private int valor;

    public Nodo() {
    }

    public Nodo(int valor) {
        this.inicio = null;
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
