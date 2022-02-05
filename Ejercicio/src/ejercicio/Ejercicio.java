//package src;
package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    //clase main ejecutable
    public static void main(String[] args) {
        //objetos
        Ejercicio objetoNuevo = new Ejercicio();
        objetoNuevo.saludo();   //LLAMAR A UN METODO VOID (acceder a el con el punto (.)  )
        
        int s = suma(6,10);    //LLAMAR  A UN METODO CON RETORNO; forma 1
        System.out.println(s);
        
    }
    
    
    
    
    
    
    
    
    //variables globales
    Scanner entrada = new Scanner(System.in);
        int base, altura; //calcular perimetro (del return)
        int numero;     //pedir valor   (del void)
        
        
        
        
        
        
        
    //CONSTRUCTOR     (esto se ejecuta antes que las instrucciones del main)   
    public Ejercicio(){
        int perimetro = calcularPerimetro();    //LLAMAR  A UN METODO CON RETORNO; forma 2 
        pedirValor();           //LLAMAR  A UN METODO VOID
        
    }
    
    
    
    
    
    
    
    //METODOS: Acciones o comporatmientos del objeto
    //VOID: indica que el metodo no regresa ningun valor, unicamente ejecuta algo
    public void saludo(){
        System.out.println("Holiuuuuuuu");
    }
    
    public void pedirValor(){
	System.out.print("Ingrese un numero: ");
	numero = entrada.nextInt();
	}
    
    
    
    //RETURN: retorna valor o dato; y dentro del parentesis puede tener un parametro
    public static int suma(int valor1, int valor2){
        return valor1 + valor2;
    }
    
    
    //RETURN: retorna valor o dato; y dentro del parentesis puede tener un parametro
    public int calcularPerimetro(){
	int resultado = 0;
	resultado = 2 * base + 2 * altura;
        
	base = 15;
	altura = 5;
        
	System.out.println("\n\ncalcular Perimetro altura: "+ altura+ " base: "+ base);
	return resultado;
	}
}