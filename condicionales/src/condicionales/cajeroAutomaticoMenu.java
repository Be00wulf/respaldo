/*
HACER UN PROGRAMA QUE SIMULE UN CAJERO AUTOMATICO CON UN SALDO INICIAL DE 1000 DOLARES,
CON EL SIGUIENTE MENU DE OPCIONES:

1. INGRESAR DINERO A LA CUENTA
2. RETIRAR DINERO DE LA CUENTA
3. SALIR
 */
package condicionales;

import java.util.Scanner;

/*
 * @author orcha
 */

public class cajeroAutomaticoMenu {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int saldoInicial = 1000;
        int seleccion;
        float ingreso, saldoActual, retiro;
        
        System.out.println("Bienvenido a su cajero automatico\n"
                + "1. ingresar dinero a la cuenta\n"
                + "2. retirar dinero de la cuenta\n"
                + "3. salir");
        seleccion = entrada.nextInt();
        
        switch(seleccion){
            case 1: 
                System.out.println("Digite la cantidad que ingresará a la cuenta");
                ingreso = entrada.nextInt();
                saldoActual = saldoInicial + ingreso;
                System.out.println("El nuevo saldo de la cuenta es: " + saldoActual);
            break;
            
            
            
            case 2: 
                System.out.println("Digite la cantidad que retirará de la cuenta");
                retiro = entrada.nextFloat();
                
                if (retiro > saldoInicial) {
                    System.out.println("Error: fondos insuficientes");
                } else if(retiro <= saldoInicial){
                    saldoActual = saldoInicial - retiro;
                    System.out.println("El nuevo saldo de la cuenta es: " + saldoActual);
                }
                
            break;
                
                
            case 3:
                break;
                
            default: 
                System.out.println("Error: seleccion invalida");
                
                
                
                
                
                
                
                
                
        }
               
        
        
        
        
        
        
        
        
        
    }
}
