/*
Solicitar la edad del usuario y determinar si es infante (0-15 años), adolecente(16-20), 
adulto (21-55), adulto mayor (más de 55)
 */
package tarealab;

import java.util.Scanner;


public class edades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.println("*** EDAD ***");

//rango de la edad        
            do {            
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();
            } while (edad < 0);
      
//calificar edad       
            if (edad >= 0 && edad <= 15) {
                System.out.println("Es un infante");
            }   else if (edad >= 16 && edad <= 20) {
                    System.out.println("Es un adolescente");
            }   else if (edad >= 21 && edad <= 55) {
                    System.out.println("Es un adulto");
            }   else if (edad > 55) {
                    System.out.println("Es un adulto mayor");         
            }
   
    }
}