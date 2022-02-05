/*
Permita calcular el área y perímetro de un rectángulo.
 */
package tarealab;

import java.util.Scanner;

public class areaYperimetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float base, altura, area, perimetro;
        int  seleccion;
        
        System.out.println("*** PROGRAMA PARA CALCULAR EL AREA O PERIMETRO DE UN RECTANGULO ***");
        
//pidiendo datos        
            System.out.print("Ingrese el valor de la base del rectangulo: ");
            base = entrada.nextFloat();

            System.out.print("Ingrese el valor de la altura del rectangulo: ");
            altura = entrada.nextFloat();
 
//Condicionales de seleccion        
            do  {  
              System.out.print("Presione 1 para calcular el area o 2 para calcular el perimetro: "); 
              seleccion = entrada.nextInt();

            } while (seleccion < 1 || seleccion > 2);
        
            
            if (seleccion == 1) {
                area = base * altura;
                System.out.println("El area es: " + area + " u²");
            }   else if (seleccion == 2) {
                perimetro = (2*base + 2*altura);
                System.out.println("El perimetro es: " + perimetro + " u");
            }
 
            
    }
}
