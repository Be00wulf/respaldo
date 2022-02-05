/*
PEDIR NUMEROS HASTA QUE SE INTRODUZCA UNO NEGATIVO, Y CALCULAR LA MEDIA
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class promedioDeXnumeros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, elementos=0, resultado=0;
        float media;
        
        System.out.println("Calculadora de medias: digite un numero");
        numero = entrada.nextInt();
        
        
        
        while (numero >= 0) {            
            resultado = resultado + numero;     //suma iterativa
       
               elementos++;
               
               System.out.println("Digite otro numero o presione uno negativo para salir");
               numero = entrada.nextInt();
        }
        
        
        
        if (elementos == 0) {
            System.out.println("Error: la division entre 0 no existe");
        } else {
            media = (float)(resultado / elementos);     //se convierte en float ya que resultado y elementos son int
            System.out.println("La media es: " + media);
        }
                
   
        
    }
}
