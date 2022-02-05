/*
PEDIR NUMEROS HASTA QUE SE TECLEE UNO NEGATIVO, Y MOSTRAR CUANTOS NUMEROS SE HAN INTODUCIDO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class listaNumeroFinNegativo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
            
        do {            
            System.out.println("Introduzca un numero");
            numero = entrada.nextInt(); 
            
            contador++;
            
        } while (numero > 0);
        
        System.out.println("Se han introducido " +contador+ " numeros");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
