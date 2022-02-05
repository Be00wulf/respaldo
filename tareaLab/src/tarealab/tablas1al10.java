/*
Muestre la tabla de multiplicar de los primeros 10 números naturales(1 al 10). El usuario debe 
escoger qué tabla desea que se muestre, mostrando los resultados desde la multiplicación con el 
número 1 hasta el 10
 */

package tarealab;

import java.util.Scanner;


public class tablas1al10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicacion = 1;
        
        System.out.println("TABLAS DE MULTIPLICAR (1-10)");
        
        
//pidiendo datos, limitando entrada de 1 a 10
            do {            
                System.out.print("Digite un numero: ");
                numero = entrada.nextInt();
            } while (numero <= 0);
        
        
        System.out.println("LA TABLA DEL " + numero);

//tablas        
            for (int i = 1; i <= 10; i++) {           
                multiplicacion = numero * i;            
                System.out.println(numero+"x"+i+"="+multiplicacion);                    
            }
 
            
    }
}
