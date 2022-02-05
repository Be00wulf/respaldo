/*
Solicitar un tiempo (en segundos) y distancia (en metros) y en base a ello calcule la velocidad 
del objeto. Una vez mostrado el resultado preguntar al usuario si quiere mostrar la velocidad 
usando Km/h.
 */
package tarealab;

import java.util.Scanner;


public class velocidad {
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);        
        float tiempoSegundos, distanciaMetros, velocidadMS, tiempoHoras, distanciaKilometros, velocidadKH;        
        int seleccion;
        
        System.out.println("*****CALCULADORA DE VELOCIDAD (m/s)*****");
        
        
//Pidiendo datos al usuario        
        System.out.print("Ingrese el valor del tiempo en segundos: ");
        tiempoSegundos = entrada.nextFloat();
        
        System.out.print("Ingrese el valor de la distancia en metros: ");
        distanciaMetros = entrada.nextFloat();

//cálculo        
        velocidadMS = distanciaMetros / tiempoSegundos;       
        System.out.println("La velocidad es de " + velocidadMS + " m/s");
        
        
//Estableciendo el rango de seleccion        
            do {            
                System.out.print("Si desea mostrar la velocidad en Kilometros por hora presione 0, sino presione 1: ");
                seleccion = entrada.nextInt();
            } while (seleccion < 0 || seleccion > 1);
        
        
//Condicionales de seleccion        
            if (seleccion == 0) {   
                tiempoHoras = tiempoSegundos / 3600;
		distanciaKilometros = distanciaMetros / 1000;
		velocidadKH = distanciaKilometros / tiempoHoras;	
                System.out.println("La velocidad es de " + velocidadKH);               
            }else if(seleccion == 1){
                System.out.println("Calculo finalizado");
            }
        
    }
}
