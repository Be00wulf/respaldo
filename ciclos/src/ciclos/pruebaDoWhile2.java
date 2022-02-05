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
public class pruebaDoWhile2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tablas, m = 1, result;
        
        System.out.println("Ingrese numero de tabla");
        tablas = entrada.nextInt();
        
        
        while (m <= 10) {
            result= tablas*m;
            System.out.println(tablas + "x" + m + "="+ result);
            m++;
        }
        
        
    }
}
