/*
Permita el ingreso de dos números enteros y muestre cual es el numero mayor y menor.
 */
package tarealab;

import java.util.Scanner;


public class mayorYmenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("*** MAYOR Y MENOR ***");
        
//pidiendo datos        
        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        
//mayor, menor, igual  (?)       
          if(numero1 > numero2){
                System.out.println("El número mayor es: " + numero1);
          }   else if(numero1 < numero2){
                System.out.println("El número mayor es: " + numero2);
          } else {
                System.out.println("Los números son iguales");
            }
    }
}
