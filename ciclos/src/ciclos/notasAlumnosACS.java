/*
DADAS 6 NOTAS (0-10), ESCRIBIR LA CANTIDAD DE ALUMNOS APROBADOS (nota de 5-10)
, CONDICIONADOS (nota=4) Y SUSPENSOS (nota de 0-3)
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class notasAlumnosACS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        int contarAprobado =0, contarCondicionado = 0, contarSuspendido = 0;
        
        System.out.println("NOTAS DE ALUMNOS");
        
            for (int i = 1; i <= 6; i++) {      

/*
este podria considerarse el error que sale si el usuario ingresa una nota fuera del rango 
el do...while que se muestra a continuacion, establece los limites, para no condicionar
tanto el if...else                
*/          

                do {                    
                   System.out.print("Ingrese la nota del alumno (entre 0-10): ");
                   nota = entrada.nextFloat(); 
                } while (nota < 0 || nota > 10);   
                
                
//aqui se determina si el alumno suspende, condiciona o aprueba                
                
                if (nota == 4) {
                    contarCondicionado++;
                }   else if (nota >= 5) {
                    contarAprobado++;
                }else{
                    contarSuspendido++;
                }
    
            }
        
        
        System.out.println("Cantidad de condicionados: "+ contarCondicionado);
        System.out.println("Cantidad de aprobados: " +contarAprobado);
        System.out.println("Cantidad de reprobados: " +contarAprobado);
                
        
    }
}
