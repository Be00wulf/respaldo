/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class pruebaWhile {
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        
        double precio, compra = 0, descuento, pagoFinal;
        
        
        
        System.out.println("Agrefar productos a la canasta");
        
        do  {  
            
          System.out.println("Ingrese un precio para agregar producto a la canasta o presione 0 para pagar ahora"); 
          precio = entrada.nextDouble();
          
          compra = compra+precio;
        } while (precio != 0);                
                
        System.out.println("Compra total de " + compra);
        
        if (compra < 500) {
            descuento = compra*0.1;
            pagoFinal = compra - descuento;
            
            System.out.println("El descuento es de " + descuento);
            
            System.out.println("El nuvo total a pagar es" + pagoFinal);
            
        }   else if (compra >= 500) {
            descuento = compra*0.15;
            pagoFinal = compra - descuento;
            
            System.out.println("El descuento es de " + descuento);
            
            System.out.println("El nuvo total a pagar es " + pagoFinal);
        
        }
        
    }
}
