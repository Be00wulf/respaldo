/*
UNA EMPRESA QUE SE DEDICA A LA VENTA DE DESINFECTANTES, NECESITA UN PROGRAMA PARA
GESTIONAR LAS FACTURAS. EN CADA FACTURA FIGURA: EL CODIGO DEL ARTICULO, LA CANTIDAD
VENDIDA EN LITROS Y EL PRECIO POR LITRO. SE PIDE DE 5 FACTURAS INTRODUCIDAS:
FACTURACION TOTAL, CANTIDAD DE LITROS VENDIDOS DEL ARTICULO 1 Y CUANTAS FACTURAS SE
EMITIERON DE MAS DE $600.

SOLO EXISTEN 3 PRODUCTOS CON PRECIOS
1- $0.6 el litro
2- $3 el litro
3- $1.25 el litro
 */
package ciclos;

import java.util.Scanner;

/*
 * @author orcha
 */

public class resumenVentasEmpresaCon3precios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, litrosVendidos, litrosArticulo1 = 0, conteoMayor600 = 0;
        float  precioLitro = 1, facturacionXfactura, facturacionTotal = 0;
        
            for (int i = 1; i <= 5; i++) {
                System.out.print("Artículo #" +i+". Ingrese el codigo del producto: ");
                codigo = entrada.nextInt();
                
                System.out.print("Artículo #" +i+". Ingrese la cantidad de litros vendidos: ");
                litrosVendidos = entrada.nextInt();
           
                    switch (codigo) {
                    case 1:
                        precioLitro = 0.6f;
                        litrosArticulo1 += litrosVendidos;
                        break;
                    case 2:
                        precioLitro = 3f;
                        break;
                    case 3:
                        precioLitro = 1.25f;
                        break;
                    }

                    
                System.out.println(" ");

                facturacionXfactura = litrosVendidos*precioLitro;     //Importe por factura
                facturacionTotal += facturacionXfactura;             
     
            }
            
        System.out.println("RESUMEN DE VENTAS");
            System.out.println("La facturacion total es de: "+facturacionTotal);  
            System.out.println("Se han vendido "+litrosArticulo1+" litros del articulo con codigo 1.");
            System.out.println("Se emitieron " + conteoMayor600+ " facturas de mas de $600");
            
    }

}




