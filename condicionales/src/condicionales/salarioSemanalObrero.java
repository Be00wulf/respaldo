/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
manera:
    -Si trabaja 40h o menos, le pagan $16 por hora
    -Si trabaja mas de 40h se le pagan $16 por  cada una de las primeras 40h y 
     $20 por cada hora extra
 */

package condicionales;

import java.util.Scanner;

/*
@author orcha
 */

public class salarioSemanalObrero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int horas;
        float salario;
        
        System.out.println("¿Cuántas horas trabajó el obrero?: ");
        horas = entrada.nextInt();
        
        if (horas <= 40) {
            salario = horas * 16;
            
            //System.out.println("Su salario es de: " + salario);
        } else {
            salario = (40 * 16) + ((horas - 40) * 20);
            //System.out.println("Su salario es de: " + salario);
        }
        
        System.out.println("Su salario es de: " + salario); //solo imprime lo que haya salido true
        
        
        
        
        
        
        
        
        
    }
}
