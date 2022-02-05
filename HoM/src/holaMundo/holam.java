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
public class holam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba b = new prueba();
        
    }
    int b = 0;
    
    public holam(int b){
        mod(this);
        System.out.println(this.b);
    }
    
    
    public void mod(prueba hola){
        hola.b = hola.b +10;
    }
    
    
}
