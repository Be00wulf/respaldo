/*
HACER UN PROGRAMA QUE LEA UN CARACTER POR TECLADO Y COMPRUEBE SI ES UNA
LETRA MAYUSCULA O NO
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */
public class determinarSiUnaLetraEsMayusculaOno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        char letra;
        
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("Es una letra minuscula");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
