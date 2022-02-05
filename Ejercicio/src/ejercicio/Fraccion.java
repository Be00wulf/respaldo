//package src;
package ejercicio;

public class Fraccion {
    //variables
    public double numerador, denominador, numerador2, denominador2, suma, resta, mult, div;
    
    //constructor
    public Fraccion(double  numerador, double denominador, double numerador2, double denominador2){
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }
    
    //metodos
    public double sumaF(){
        suma = (numerador / denominador) + (numerador2 / denominador2);
        return suma;
    }
    
    public double restaF(){
        resta = (numerador / denominador) - (numerador2 / denominador2);
        return resta;
    }
    
    public double multF(){
        mult = (numerador / denominador) * (numerador2 / denominador2);
        return mult;
    }
    
    public double divF(){
        div = (numerador / denominador) / (numerador2 / denominador2);
        return div;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(double numerador2) {
        this.numerador2 = numerador2;
    }

    public double getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(double denominador2) {
        this.denominador2 = denominador2;
    }

}
