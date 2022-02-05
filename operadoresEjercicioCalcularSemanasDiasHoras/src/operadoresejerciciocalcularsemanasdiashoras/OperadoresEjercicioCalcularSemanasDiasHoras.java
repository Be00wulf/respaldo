/*
CONSTRUIR UN PROGRAMA QUE, DADO UN NUMERO TOTAL DE HORAS, DEVUELVE EL NUMERO DE SEMANAS, 
DÍAS Y HORAS EQUIVALENTES. POR EJEMPLO, DADO UN TOTAL DE 1000 HORAS, DEBE MOSTRAR
5 SEMANAS, 6 DÍAS Y 16 HORAS
 */
package operadoresejerciciocalcularsemanasdiashoras;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class OperadoresEjercicioCalcularSemanasDiasHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int horasTotales, dias, semanas, horas;
        
        System.out.println("Introduzca el numero de horas: ");
        horasTotales = entrada.nextInt();
        
//para hallar el numero de semanas (hay 168 horas a la semana)
        semanas = horasTotales / 168; 
        
//para hallar el numero de dias (se usa el % para tener el resido de las semanas) en 1 dia hay 24h 
        dias = (horasTotales%168) / 24;
        
//para hallar el numero de horas (se usa el % para tener el residuo de los dias)        
        horas = horasTotales%24;

        System.out.println("\n El equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        
        
        
        
    }
    
}
