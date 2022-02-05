/*
PEDIR 10 SUELDOS, MOSTRAR SU SUMA Y CUANTOS HAY MAYORES DE $1000 
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class sumaSueldosYmayoresDe1000 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Suma de suelodos");
        int sueldo, sumaSueldo = 0, conteo1000 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca un sueldo: ");
            sueldo = entrada.nextInt();
                        
            if (sueldo > 1000) {
                conteo1000++;
            }   
            
            sumaSueldo += sueldo;
            
        }
        
        System.out.println("La suma de los sueldos es: " + sumaSueldo);
        System.out.println("Hay " + conteo1000 + " sueldos mayores a $1000");
        
    }
}
