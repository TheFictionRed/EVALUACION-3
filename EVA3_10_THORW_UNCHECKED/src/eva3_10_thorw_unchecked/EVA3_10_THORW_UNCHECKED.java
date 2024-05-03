
package eva3_10_thorw_unchecked;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class EVA3_10_THORW_UNCHECKED {

    
    public static void main(String[] args){
        try {
            Persona perso = new Persona("Juan", "Peréz", -1);
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }
    
}
