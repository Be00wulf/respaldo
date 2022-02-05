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
public class BeBida {
    private static int identificadorInicial = 1;
    private int identificador;
    private double cantidad;
    private double precio;
    private String marca;
    
    
    //constructor
    public BeBida(int identificador, double cantidad, double precio, String marca) {
        this.identificador = identificadorInicial;
        identificadorInicial++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }
    
    
    //getters&setters (no se incluye el identificadorInicial ya que este se almacena en identificadoe)
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Bebida{" + "identificador=" + identificador + ", cantidad=" + cantidad + ", precio=" + precio + ", marca=" + marca + '}';
    }

}