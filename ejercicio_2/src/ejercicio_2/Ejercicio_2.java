/*
HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL DE UN EMPLEADO A PARTIR DE 
SUS HORAS SEMANALES TRABAJADAS Y DE SU SALARIO POR HORA
 */
package ejercicio_2;

import java.util.Scanner;


public class Ejercicio_2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float salario, horas, mult;
        
//DATOS DEL TRABAJADOR        
        System.out.println("¿Cual es el salario del trabajador? (usar coma decimal) ");
        salario = entrada.nextFloat();
                
        System.out.println("¿Cuantas horas trabajo esta semana? ");
        horas = entrada.nextFloat();
        
//CALCULO
        mult = salario * horas;
        System.out.println("El salario semanal del trabajador es de Q"+mult);
        
        
        
    }
    
}
