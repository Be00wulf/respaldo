//package src;
package ejercicio;

public class Cuadrado {
//variable    
    private int ladoCuadrado;
    
    public Cuadrado(int ladoCuad){
        this.ladoCuadrado = ladoCuad;
    }
    
//metodos
    public int calcularPerimetroCuadrado(){
        int perimetro;
        perimetro = ladoCuadrado * 4;
        return perimetro;
    }
    
    public int calcularAreaCuadrado(){
        int area;
        area = ladoCuadrado * ladoCuadrado;
        return area;
    }

//setters&getters 
    public int getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(int ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }
    
    
}