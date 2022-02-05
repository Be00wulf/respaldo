/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

/**
 *
 * @author orcha
 */
public class operadorDeIncrementoYdecremento {
    
    public static void main(String [] args){
    
//INCREMENTO: AUMENTA EN UNO, AL VALOR INICIAL DADO.
        int x = 8;
        x++;            //es igual a: x += 1; 
        System.out.println(x);    // 8 aumenta 1 y el nuevo valor es 9   
//EL DECREMENTO ES: x--;


        
//ESTOS OPERADORES PUEDEN VARIAR DE ESTAS FORMAS:        
        int y = 5, z;       //Asignar variables
        
/*
AL PONER ++ COMO SUFIJO, PRIMERO SE ASIGNA EL VALOR
DE "y" en "z" Y LUEGO SE AUMENTA "y" 
        z = y++;
SI SE IMPRIME z, EL VALOR SERA 5
SI SE IMPRIME y, el valor es 6
*/        
             
        
/*
SI SE PONE COMO PREFIJO PRIMERO SE AUMENTA EL VALOR DE "y" Y LUEGO SE ASIGNA A "z"
        z = ++y
SI SE IMPRIME "z", EL VALOR SERA 6
*/     
        
        z = ++y;
        System.out.println(z);
        
        //sucede lo mismo con decremento --x ó x--
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
