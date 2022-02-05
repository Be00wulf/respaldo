/*
PEDIR 10 NUMEROS, MOSTRAR LA MEDIA DE LOS NUMEROS POSITIVOS, LA MEDIA DE LOS NEGATIVOS,
Y CONTAR CUANTOS CEROS SE INGRESARON.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class mediaDePositivosNegativosYcontarCeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, sumaPositivos = 0, conteoPositivos = 0, sumaNegativos = 0, conteoNegativos = 0;
        int conteoCeros = 0;
        float mediaPositivos, mediaNegativos;      
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero");
            numero = entrada.nextInt();
            
            
            if (numero == 0) {                  //si el numero es cero
                conteoCeros++;                  //aumenta en uno la cantidad de ceros
            }   else if (numero > 0) {
                sumaPositivos += numero;
                conteoPositivos++;
            }   else if (numero < 0) {
                sumaNegativos += numero;
                conteoNegativos++;
            }
            
        }
        
//Media de positivos        
        if (conteoPositivos == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            mediaPositivos = (float)sumaPositivos/conteoPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }
        
        
//Media de negativos        
        if (conteoNegativos == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            mediaNegativos = (float)sumaNegativos/conteoNegativos;
            System.out.println("La media de los numeros negativos es: " + mediaNegativos);
        }        
        
        
//ceros        
        System.out.println("La cantidad de ceros es: " + conteoCeros);
        
        
    }
}
