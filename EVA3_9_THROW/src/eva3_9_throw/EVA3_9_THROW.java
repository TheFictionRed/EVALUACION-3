
package eva3_9_throw;



/**
 *
 * @author FERNANDO
 */
public class EVA3_9_THROW {

    
    public static void main(String[] args) {
        try {        
            metodoProblema();
        } catch (Exception ex) {
            ex.printStackTrace();
        }      
    }
    
    public static void metodoProblema() throws Exception{
    
        System.out.println("Holii!!!");
        throw new Exception("FALLO EL SISTEMA!!!");
        //System.out.println("Hello Kitty"); NUNCA SE VA A EJECUTAR    
    }    
}
