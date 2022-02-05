/*
LEER NUMEROS HASTA QUE SE INTRODUZCA UN 0. PARA CADA UNO INDICAR SI ES PAR O IMPAR
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class parOimparFinalizaEn0 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        while (numero != 0) {      //mientras el numero sea distinto de cero      
            if (numero%2 == 0) {
                System.out.println("Numero par");
            }else{
                System.out.println("Numero impar");
            }
            
            System.out.println("Presione 0 para salir, o digite otro numero: ");
            numero = entrada.nextInt();
            
        }
        
        
        
        
        
        
        
        
        
        
    }
}
