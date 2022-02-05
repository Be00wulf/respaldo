/*
EJERCICIO: Hacer un programa que calcule e imprima la suma de tres 
calificaciones
EN ESTE CASO SE PEDIRA CALIFICACION POR CALIFICACION Y LUEGO SE MOSTRARA
COMO PEDIRLAS TODAS JUNTAS
 */

package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);       
        float nota1, nota2, nota3, nota4, nota5, nota6, suma, suma2;

                                    //CALIFICACION UNA A UNA
//NOTA1
        System.out.println("Introduzca la primera calificación (utilizar coma): ");
        nota1 = entrada.nextFloat();

//NOTA 2        
        System.out.println("Introduzca la segunda calificación (utilizar coma): ");
        nota2 = entrada.nextFloat();        

//NOTA 3            
        System.out.println("Introduzca la tercera calificación (utilizar coma): ");
        nota3 = entrada.nextFloat();        
        
        
//OPERACION        
        
        suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las notas es: "+suma);
        
        
        
                                    //CALIFICACIONES CORRIDAS
        System.out.println("Introduzca tres calificación separadas por espacios (utilizar coma decimal): ");
        nota4 = entrada.nextFloat();
        nota5 = entrada.nextFloat();  
        nota6 = entrada.nextFloat();  
        
//sumar las notas
        suma2 = nota4 + nota5 + nota6;
        System.out.println("Las notas son: "+suma2);
    }
    
}
