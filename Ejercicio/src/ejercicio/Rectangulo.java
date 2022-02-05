//package src;
package ejercicio;

public class Rectangulo {
    //variable  
    private int lado1, lado2;
    private int perimetroRect, areaRect;;
    
    //constructor
    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //metodos
    public int calcularPerimetroRect(){
        //int perimetroRect;
        if (lado1 != lado2) {
            perimetroRect = (2 * lado1) + (2 * lado2);
        }
        else {
            System.out.println("No debe ser un cuadrado");
        }
        return perimetroRect;
    }
    
    public int calcularAreaRect(){
        //int areaRect;
        if (lado1 != lado2) {
            areaRect = lado1 * lado2;
        }
        else {
            System.out.println("No debe ser un cuadrado");
        }
        return areaRect;
    }
    
    //get set
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getPerimetroRect() {
        return perimetroRect;
    }

    public void setPerimetroRect(int perimetroRect) {
        this.perimetroRect = perimetroRect;
    }

    public int getAreaRect() {
        return areaRect;
    }

    public void setAreaRect(int areaRect) {
        this.areaRect = areaRect;
    }
    
}
