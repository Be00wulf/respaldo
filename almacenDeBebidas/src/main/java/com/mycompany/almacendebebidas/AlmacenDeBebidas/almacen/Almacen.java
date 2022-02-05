/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.almacendebebidas.AlmacenDeBebidas.almacen;

import com.mycompany.almacendebebidas.AlmacenDeBebidas.bebidas.BeBida;

/*
 * @author orcha
 */
public class Almacen {
    
    
    //la estanteria donde van las bebidas, matriz
    private BeBida[][] estanteria;
   
    public Almacen(int filas, int columnas){
        estanteria = new BeBida[filas][columnas];
    }
    
    
    //tamaño de la matriz
    public Almacen(){
        estanteria = new BeBida[5][5];
    }
    
   
    //llenando matriz con productos
    public void agregarProducto(BeBida b){
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {     //[0].length ya que las matrices pueden ser cuadradas o rectangulares
                if (estanteria[i][j] == null) {     //buscar un espacio vacio
                    estanteria[i][j] = b;       //colocar el 
                    encontrado = true;      
                }
            }
        }
    
        if (encontrado) {
            System.out.println("Se ha añadido el producto");
        }   else{
            System.out.println("No hay espacio para colocar el producto");
        }
   
    }
    
    
    //eliminando productos de la matriz
    public void quitarProducto(int identificadorID){
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {     //[0].length ya que las matrices pueden ser cuadradas o rectangulares
                if (estanteria[i][j] != null) {     //buscar un espacio con un producto
                    if(estanteria[i][j].getIdentificador() == identificadorID){       //escoge la bebida por pin
                        estanteria[i][j] = null;    
                        encontrado = true;
                    }      
                }
            }
        }
    
        if (encontrado) {
            System.out.println("Se ha quitado el producto");
        }   else{
            System.out.println("No hay producto");
        }
   
    }   

   
    //mostrar datos de la estanteria
    public void mostrarProductos(){
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {     //[0].length ya que las matrices pueden ser cuadradas o rectangulares
                if (estanteria[i][j] != null) {     
                    System.out.println("Fila: " + i + ", Columna: " + j + " " + estanteria[i][j].toString());
                }
            }
        }
    }   
    
    
    //calcular el precio de las bebidas
    public double precioBebidas(){
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                precioTotal += estanteria[i][j].getPrecio();
                
            }
        }
        return precioTotal;
    }
    
    
    //determinar la marca de la bebida
    public double precioBebidas(String marca){
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                    precioTotal += estanteria[i][j].getPrecio();
                } 
            }
        }
        return precioTotal;
    }
    
    
    //total de una estanteria
    public double precioBebidas(int columna){       //indice de columna      
        double precioTotal = 0;  
   
        if (columna >= 0 && columna < estanteria[0].length) {
            
            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria[0].length; j++) {
                    if (estanteria[i][columna] != null) {
                     precioTotal += estanteria[i][columna].getPrecio();
                    } 
                }   
            }
        }   else{
            System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
        }
        
        
        return precioTotal;
    }
    
}
