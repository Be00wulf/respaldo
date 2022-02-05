/*
Permita el ingreso de un número entero, e indicar si el número es par o impar.
 */
package tarealab;

import java.util.Scanner;


public class parImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        
        System.out.println("*** PAR O IMPAR ***");
        
        
//pidiento datos                             
        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();


//par o impar        
            if (numero %2 == 0) {
                System.out.println(numero + " es un numero par");
            }   else{
                System.out.println(numero + " es un numero impar");
            }
        
    }
}
