/*
PIDE UN NUMERO (QUE DEBE ESTAR ENTRE 0 Y 10) Y MOSTRAR LA TABLA DE MULTIPLICAR DE 
DICHO NUMERO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class tablas1al10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicacion = 1;
        
        System.out.println("¿Que tabla de multiplicar desea que se muestre? (digite el numero): ");
        numero = entrada.nextInt();
        
        for (int i = 1; i <= 10; i++) {            
            multiplicacion = numero * i;            
            System.out.println(numero+"x"+i+"="+multiplicacion);                    
        }
    }
}
