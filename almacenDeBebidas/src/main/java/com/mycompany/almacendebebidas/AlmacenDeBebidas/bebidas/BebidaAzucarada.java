/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas;

/*
 * @author orcha
 */

public class BebidaAzucarada extends BeBida{
    private int porcentajeAzucar;
    private boolean promocion;
    
    //constructor
    public BebidaAzucarada(int porcentajeAzucar, boolean promocion, int identificador, double cantidad, double precio, String marca) {
        super(identificador, cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }
    
    
    //getters&setters
    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
    
    //si hay promocion se sobreescribe el precio
    @Override
    public double getPrecio(){
        if (isPromocion() == true) {
            return super.getPrecio()*0.9; //ya es el precio con el descuento incluido
        }   else{
            return super.getPrecio();
        }
    }
    
    
    //toString
    @Override
    public String toString() {
        return super.toString() + "porcentajeAzucar = " + porcentajeAzucar + ", promocion=" + promocion;
    }
}