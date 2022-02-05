/*
CICLO FOR
    for(inicializacion; condicion; aumento o decremento){
    instrucciones;
    }    
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class cicloFor {
    public static void main(String[] args) {
        
        
        

//ascendente        
        System.out.println("Contar de 1-10 de forma ascendente");    
        //i++ es aumento de uno en uno
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
//descendente        
        System.out.println("Contar de 10-1 de forma descendente");    
        //i++ es aumento de uno en uno
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        
//usuario 
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Ingrese el numero de terminos");   
        contador = entrada.nextInt();
        
        //i++ es aumento de uno en uno              en el aumento para imprimir pares: i+=2
        for(int i = 1; i <= contador; i++){
            System.out.println(i);
        }
        
        
        
    }
}
