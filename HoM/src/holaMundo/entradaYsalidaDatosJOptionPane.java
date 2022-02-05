/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

import javax.swing.JOptionPane;

/**
 *
 * @author orcha
 */
public class entradaYsalidaDatosJOptionPane {
    
    public static void main(String [] args){
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        
        
/*
Importar libreria swing, para JOptionPane aparecera un recuadro interactivo en lugar de usar la consola.
Lo que se escriba dentro de la ventanilla emergente se guardará dentro de la variable o constante.
Input es para la entrada de datos, se usara solo cuando se requiere que el usuario dé informacion
para esta ser guardada en una variable o constante.
*/
        cadena = JOptionPane.showInputDialog("Escriba mucho texto: ");
        
        
/*
JOptionPane solo devuelve String, no se puede guardar un String en una variable entera
Para poder transformar un entero a un String se debe utilizar:
        Integer.parseInt();
        dentro de estos parentesis se puede colocar ya un String
        
        JOptionPane.showInputDialog(" ");         
        este es un String, y se debe colocar en los parentesis
*/
        entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero: "));
        
        
/*
Para convertir un caracter se debe agregar
          .chatAt(0);      al final de JOptionPane.showInputDialog("");

*/        
        letra = JOptionPane.showInputDialog("Escriba un caracter(UNA letra o UN numero): ").charAt(0);
        
        
/*       
Para el DOUBLE sucede lo mismo que con INT 
        Double.parseDouble();
        dentro de estos parentesis se puede colocar ya un String
        
        JOptionPane.showInputDialog(" ");         
        es un String, y se debe colocar en los parentesis
*/       
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escriba un decimal (use punto): ")); 
        //lo mismo con float:  " .parseFLoat"       en las ventanas de dialogo se debe usar punto(.) y no coma (,)
/*
AHORA SE MOSTRARAN LOS DATOS QUE SE HAN ESTADO PIDIENDO con: JOptionPane.showMessageDialog(cmpnt, args);
EN EL SEGUNDO PARAMETRO (args) SE ESCRIBIRA EL MENSAJE QUE SE DESEA MOSTRAR        
*/
 
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
