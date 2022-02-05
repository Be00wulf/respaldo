/*
REALIZAR UN JUEGO PARA ADIVINAR UN NUMERO. PARA ELLO, GENERAR UN NUMERO ALEATORIO ENTRE
0-100, Y LUEGO IR PRIDIENDO NUMEROS INDICANDO "ES MAYOR" O "ES MENOR", SEGÚN SEA MAYOR
O MENOR CON RESPECTO A "N", EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA Y MOSTRAR EL NUMERO DE
INTENTOS.
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class adivinaNumeroAleatorio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, intentos = 0;
        
 /*math.random devuelve un double entre 0 y 1; multiplicarlo *100 lo genera entre 0 y 100;
   este aun debe ser convertido en entero (int); meter al metodo Math.random en parentesis ()*/
        
        aleatorio = (int)(Math.random()*100); //numero random entero entre 0-100
        
        System.out.println("ADIVINA UN NUMERO ENTRE 0 Y 100");
        
        do {            
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
            
            if(aleatorio > numero){
                System.out.println("Es mayor...");
            } else {
                System.out.println("Es menor...");
            }
            
            intentos++;     //el contador aumenta en uno en cada vuelta
        } while (numero != aleatorio);
        
        System.out.println("ADIVINASTE!!! (" + intentos +" intentos)");
        
            
        
        
        
        
        
    }
}
