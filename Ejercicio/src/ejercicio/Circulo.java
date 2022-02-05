//package src;
package ejercicio;

public class Circulo {
    //variable  
    private int radio;
    
    //constructor
    public Circulo(int radio){
        this.radio = radio;
    }
    
    //metodos
    public double calcularPerimetroCirculo(){
        double perimetroCir;
        perimetroCir = 3.14 * radio * 2;
        return perimetroCir;
    }
    
    public double calcularAreaCirculo(){
        double areaCir;
        areaCir = 3.14 * radio * radio;
        return areaCir;
    }
    
    //set get
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
