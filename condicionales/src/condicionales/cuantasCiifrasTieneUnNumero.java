/*
Pedir un numero entre 0-99,999 y decir cuantas cifras tiene
 */
package condicionales;

import java.util.Scanner;

/*
@author orcha
 */
public class cuantasCiifrasTieneUnNumero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valor;

//pedir dato al usuario        
        System.out.println("Introduzca un numero entre 0 y 99,999: ");
        valor = entrada.nextInt();
               
        //pleca = |       alt+124 

        if(valor >= 0 && valor <=9){
            System.out.println("El número tiene 1 cifra");
            
        }else if (valor >= 10 && valor <=99) {
            System.out.println("El número tiene 2 cifras");
            
        }else if (valor >= 100 && valor <=999) {
            System.out.println("El número tiene 3 cifras");
            
        }else if (valor >= 1000 && valor <= 9999) {
            System.out.println("El numero tiene 4 cifras");
            
        }else if (valor >= 10000 && valor <=99999) {
            System.out.println("El número tiene 5 cifras");
        }
        
        
    }
}
