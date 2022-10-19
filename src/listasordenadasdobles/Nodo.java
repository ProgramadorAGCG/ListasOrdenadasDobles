
package listasordenadasdobles;

public class Nodo {
    
    private Nodo anterior;
    private Nodo siguiente;
    private int valor;

    public Nodo() {
    }

    public Nodo(int valor) {
        this.anterior = null;
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
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
