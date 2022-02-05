/*
Solicitar un número entero entre el 1 y 10 y despliegue su equivalente en número romanos.
 */
package tarealab;

import java.util.Scanner;


public class conversorRomano {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int numero;
        
//pedir datos        
        System.out.println("CONVERSOR ROMANO");
        System.out.print("Ingrese un numero entero de 1 a 10 para convertirlo a romano: ");
        numero = entrada.nextInt();
        
//convertir numero dado        
        switch(numero){
            case 1:
                System.out.println(numero + " en romano es: I");
                break;
                
            case 2:
                System.out.println(numero + " en romano es: II");
                break;
                
            case 3:
                System.out.println(numero + " en romano es: III");
                break;
                
            case 4:
                System.out.println(numero + " en romano es: IV");
                break; 
                
            case 5:
                System.out.println(numero + " en romano es: V");
                break;    
                
            case 6:
                System.out.println(numero + " en romano es: VI");
                break;    
                
            case 7:
                System.out.println(numero + " en romano es: VII");
                break;     
                
            case 8:
                System.out.println(numero + " en romano es: VIII");
                break;
            
            case 9:
                System.out.println(numero + " en romano es: IX");
                break; 
            
            case 10:
                System.out.println(numero + " en romano es: X");
                break;

//en caso ingrese un número fuera de rango                
            default:
                System.out.println("Número fuera de límite");
        }
        
           
        
    }
}
