
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FERNANDO
 */
public class EVA3_5_TRY_CATCH {

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
            
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        
        System.out.println("Fin del programa");
    }
    
}
