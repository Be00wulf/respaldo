/*
PEDIR NUMEROS HASTA QUE SE TECLEE UN 0 Y MOSTRAR LA SUMA DE TODOS LOS NUMEROS INTRODUCIDOS
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class sumarListaNumerosFin0 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, respuesta = 0;
        
        System.out.println("Se sumaran los numeros ingresados");
        
        do {            
            System.out.println("Introduzca un numero o presione 0 para salir: ");
            numero = entrada.nextInt();
            
            respuesta += numero;
            
        } while (numero != 0);
        
        System.out.println("La suma de los numeros es " +respuesta);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
