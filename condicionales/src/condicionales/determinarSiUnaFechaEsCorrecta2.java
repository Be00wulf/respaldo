/*
PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA. CON MESES
DE 28, 30 Y 31 DIAS. SIN AÑOS BISIESTOS.
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */

public class determinarSiUnaFechaEsCorrecta2 {
    public static void main(String[] args) {
        
        
        
//pidiendo datos al usuario        
        Scanner entrada = new Scanner(System.in);
        int fecha, mes, anio;
        
        System.out.println("Introduzca la fecha: ");
        fecha = entrada.nextInt();
        
        System.out.println("Introduzca el numero de mes: ");
        mes = entrada.nextInt();
        
        System.out.println("Introduzca el año: ");
        anio = entrada.nextInt();
        
        
//operaciones        
        
    if(mes == 2){
        if(fecha>0 && fecha<=28){        //si el dia es correcto
            if (mes>0 && mes<=12) {      //si el mes es correcto
                if (anio != 0 && anio%4 ==0) {         //si el año es correcto, el año cero no existe
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Año incorrecto, no se aceptan años bisiestos");
                }
            } else {
                System.out.println("Error: debe ingresar un mes del año");
            }
        } else {
            System.out.println("Error: debe ingresar un dia del mes");
        }
    }
    
    
    
    
    
    if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 ||  mes==10 || mes==12){    
        if(fecha>0 && fecha<=31){        //si el dia es correcto
            if (mes>0 && mes<=12) {      //si el mes es correcto
                if (anio != 0 && anio%4 ==0) {         //si el año es correcto, el año cero no existe
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Año incorrecto, no se aceptan años bisiestos");
                }
            } else {
                System.out.println("Error: debe ingresar un mes del año");
            }
        } else {
            System.out.println("Error: debe ingresar un dia del mes");
        }
    }
      
    
    
    
        
        if (mes==4 || mes==6 || mes==9 || mes==11) {
        if(fecha>0 && fecha<=30){        //si el dia es correcto
            if (mes>0 && mes<=12) {      //si el mes es correcto
                if (anio != 0 && anio%4 ==0) {         //si el año es correcto, el año cero no existe
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Año incorrecto, no se aceptan años bisiestos");
                }
            } else {
                System.out.println("Error: debe ingresar un mes del año");
            }
        } else {
            System.out.println("Error: debe ingresar un dia del mes");
        }            
        }
    
        
        
    }
}
