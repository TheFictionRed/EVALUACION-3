
package eva3_2_unchecked_exception;

/**
 *
 * @author FERNANDO
 */
public class EVA3_2_UNCHECKED_EXCEPTION {

    public static void main(String[] args) {
        //NULLPOINTEREXCEPTION
        //CUANDO QUEREMOS USAR UN OBJETO QUE NO EXISTE
        
        //Persona persona = null;
        //System.out.println(persona.toString());
        
        //INDEXOUTOFBOUNDSEXCEPTION
        //Cuando se quiere leer una posicion que no existe
       /* int arreglo[] = new int[10];
        //0 es la primer posicion, n -1 es la ultima posicion
       
        arreglo[15] = 100;*/
       //ARITHMETICEXCEPTION: Division por 0
       int x = 10, y = 0 ;
       int resu = x/y;
        System.out.println(resu);
        
        
    }
    
    class Persona{
    
    
    
    }
}
