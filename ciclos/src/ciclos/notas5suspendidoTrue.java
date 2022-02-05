/*
PEDIR 5 NOTAS Y DECIR AL FINAL SI HAY ALGUN SUSPENDIDO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class notas5suspendidoTrue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        boolean haySuspendidos = false;
        

        System.out.println("NOTAS DE 5 ALUMNOS");
        
        
        for (int i = 1; i <= 5; i++) {
            
            do {                    
                   System.out.print("Ingrese la nota del alumno (entre 0-10): ");
                   nota = entrada.nextFloat(); 
            } while (nota < 0 || nota > 10); 
            
            if (nota < 5) {
                haySuspendidos = true;
            }   
      
        }
        
        if (haySuspendidos == true) {
            System.out.println("Hay por lo menos un alumno suspendido");
        }   else {
            System.out.println("No hay alumnos suspendidos");
        }
        
        
        
    }
}
