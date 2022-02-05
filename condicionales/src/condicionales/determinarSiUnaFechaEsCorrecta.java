/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo todos los meses de 30 días.
 */
package condicionales;

import java.util.Scanner;

/*
@author orcha
 */

public class determinarSiUnaFechaEsCorrecta {
    public static void main(String[] args) {
        
//entrada del usuario        
        Scanner entrada = new Scanner(System.in);
        int fecha, mes, anio;
        
        System.out.println("Introduzca la fecha: ");
        fecha = entrada.nextInt();
        
        System.out.println("Introduzca el numero de mes: ");
        mes = entrada.nextInt();
        
        System.out.println("Introduzca el año: ");
        anio = entrada.nextInt();
        
        
//operaciones        
        if(fecha>0 && fecha<=30){        //si el dia es correcto
            if (mes>0 && mes<=12) {      //si el mes es correcto
                if (anio != 0) {         //si el año es correcto, el año cero no existe
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Año incorrecto");
                }
            } else {
                System.out.println("Error: debe ingresar un mes del año");
            }
        } else {
            System.out.println("Error: debe ingresar un dia del mes");
        }
        
        
        
    }
}
