
package Listacircular30junio;

public class Nodo {
    // Nodo de siguiente (next) y dato de tipo Persona
    private Nodo next;
    private Persona dato; 
    
    // Constructor solo para el dato

    public Nodo(Persona dato) {
        this.dato = dato;
    }
    
    // ToString solamente para el dato

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    // Set y Gato para todo (dato y next)

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }
    
    
}
