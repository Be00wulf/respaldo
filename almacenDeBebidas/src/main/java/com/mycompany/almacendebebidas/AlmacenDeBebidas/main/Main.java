/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacendebebidas.AlmacenDeBebidas.main;

import com.mycompany.almacendebebidas.AlmacenDeBebidas.almacen.Almacen;
import com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas.AguaMIneral;
import com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas.BeBida;
import com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas.BebidaAzucarada;

/*
 * @author orcha
 */

public class Main {
    public static void main(String[] args) {
        
        
        //objeto
        Almacen a = new Almacen();
        
        BeBida b;
        
        
        
        //para agregar varios
        for (int i = 0; i < 10; i++) {
            switch(i%2){        //posiciones pares 
                case 0:
                    b = new AguaMIneral("manantial 1", 3312, 1.5, 2.50, "Saborrr"); //modificar id (?)
                    a.agregarProducto(b);
                    break;
                    
                case 1:
                    b = new BebidaAzucarada(20, true, 3212, 1.5, 10, "Licuado");
                    a.agregarProducto(b);
                    break;
            }
        }
        
        a.mostrarProductos();
        
        
        
        
        
    }
}
