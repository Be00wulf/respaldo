/*
Que sea capaz de agregar un producto(s) a una canasta de compra. Únicamente se debe solicitar 
un precio para agregar producto a la canasta; el usuario podrá elegir la opción de pagar ahora 
o seguir agregando productos. Si el total de la compra es menor a 500 tendrá un descuento del 
10% y si es mayor tendrá un descuento del 15%, dicho total deberá ser desplegado al usuario al 
seleccionar la opción pagar ahora y con esta acción termina el algoritmo
 */
package tarealab;

import java.util.Scanner;


public class canastaProductos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double precio, compra = 0, descuento, pagoFinal;
        
        System.out.println("*** CARRITO DE COMPRA ***");
        System.out.println("Agregar productos a la canasta");
        

// seleccion del usuario        
            do  {  
              System.out.println("Ingrese un precio para comprar un producto o presione 0 para pagar ahora"); 
              precio = entrada.nextDouble();

              compra = compra+precio;
            } while (precio != 0 && precio > 0);
            
            
//compra total        
        System.out.println("Compra total de: " + compra);
        

//descuento del 10%        
            if (compra < 500) {
            descuento = compra*0.1;
            pagoFinal = compra - descuento;
            
            System.out.println("El descuento es de: " + descuento);            
            System.out.println("El nuevo total a pagar es de: " + pagoFinal);
            

//descuento del 15%            
            } else {
            descuento = compra*0.15;
            pagoFinal = compra - descuento;
            
            System.out.println("El descuento es de: " + descuento);           
            System.out.println("El nuevo total a pagar es de: " + pagoFinal);
        
        }

            
    }
}
