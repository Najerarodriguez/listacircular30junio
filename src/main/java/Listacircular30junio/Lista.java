
package Listacircular30junio;

public class Lista {
    // De tipo nodo, cabeza y ultimo
    private Nodo cabeza, ultimo;
    
    // Metodo que permite insertar
    public void insertar(Persona p){
        if(cabeza == null){
            cabeza = new Nodo(p); //cabeza es un nuevo nodo con toda la info de la persona
            ultimo = cabeza;
            ultimo.setNext(cabeza); // para que quede circular: el ultimo nodo apunte al primero, el ultimo tiene de siguiente a cabeza
        }else{
            if(p.getId()<=cabeza.getDato().getId()){ //2 menores a cabeza
                // Recibir un objeto nuevo y ponerlo a la izquierda de cabeza, hay que hacer un nodo primero para esto, para luego unir persona nueva con cabeza
                Nodo aux = new Nodo(p); // crear auxiliar
                aux.setNext(cabeza);
                cabeza=aux;
            } else{ //Mayores a cabeza
                if(p.getId()>= ultimo.getDato().getId()){
                    ultimo.setNext(new Nodo(p));
                    ultimo = ultimo.getNext();
                } else{ // 4. en medio
                    Nodo aux = cabeza;
                    while(p.getId()> aux.getNext(). getDato().getId()){
                        aux = aux.getNext();
                    } // termina cuando encuentra donde va
                    Nodo temp = new Nodo(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
        ultimo.setNext(cabeza);
    } // fin metodo
    
    
    // Metodo toString 
    public String toString(){
        String msj = "";
        Nodo aux = cabeza;
        if(aux!=null){
            msj +=aux; //agrego cabeza
            aux = aux.getNext(); // me muevo al 2 dato 
            while(aux != cabeza){
                msj += aux;
                aux = aux.getNext(); //me muevo
            }
        }
        return msj;
    } // primer, ultimo, en medio
    
}
