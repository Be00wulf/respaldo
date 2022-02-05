/*
PEDIR UN NUMERO N, INTRODUCIR N SUELDOS Y MOSTRAR EL SUELDO MAXIMO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class pedirNsueldosYmaximo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        float sueldo, sueldoMaximo = 0;
        
        
        System.out.print("Ingrese la cantidad de empleados: ");
        numero = entrada.nextInt();
        
            for (int i = 1; i <= numero; i++) {
                System.out.print("Ingrese el sueldo del empleado #" + i + ": ");
                sueldo = entrada.nextFloat(); 
                
                if (sueldo > sueldoMaximo) {
                    sueldoMaximo = sueldo;
                }
                
            }
        
        System.out.println("EL sueldo mayor es: $" + sueldoMaximo);
        
        
        
        
        
        
        
        
    }
}
