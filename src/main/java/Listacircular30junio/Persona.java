//Crea la clase persona que va almacenar los datos de la persona
package Listacircular30junio;

public class Persona {
    
    // Crear atributos
    private String nombre, apellido;
    private int id, telefono; 

    // Crear ToString con todos los datos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", telefono=" + telefono + '}';
    }
    // Crear constructor con todos los datos
    public Persona(String nombre, String apellido, int id, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
    }
    
    // Crear set y get para todos los datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
