
package eva3_7_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO
 */
public class EVA3_7_EXCEPTION {

    public static void main(String[] args) {
        
        int resu = 0; 
        
     while(true){     
        
            try {   
                Scanner sc = new Scanner(System.in);

            System.out.println("Inrtoduce el numerador:");
                int num = sc.nextInt();
            System.out.println("Inrtoduce el divisor:");
             int div = sc.nextInt();        
                    resu = num / div;
            System.out.println("Resultado es: " + resu);
            
                    break;

            } catch(InputMismatchException e){
                  System.out.println("Valor no valido");  
              }
              catch(ArithmeticException e){
                  System.out.println("El numero no se puede dividir entre cero");
              }
        
      }
        
 }    
}
