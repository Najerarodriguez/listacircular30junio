//encargada de mantener a los nodos unidos
public class lista {
    private nodo PRIMERO;
    
    //crear un constructor

    public lista() {
        PRIMERO = null; //le estamos dando un atributo 
    }
    
    //crear metodos
    public boolean VACIA() {
        return (PRIMERO != null);
    }
    
    public void AGREGAR(int DATA) {
        nodo NUEVO = new nodo (DATA);
        if (VACIA()){ //Si hay un nodo ingresar dentro del if
            //vamos a enlazar el primero con el nuevo
            NUEVO.setSIG(PRIMERO.getSIG());
            PRIMERO.setSIG(NUEVO);
        }
        PRIMERO = NUEVO;
    }
    
    public void VER() {
        nodo aux = PRIMERO;
        if(VACIA()) {
            do{
                System.out.print(" "+aux.getDATO());
                aux = aux.getSIG();
            }while(aux != PRIMERO);
        }
    }
    
}
