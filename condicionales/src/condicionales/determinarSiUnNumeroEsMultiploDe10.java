/*
EJERCICIO 1: HACER UN PROGRAMA QUE LEA UN NÚMERO ENTERO Y MUESTRE SI EL NÚMERO ES 
MULTIPLO DE 10
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class determinarSiUnNumeroEsMultiploDe10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite un número: ");
        numero = entrada.nextInt();
        
        if(numero%10 == 0){         
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El número no es multiplo de 10");
        }
        
        /*   
             % es el residuo de la division, si el residuo es 0 al dividir un numero
             entre 10, entonces éste es uno de sus multiplos
        */
    }
    
}
