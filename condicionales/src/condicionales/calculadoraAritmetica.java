/*
CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA QUE PUEDE REALIZAR 
( +, -, x, ÷) con enteros. El usuario debe especificar la operacion con el primer caracter 
del primer parametro de la linea de comandos:
S o s para suma
R o r para resta
M o m para multiplicacion 
D o d para division
*/
package condicionales;

import java.util.Scanner;


/*
 * @author orcha
 */
public class calculadoraAritmetica {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, suma, resta, mult, div;
        char operacion;
        
        System.out.println("Ingrese el valor del primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor del segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Ingrese la opcion que desea realizar: ");
        operacion = entrada.next().charAt(0);   //charAt(0)->el cero es la posicion de la letra
        
        switch(operacion){
            case 's': //no se pone otra vez la condicion, ya que no se ha puesto break y cumple lo mismo tanto para el de abajo
            case 'S': suma = numero1 + numero2;
                      System.out.println("La suma es: " + suma);
                      break;
                      
            case 'r':
            case 'R': resta = numero1 - numero2;
                      System.out.println("La resta es: " + resta);
                      break;
            case 'm':
            case 'M': mult = numero1 * numero2;
                     System.out.println("La multiplicacion es: " + mult);
                     break;
                      
            case 'd':
            case 'D': div = numero1 / numero2;
                      System.out.println("La division es: " + div);
                      break;           
                      
           default: 
                      System.out.println("Error, se equivoco de operacion");
                   
                       
                      
                      
        }
        
        
        
        
        
    }
}
