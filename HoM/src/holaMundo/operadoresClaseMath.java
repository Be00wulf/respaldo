/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

import javax.swing.SpringLayout;

/**
 *
 * @author orcha
 */
public class operadoresClaseMath {
    public static void main(String [] args){
        
//math permite realizar muchas clases de operaciones


/*
RAIZ CUADRADA
si se desea usar un entero entonces: int raiz = (int)Math.sqrt(9);   
(es mejor si se usa double) 
*/

        double raiz = Math.sqrt(9);
        
        System.out.println(raiz);
        
/*
POTENCIAS
preferentemente se usan variables tipo double
*/        
        
        double base = 2, exponente = 3;
        double resultado = Math.pow(base, exponente);
        
        System.out.println(resultado);
        
        
/*
REDONDEAR UN NUMERO
si se desea redondear un double, se debe guardar en un long
si se desea redondear un float, se debe guardadr en un int       
*/        
 
    //DOUBLE - LONG
        double numero = 4.56;
        long resultadoRedondeo = Math.round(numero);
        
        System.out.println(resultadoRedondeo);
        
    //FLOAT - INT
        float numero2 = 8.56f;
        int resultadoRedondeo2 = Math.round(numero2);
        
        System.out.println(resultadoRedondeo2);
        
/*
RANDOM
obtener un numero aleatorio
        */        
        
        double numeroRandom = Math.random();
        
        System.out.println(numeroRandom);
        
    }
}
