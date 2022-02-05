/*
PEDIR UN NUMERO N Y MOSTRAR TODOS LOS NUMEROS DE 1 A N
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class contadorHastaN {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeroN, n = 1;
        
        System.out.print("Se contara de 1 hasta el numero que usted digite: ");
        numeroN = entrada.nextInt();
        
        do {            
            System.out.println(n);
            n++;
            
        } while (n <= numeroN);
        
        
        
        
    }
}
