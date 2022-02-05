/*
HACER UN PROGRAMA QUE PASE DE KG A OTRA UNIDAD DE MEDIDA DE MASA, MOSTRAR UN MENÚ CON LAS
OPCIONES POSIBLES
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */
public class deKGaOtraUnidadDeMedida {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float kilogramos, gramos, miligramos;
        int seleccion;
        
        System.out.println("Conversor: Ingrese la cantidad en kilogramos");
        kilogramos = entrada.nextFloat();
       
        System.out.println("Seleccione la opcion a la que desee convertir \n"
                + "1. gramosn\n"
                + "2. miligramos");
        seleccion = entrada.nextInt();
        
        switch(seleccion){
            case 1: 
                gramos = kilogramos/1000;
                System.out.println(kilogramos + "kilogramos equivalen a " +gramos);
            break;
            
            
            case 2:
                miligramos = kilogramos /1000000;
                System.out.println(kilogramos + " equivalen a " + miligramos);
            break;
            
            default: 
                System.out.println("Error: seleccion invalida");

        }
        
        
        
        
        
        
        
    }
}
