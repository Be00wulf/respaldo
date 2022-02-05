/*
CICLO DO WHILE: primero ejecuta y despues evalúa la condicion, util para menús
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class cicloDoWhile {
    public static void main(String[] args) {
        
        int i = 1, j = 11, k = 12;
       
        
//primero ejecuta y despues evalúa la condicion        
        do{
            System.out.println(i);
            i++;
        } while (i <= 10);         
            
        
//primero ejecuta y despues evalúa la condicion        
        do{
            System.out.println(j);
            j++;
        } while (j <= 10);        
        
//descendete        
        do{
            System.out.println(k);
            k--;
        } while (k >= 1); 
        
//pedirle al usuario cuantos numeoros quiere digitar
        
        Scanner entrada = new Scanner(System.in);
        int contador, m = 1;
        
        System.out.println("cuantos numeros desea enumerar ");
        contador = entrada.nextInt();
        
        do{
            System.out.println(m);
            m++;
        } while (m <= contador);








    }
}
