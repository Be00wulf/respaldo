/*
PEDIR TRES NUMEROS Y ORDENARLOS DE MAYOR A MENOR
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */

public class ordenarNumerosDeMayorAmenor {
  public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        
//pedir datos al usuario
        System.out.println("Introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        
//ordenar numeros de mayor a menor

//n1>n2>n3
        if(numero1>numero2  &&  numero2>numero3){
            System.out.println("Orden: " + numero1 + "-" + numero2 + "-" + numero3);
        
//n2>n3>n1            
        }else if(numero2>numero3  &&  numero3>numero1){
            System.out.println("Orden: " + numero2 + "-" + numero3 + "-" + numero1);

//n3>n1>n2            
        }else if(numero3>numero1  &&  numero1>numero2){
            System.out.println("Orden: " + numero3 + "-" + numero1 + "-" + numero2);
  
//n3>n2>n1            
        }else if(numero3>numero2  &&  numero2>numero1){
            System.out.println("Orden: " + numero3 + "-" + numero2 + "-" + numero1);
        
//n1>n3>n2
        }else if(numero1>numero3  &&  numero3>numero2){
            System.out.println("Orden: " + numero1 + "-" + numero3 + "-" + numero2);

//n2>n1>n3
        }else if(numero2>numero1  &&  numero1>numero3){
            System.out.println("Orden: " + numero2 + "-" + numero1 + "-" + numero3);
        }



    }
    
}
