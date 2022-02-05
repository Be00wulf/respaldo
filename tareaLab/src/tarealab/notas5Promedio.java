/*
Solicitar 5 notas de un estudiante y calcule su promedio
 */
package tarealab;

import java.util.Scanner;


public class notas5Promedio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float notas, notaTotal = 0, promedio;
        
        System.out.println("*** NOTA PROMEDIO ***");


//solicitar las 5 notas        
        for (int i = 1; i <= 5; i++) {
            
//establecer el rango en el que la nota se encuentra, si se ingresa una diferente, la nota no se guarda, el espacio i no se llena, y pide el dato de nuevo            
            do {                    
                   System.out.print("Ingresar nota (entre 0-100): ");
                   notas = entrada.nextFloat(); 
            } while (notas < 0 || notas > 100);            
           
            notaTotal += notas; 
        }

//resultado        
        promedio = notaTotal / 5;
        System.out.println("El promedio de las notas es " + promedio);
         
    }
}
