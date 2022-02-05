/*
CICLO WHILE: SIMILAR A IF PERO COMO BUCLE, primero evalua la condicion y luego ejecuta
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class cicloWhile {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int i = 1, j = 10, contadorA, contadorD;
        
        System.out.println("Hasta que numero desea que se cuente de forma ascendente");
        contadorA = entrada.nextInt();
        
        System.out.println("Desde que numero desea que se  cuente de forma descentente");
        contadorD = entrada.nextInt();             
        
//imprimir en pantalla los numeros del 1 al y de forma ascendente       
                
        while (i<=contadorA) {            
            System.out.println(i);
            i++;    //i +=2; los numeros avanzan de 2 en 2 desde 1
        }
        
        
//imprimir en pantalla los numeros del 10 al x de forma descendente       
        
        while (j >= contadorD) {            
            System.out.println(j);
            j--;    
        }        
        
        
        
        
    }
}
