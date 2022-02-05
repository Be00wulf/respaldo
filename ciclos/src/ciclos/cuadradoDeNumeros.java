/*
LEER UN NUMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO HASTA QUE SE INTRODUZCA
UN NUMERO NEGATIVO
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class cuadradoDeNumeros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        
        System.out.println("Digite un numero:");
        numero = entrada.nextInt();
        
        
        while(numero >= 0){     //mientras numero sea 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);        //(int) transforma a Math.pow en entero (ya que este metodo retorna un double)
            System.out.println("El numero elevado al cuadrado es: " + cuadrado);
        
            System.out.println("Digite otro numero: ");
            numero = entrada.nextInt();
        
            if (numero < 0) {
                System.out.println("Error");
            }
        }
        
        
        
        
        
        
        
        
    }
}
