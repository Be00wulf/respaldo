/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author orcha
 */
public class Ventana extends  JFrame{
    public Ventana(){       //constructor
        //this.  puede o no llevarlo
        this.setSize(500, 500);     //establecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);        //al apachar la X en la ventana, sale de una vez
        setTitle("BEST TITLE");         //titulo a la ventana
        //setLocation(100, 200);      //para mostrar la ventana en cualquier parte establecida X,Y
        
                //para colocar setLocation y setSize en uno solo se usa: (coordenadas, dimension de la ventana)
        //setBounds(500, 100, 500, 500);
        
                //para establecer la ventana en el centro de la pantalla, ya que varían los tamaños de pantallas
        setLocationRelativeTo(null);
        
                //para darle color a la ventana
        this.getContentPane().setBackground(Color.GREEN);
        
        
                //desde aca se llama el metodo 
        iniciarComponentes();
        
    }    
        
        private void iniciarComponentes(){
            JPanel panel = new JPanel();
            
            this.getContentPane().add(panel);       //this. = JFrame       y se agrega el panel a la ventana
            panel.setBackground(Color.cyan);         //establecemos el color del panel
        }
        
  
}
