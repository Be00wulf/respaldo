/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas;

/**
 *
 * @author orcha
 */
public class AguaMIneral extends BeBida{
    private String manantial;

    
    //constructor

    public AguaMIneral(String manantial, int identificador, double cantidad, double precio, String marca) {
        super(identificador, cantidad, precio, marca);
        this.manantial = manantial;
    }
    

    
    //getters&setters
    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }
    
    
    //toString
    @Override
    public String toString() {
        return super.toString()+ "manantial = " + manantial;
    }
    //con el super.toString() corre tambien el toString del padre
}

