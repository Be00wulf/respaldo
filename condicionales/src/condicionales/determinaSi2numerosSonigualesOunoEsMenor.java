/*
EJERCICIO 2: PEDIR 2 NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON IGUALES
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class determinaSi2numerosSonigualesOunoEsMenor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        
            if(numero1 > numero2){
                System.out.println("El número mayor es: " + numero1);
            }   else if(numero1 < numero2){
                System.out.println("El número mayor es: " + numero2);
            }   else if(numero1 == numero2){
                System.out.println("Los números son iguales");
            }
         
        
        
    }
}
