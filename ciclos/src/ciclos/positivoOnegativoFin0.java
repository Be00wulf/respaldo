/*
LEER UN NUMERO E INDICAR SI ES PORITIVO O NEGATIVO, EL PROCESO SE REPETIRA
HASTA QUE SE INTRODUZCA UN CERO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class positivoOnegativoFin0 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("¿Numero positivo o negativo? Introduzca un numero: ");
        numero = entrada.nextInt();
        
        while (numero != 0) {            

            if (numero > 0) {
                System.out.println("El numero es positivo");   
            }   else if(numero < 0){  
                
                System.out.println("El numero es negativo");
            } 
            
            System.out.println("Introduzca otro numero o presione 0 para salir ");
            numero = entrada.nextInt();
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
