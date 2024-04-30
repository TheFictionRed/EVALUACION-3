
package eva3_6_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FERNANDO
 */
public class EVA3_6_EXCEPTION {

    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
        
        System.out.println("Inrtoduce el numerador:");
        int num = sc.nextInt();
        System.out.println("Inrtoduce el divisor:");
        int div = sc.nextInt();
        int resu = 0;
        resu = num / div;
        System.out.println("Resultado es: " + resu);
            
        } catch(Exception e){
        e.printStackTrace();   
        }  
           
        
        
        
        
        System.out.println("Finl del programa");
    }
    
}
