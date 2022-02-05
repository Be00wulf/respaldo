/*
EJERCICIO 3: Guillermo tiene N dólares
Luis posee la mitad de lo que tiene Guillermo
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
Hacer un programa que calcule e imprimala cantidad de dinero que tienen entre los tres
 */
package ejercicio_3;

import java.util.Scanner;


public class Ejercicio_3 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

//GUILLERMO        
        System.out.println("¿Cuánto dinero tiene Guillermo? (si lo requiere use coma decimal)");
        guillermo = entrada.nextFloat();

//LUIS        
        luis = guillermo / 2;
        System.out.println("Luis tiene Q"+ luis);
        
//JUAN
        juan = (luis + guillermo)/2;
        System.out.println("Juan tiene Q"+juan);
        
//Total        
        total = juan+luis+guillermo;
        System.out.println("El dinero que tienen entre los 3 es de Q"+total);
        
        
        
        
        
        
    }
    
}
