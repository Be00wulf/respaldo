/*
CONSTRUIR UN PROGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RAICES DE LA ECUACION
DE SEGUNDO GRADO DE COEFICIENTES REALES
 */
package calculadoraraicesgrado2;

import java.util.*;

/**
 *
 * @author orcha
 */
public class CalculadoraRaicesGrado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        float ax2, bx, c, x1, x2;
        
//ax²        
        System.out.println("Digite el valor de *a* (en ax²): ");
        ax2 = entrada.nextFloat();
        
//bx   
        System.out.println("Digite el valor de *b* (en bx): ");
        bx = entrada.nextFloat();
    
//c        
        System.out.println("Digite el valor de *c*: ");
        c = entrada.nextFloat();
        
        
// raices
        x1 = (float) ((-bx + Math.sqrt(bx*bx - 4*ax2*c))/(2*ax2));
        x2 = (float) ((-bx - Math.sqrt(bx*bx - 4*ax2*c))/(2*ax2));
        
//respuesta
        System.out.println("Las raices del polinomio son: x1=" + x1 + " y x2=" + x2 );
        
        
    }
    
}
