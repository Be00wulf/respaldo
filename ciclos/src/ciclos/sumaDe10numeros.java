/*
PEDIR 10 NUMEROS Y ESCRIBIR LA SUMA TOTAL   
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class sumaDe10numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        
        System.out.print("Suma de 10 numeros, digite de uno en uno: ");      
        
        for (int i = 1; i <= 10; i++) {   
            numero = entrada.nextInt(); 
            System.out.print("Digite otro numero: ");
                       
            suma +=numero;          
        }
        System.out.println("La suma de los numeros es: " + suma);
        
    }
}
