
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FERNANDO
 */
public class EVA3_8_FINALLY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
             System.out.println("introduce un numero entero:");
        int num = sc.nextInt();
        System.out.println("El valor capturado fue: " + num);
        
        } catch (InputMismatchException e) {
            System.out.println("El valor capturado no es un valor entero");
        }finally{
            //Usar para ejecutar codigo critico para el programa 
            //terminar procesos, cerrar archovos o conexiones
            //liberar recursos etc...
            System.out.println("Esta intruccion siempre se va a ejecutar");
            //NADIE EVITA QUE SE PUEDA PRODUCIR UNA EXCEPTION EN ESTE BLOQUE DE CODIGO
          }
       
    }
    
}
