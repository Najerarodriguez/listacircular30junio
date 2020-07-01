public class nodo {
    private int DATO;
    private nodo SIG;
    
    
    public nodo (int DATO) {
        this.DATO = DATO;
        this.SIG = this;
    }

    //Metodos comutadores 
    public nodo getSIG() {
        return SIG;
    }

    public void setSIG(nodo SIG) {
        this.SIG = SIG;
    }

    public int getDATO() {
        return DATO;
    }

    public void setDATO(int DATO) {
        this.DATO = DATO;
    }
    
    
}
