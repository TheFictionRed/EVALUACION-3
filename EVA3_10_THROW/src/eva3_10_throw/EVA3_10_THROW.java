
package eva3_10_throw;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
      Scanner sc = new Scanner(System.in);
      
        try {
            String nom = null;
            String ap = null;
            int edad=0;
           
            System.out.print("Introduce el nombre: ");
            nom = sc.nextLine();
            System.out.print("Introduce el apellido: ");
            ap = sc.nextLine();
            System.out.print("Introduce la edad: ");
            edad = sc.nextInt();
             Persona pers = new Persona(nom, ap, edad);
       
        } catch (Exception e) {
            e.printStackTrace();
        }
      
     
      
        
        System.out.println("Fin del programa!!");
    }
    
}
