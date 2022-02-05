/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class pruebaDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
              
        int base, expo, resultado = 1;
        
        System.out.println("base");
        base = entrada.nextInt();
        
        System.out.println("exponente");
        expo = entrada.nextInt();
         
        do{           
            resultado = base*resultado;
            expo=expo-1;            
        } while (1 <= expo);
        
        
        System.out.println("El resultado de la potencia es: " + resultado);
        
        
       
        
    }
}
