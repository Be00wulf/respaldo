/*
CONDICIONAL MULTIPLE
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class laSentenciaSwitch {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dato;
        
        System.out.println("Digite un número entre 1-5: ");
        dato = entrada.nextInt();
        
        switch(dato){
            case 1: System.out.println("Éste es el número 1."); //"1" de que la entrada sea "1"
                break;
                
            case 2: System.out.println("Éste es el número 2.");
                break;
                
            case 3: System.out.println("Éste es el número 3.");
                break;
                
            case 4: System.out.println("Éste es el número 4.");
                break;
                
            case 5: System.out.println("Éste es el número 5.");
                break;   
                
            default: System.out.println("El número está fuera del rango");
            //en caso que se introduzca un valor fuera de lo estipulado se usa default
        }
            
        
        
        
        
        
        
        
        
    }
}
