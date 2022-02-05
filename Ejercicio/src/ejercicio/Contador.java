//package src;
package ejercicio;

public class Contador {
//variable   
    
    private int contad0r;
    
//constructor
    public Contador(int num){             //variable de tipo contador?
        //this.contad0r = cont4dor.contad0r;          //constructor copia?  
        this.contad0r = num; 
    }

//metodos
    public int decremento(){
        --contad0r;
        return contad0r;
    }
    
    public int incremento(){
        ++contad0r;
        return contad0r;
    }

// setters&getters   
    public int getContad0r() {
        return contad0r;
    }

    public void setContad0r(int contad0r) {
        this.contad0r = contad0r;
    }
    
    
}