/*
Permita calcular la potencia x de un número entero positivo.
 */
package tarealab;

import java.util.Scanner;


public class potenciaX {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, exponente, resultado = 1;
        
        System.out.println("*** CALCULADORA DE EXPONENTES X DE ENTEROS POSITIVOS ***");
        
//pedir enteros POSITIVOS
        do {            
            System.out.print("Ingrese el valor de la base: ");
            base = entrada.nextInt();
                     
            System.out.print("Ingrese el valor del exponente: ");
            exponente = entrada.nextInt();
        } while (base < 0 && exponente < 0);
        
//operacion
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        
        System.out.println(base + " elevado a " + exponente + " = " + resultado);
        
    }
}
