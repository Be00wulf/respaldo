/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane; //se trabajará con entrada por cuadro de diálogo

/**
 *
 * @author orcha
 */
public class sentenciaIfElse {
    public static void main(String[] args) {
        int numero, dato = 5;
        
        //  Integer.parseInt conviere texto a numero entero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        } else {
            JOptionPane.showMessageDialog(null, "EL número es diferente de 5");
        }
              
        
        
        
        
        
        
        
        
        
        
        
        
    }   
    
}
