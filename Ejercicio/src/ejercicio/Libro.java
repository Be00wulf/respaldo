//package src;
package ejercicio;

public class Libro {
    //variables
    private boolean prestado;

    //constructor
    public Libro(boolean prestado){
        this.prestado = prestado;
    }
    
    //metodos
    public boolean prestamo(){
        prestado = true;
        return prestado;
    }
    
    public boolean devolucion(){
        prestado = false;
        return prestado;
    }
    
    public String mostrarInformación(){
        if (prestado = true) {
            return "EL libro ha sido prestado";
        }
        
        else    {
            return "El libro ha sido devuelto";
        }
        
    }
    
    //get set
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
 
}
