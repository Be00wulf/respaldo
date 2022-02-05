/*
PEDIR 10 NUMEROS, Y  MOSTRAR AL FINAL SI SE HA INTRODUCIDO ALGUNO NEGATIVO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class negativos10numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean hayNegativos = false;
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
            
            if (numero < 0) {
                hayNegativos = true;
            }
        }
        
        
        if (hayNegativos == true) {
            System.out.println("Existe al menos un numero negativo");
        }   else {
            System.out.println("No existe ningun numero negativo");
        }
       
    }
}
