
package eva3_4_try_catch;

/**
 *
 * @author FERNANDO
 */
public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {
       //ARTHMETICEXCEPTION
        int x =10, y=0;
        
        int resu = 0;
        
        try {
           resu = x/y;


        } catch (ArithmeticException e) {
            //AQUI VA LA SOLUCIUON QUE LE VOY A DAR A LA EXCEPTION
            //Que es lo que queremos hacer
            e.printStackTrace();
        }
        
         System.out.println("El resultado es = " + resu);   
        
    }
    
}
