/*
PEDIR UNA NOTA DE 0 A 10 Y MOSTrARLA DE LA FORMA: INSUFICIENTE, BIEN, NOTABLE Y SOBRESALIENTE
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */

public class calificacionBMEde0a10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        System.out.println("Ingrese la nota del estudiante: ");
        nota = entrada.nextDouble();
        
        if(nota >=0 && nota <=5){
            System.out.println("Insuficiente");
        } else if (nota >5 && nota <7) {
            System.out.println("Bien");
        } else if (nota >= 7  &&  nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
        
        
    }
}
