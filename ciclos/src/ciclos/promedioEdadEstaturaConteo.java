/*
DADAS LAS EDADES Y ESTATURAS DE 5 ALUMNOS, MOSTRAR LA EDAD Y ESTATURA MEDIA, LA CANTIDAD DE
ALUMNOS MAYORES DE 18 AÑOS, Y LA CANTIDAD DE ALUMNOS QUE MIDEN MAS DE 1.75
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class promedioEdadEstaturaConteo {
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int edad, sumaEdad = 0, contadorEstatura175 = 0, contadorEdad18 = 0;
        float estatura, sumaAltura = 0, promedioEdad, promedioEstatura;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno  #" + i + " indique su edad: ");
            edad = entrada.nextInt();
            sumaEdad += edad;                //suma iterativa de edades
                        
            System.out.println("Ingrese su estatura: ");
            estatura = entrada.nextFloat();
            sumaAltura += estatura;          //suma iterativa de estaturas
                       
            if (edad > 18) {                 //edad mayor a 18
                contadorEdad18++;
            } 
                
            if (estatura > 1.75) {           //altura mayor a 1.75
                contadorEstatura175++;
            }
         
        }
        
        
        promedioEdad = (float) sumaEdad / 5;
        promedioEstatura = (float) sumaAltura / 5;
        
        
        System.out.println("El promedio de las edades es de "+promedioEdad+"\n"
                + "El promedio de las estaturas es de " +promedioEstatura+"\n"
                        + "Hay " + contadorEdad18+" alumnos mayores de 18 años \n"
                                + "Hay " +contadorEstatura175+ " alumno(s) que mide(n) mas de 1.75m");
        
    }
}
