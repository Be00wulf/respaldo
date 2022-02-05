/*
HACER UN PROGRAMA QUE CALCULE EL CUADRADO DE LA SUMA
(A+B)² = A² + B² + 2AB
 */
package ejercicio6operadores;

import java.util.Scanner;


public class Ejercicio6Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b, /*termino1, termino2, termino3,*/ resultado;
        
//pedir datos
        System.out.println("Ingrese el valor de A");
        a = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de B");
        b = entrada.nextFloat();
        
//Operaciones
        resultado = (float) (Math.pow(a,2) + Math.pow(b,2) + 2*a*b);
        
//Resultado
        System.out.println("El cuadrado de la suma es: " + resultado);
        
    }
    
}
