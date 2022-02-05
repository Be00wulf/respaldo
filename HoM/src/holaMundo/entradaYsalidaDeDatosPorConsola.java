/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundo;

import java.util.Scanner;

/**
 *
 * @author orcha
 */
public class entradaYsalidaDeDatosPorConsola {
    
    public static void main(String [] args){
        
        
        
/*
Puede almacenar datos de entrada de numeros, usar: "Scanner"
El uso de la coma (,) es importante en varios dispositivos ya que si se usa el
punto (.) puede ocasionar errores
Importar la libreria Scanner
*/


        Scanner entrada = new Scanner(System.in);
        double numero;
        
        System.out.println("Digite un numero: ");    
//se debe escribir .nextDouble o .nextInt (etc, tipo numero) para almacenar dependientod de la variable
        numero = entrada.nextDouble();                  
        
        System.out.println("El numero es: "+numero);
        
        
/*
Para almacenar cadenas de texto existen dos formas al almacenar
.next para una cadena corta, la cual imprime hasta donde se halle un espacio en la cadena
.nextLine para cadenas largas, esta si admite espacios " " en la cadena
*/        


//.next
        Scanner entrada1 = new Scanner(System.in);
        String cadenaNext;
        
        System.out.println("Digite una cadena corta (debe ser sin espacios): ");    
        cadenaNext = entrada1.next();                  
        
        System.out.println("La cadena es: "+cadenaNext);
        
        
 //.nextLine       
        Scanner entrada2 = new Scanner(System.in);
        String cadenaNextLine;
        
        System.out.println("Digite una cadena larga (puede ser con espacios): ");    

        cadenaNextLine = entrada2.nextLine();                  
        
        System.out.println("La cadena es: "+cadenaNextLine);
        
        
/*
Para almacenar caracteres se debe utilizar 
        .next().charAt(0);       para almacenar
Dentro de charAt() hay que colocar un cero "0" 
El cero "0" representa la primera posicion, o sea si se escribe una cadena
solo se seleccionara la primera letra de ésta
*/        
        

//.next().charAt(0);        
        Scanner entrada3 = new Scanner(System.in);
        char cadenaCharAt;
        
        System.out.println("Digite un caracter: ");    

        cadenaCharAt = entrada3.next().charAt(0);                    
        
        System.out.println("La cadena es: "+cadenaCharAt);




 
        
    }
    
    
}
