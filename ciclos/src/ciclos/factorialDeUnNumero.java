/*
PEDIR UN NUMERO Y CALCULAR SU FACTORIAL
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class factorialDeUnNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long numero, producto = 1;
        
        System.out.print("¿A que numero desea sacar su factorial?: ");
        numero = entrada.nextLong();
        
        for (int i = 1; i <= numero; i++) {     
            producto *= i; 
        }
        System.out.println("El factorial es: " + producto);
    
    
    
    
    }
}
