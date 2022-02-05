/*
Hacer un programa que tome 2 numeros y diga si ambos son pares o impares
 */
package condicionales;

import java.util.Scanner;

/*
@author orcha
 */

public class verificarSi2numerosSonParOimpar {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
        
        System.out.println("Ingrese el valor del primer numero: ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del segundo numero: ");
        numero2 = entrada.nextDouble();
         
        if (numero1%2 == 0 && numero2%2 == 0) {
            System.out.println("Ambos numeros son pares");
        }else if (numero1%2 != 0 && numero2%2 != 0) {
            System.out.println("Ambos numeros son impares");
        }else if (numero1%2 == 0 && numero2%2 != 0) {
            System.out.println(numero1 + " es par y " + numero2 + " es impar");
        }else if (numero1%2 != 0 && numero2%2 == 0) {
            System.out.println(numero1 + " es impar y " + numero2 + " es par");
                }
        
     
    }
}
