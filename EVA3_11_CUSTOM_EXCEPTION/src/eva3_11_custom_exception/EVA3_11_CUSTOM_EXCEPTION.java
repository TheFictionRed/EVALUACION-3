
package eva3_11_custom_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class EVA3_11_CUSTOM_EXCEPTION {

    public static void main(String[] args) {
        
        
        try {
            mensaje();
        } catch (MiException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void mensaje() throws MiException{
        System.out.println("Mensaje");
        throw new MiException("Falla del sistema");
    
    }
    
}
 class MiException extends Exception{

    public MiException() {
    }

    public MiException(String message) {
        super(message);
    }
 
 
 
 
 
 
 }