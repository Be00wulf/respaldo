/*
DISEÑAR UN PROGRAMA QUE MULTIPLIQUE LOS PRIMEROS 10 NUMEROS IMPARES
 */
package ciclos;

/*
 * @author orcha
 */

public class multiplicarPrimeros10impares {
    public static void main(String[] args) {
        
        long producto = 1;  //comienza desde 1 ya que es multiplicacion, y con 0 se vuelve cero todo
        
        for (int i = 1; i < 20; i+=2) {     //i+=2 aumenta de 2 en 2 desde 1
            producto *= i; 
        }
        System.out.println("El producto es: "+producto);
        
    }
}
