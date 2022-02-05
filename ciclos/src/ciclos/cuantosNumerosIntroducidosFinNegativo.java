/*
Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class cuantosNumerosIntroducidosFinNegativo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador = 0, numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        while (numero >= 0) {            
            contador = contador + 1;
            System.out.println("se han introducido " + contador + " numero(s)");
            System.out.println("El numero es " + numero + ". Presione un numero negativo para salir, o digite otro numero: ");
            numero = entrada.nextInt();                     
            }
            
        }
      
    }

