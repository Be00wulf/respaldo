
import java.util.Scanner;

/*


                        *******************PENDIENTE*************************






UNA COMPAÑÍA DE VENTA DE CARROS USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO DE $1000 
MENSUALES, MAS UNA COMISION DE $150 POR CADA CARRO VENDIDO, MAS EL 5% DEL VALOR DE LA VENTA 
POR CARRO. CADA MESA EL CAPTURISTA DE LA EMPRESA INGRESA EN LA COMPUTADORA LOS DATOS 
PERTINENTES. HACER UN PROGRAME QUE CALCULE E IMPRIMA EL SALARIO MENSUAL DE UN 
VENDEDOR DADO
package ejercicio4;
*/
public class Ejercicio4 {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            double cantidad, salario, comision = 150;
            double porcentajePorCarro = 0.05;
            
            System.out.println("¿Cuántos autos vendió la persona?: ");
            cantidad = entrada.nextInt();
            
            salario = (1500+ (cantidad*comision) + (cantidad*porcentajePorCarro));
                  
            System.out.println("El salario del vendedor es de: $"+salario);
        
        
        
        
        
        
        
        
        
        
    }
    
}
