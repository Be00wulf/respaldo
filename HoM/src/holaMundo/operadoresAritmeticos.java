/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class operadoresAritmeticos {
    
    public static void main(String [] args){
    
    Scanner entrada = new Scanner(System.in);
    float numero1, numero2, suma, resta, mult, div, residuo;
    
    
/*
Se pueden colocar las lineas que soliciten las entradas, de forma continua, y al momento de ingresarlos en 
pantalla se coloca el dato+espacio+siguiente dato, o tambien, dato+enter+dato siguiente, ejemplo:
    12 6
    
    12
    6
    */    
        System.out.println("Ingrese el primer numero que desee operar (si usa decimales utilice coma (,): ");
        numero1 = entrada.nextFloat();      //esta linea es la que solicita informacion
    
        System.out.println("Ingrese el segundo numero que desee operar (si usa decimales utilice coma (,): ");
        numero2 = entrada.nextFloat();      //esta linea es la que solicita informacion
  
//SUMA: opera y luego muestra en pantalla
        suma = numero1 + numero2;
        System.out.println("La suma es: "+suma);
        
//RESTA: opera y luego muestra en pantalla
        resta = numero1 - numero2;
        System.out.println("La resta es: "+resta);
        
//MULTIPLICACION: opera y luego muestra en pantalla        
        mult = numero1 * numero2;
        System.out.println("La multiplicación es: "+mult);
        
//DIVISION: opera y luego muestra en pantalla        
        div = numero1 / numero2;
        System.out.println("La división es: "+div);
        
//RESIDUO DE LA DIVISION: opera y luego muestra en pantalla        
        residuo = numero1 % numero2;
        System.out.println("El residuo es: "+residuo);
        
    
    
    
    
    
    
    
    }
}
