/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

/**
 *
 * @author orcha
 */
public class constantes {
    
    public static void main(String [] args){
        
        int numero = 10;
        
//EL NUMERO PUEDE CAMBIAR A LO LARGO DEL PROGRAMA "VARIABLES"
        numero = 15;
        
        System.out.println("El numero con variable "+numero);
        
        
/*
El valor de la constante ocupa un espacio en memoria, donde se almacena dicho valor que 
no cambia a lo largo del programa, sin embargo para hacer una VARIABLE como una CONSTANTE
se debe agregar "final" que funcional con cualquier tipo de dato int, string, etc
*/

        final int numero2 = 12;
        System.out.println("El numero con constante "+numero2);
        
//al intentar cambiar el valor va a tirar un error
        //numero2 = 14;

    }
    
}
