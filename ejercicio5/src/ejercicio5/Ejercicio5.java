/*
LA CALIFICACION FINAL DE UN ESTUDIANTE DE INFORMATICA, SE CALCULA EN BASE A
LAS CALIFICACIONES DE 4 ASPECTOS DE SU REDIMIENTO ACADÉMICO: PARTICIPACIÓN, 
PRIMER Y SEGUNDO EXAMEN PARCIAL, Y EXAMEN FINAL. SABIENDO QUE LAS CALIFICACIONES
ANTERIORES ENTRAN A LA CALIFICACION FINAL CON PONDERACIONES DEL
10%, 25%, 25%, 40%`. HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CALIFICACION FINAL
OBTENIDA POR UN ESTUDIANTE.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, examenFinal, notaFinal;
        
//pedir datos al usuario
        
        System.out.println("¿Cuál fue la nota de la participación del alumno?");
        participacion = entrada.nextFloat();
        
        System.out.println("¿Cuál fue la nota de su primer parcial?");
        parcial1 = entrada.nextFloat();
        
        System.out.println("¿Cuál fue la nota de su segundo parcial?");
        parcial2 = entrada.nextFloat();
        
        System.out.println("¿Cuál fue la nota de su examen final?");
        examenFinal = entrada.nextFloat();
        
//porcentajes

        participacion = participacion * 0.10f;     // se puede usar participacion *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25;
        examenFinal *= 0.40f;
        
        notaFinal = participacion + parcial1 + parcial2+examenFinal;
        
        
        System.out.println("La nota final del estudiante es: "+notaFinal);
        
        
        
        
        
        
    }
    
}
