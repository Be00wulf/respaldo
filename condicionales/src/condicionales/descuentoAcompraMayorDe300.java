/*
EJERCICIO 4: EN MEGAPLAZA SE HACE UN 20% DE DESCUENTO A LOS CLIENTES CUYA COMPRA SUPERE
LOS $300 ¿CUÁL SERÁ LA CANTIDAD QUE PAGARÁ UNA PERSONA POR SU COMPRA?
 */
package condicionales;

import java.util.Scanner;

/*
@author orcha
 */
public class descuentoAcompraMayorDe300 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double compra, descuento, pago;
        
        System.out.println("¿De cuánto fue la compra del cliente?: ");
        compra = entrada.nextDouble();
        
        descuento = compra * 0.2;
        
        if(compra > 300){
            pago = compra - descuento;
            System.out.println("El pago con descuento del 20% es de: " + pago);
            //pago = compra - (compra*0.2);
            
        } else if(compra <= 300){
            System.out.println("El pago sin descuento del 20% es de: " + compra);
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
