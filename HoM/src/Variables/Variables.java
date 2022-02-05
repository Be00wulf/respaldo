
package Variables;

/**
 *
 * @author orcha
 */
public class Variables {
    
    //TIPOS DE DATOS PRIMITIVOS
    
    public static void main(String [] args){
        
//"BYTE" ALMACENA DESDE -128 HASTA 127 Y OCUPA 8 BITS
        byte entero1 = 123;
        System.out.println("Número entero byte "+entero1);
        
//"SHORT" ALMACENA DESDE -32768 HASTA 32767 Y OCUPA 16 BITS
        short entero2 = 12345;
        System.out.println("Número entero short "+entero2);
        
//"INT" ALMACENA DESDE -2,147,483,648 HASTA 2,147,483,647 Y OCUPA 32 BITS
        int entero3 = 123456;
        System.out.println("Número entero int "+entero3);
        
//"LONG" ALMACENA DESDE -9,223,372,036,854,775,808 HASTA 9,223,372,036,854,775,807 Y OCUPA 64 BITS
        long entero4 = 123456789;
        System.out.println("Número entero long "+entero4);
         
/*PARA DECIMALES "FLOTAT" ALMACENA 1.4E-45 HASTA 3.4E+038 Y OCUPA 32 BITS HAY QUE 
COLOCAR UNA f LUEGO DEL DECIMAL PARA QUE LO RECONOZCA COMO TAL Y NO TIRE ERROR*/
        float decimal1 = 3.55f;
        System.out.println("Número decimal float "+decimal1);
        
/*PARA DECIMALES "DOUBLE" ALMACENA 4.9E-324 HASTA 1.8E+308 Y OCUPA 64 BITS, NO HAY QUE 
        COLOCAR UNA f LUEGO DEL DECIMAL PARA QUE LO RECONOZCA COMO TAL*/
        double decimal2 = 4.584;
        System.out.println("Número decimal double "+decimal2);
        
//PARA Variables TIPO CARACTERES "CHAR"   (a r T 2  son caracteres individuales) ES NECESARIO ENCERRAR EL CARACTER EN COMILLAS SIMPLES
        char caracter1 = 'k';
        System.out.println("Caracter char "+caracter1);
        
        char caracter2 = '7';
        System.out.println("Caracter char "+caracter2);
        
//PARA CONDICIONAL VERDADERO o FALSO "BOOLEAN"
        boolean decision1 = true;
        System.out.println("La decision es "+decision1);
        
        boolean decision2 = false;
        System.out.println("La decision es "+decision2);
        
        
        
        
    }
          
}