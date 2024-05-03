
package eva3_10_throw;

/**
 *
 * @author FERNANDO
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "____";
        this.apellido = "____";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception{
        this.nombre = nombre;
        this.apellido = apellido;
        if(edad < 0 || edad > 150)
           throw new Exception ("Valor capturado en la edad no es valido");
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
                   this.edad = edad;
            if(edad < 0 || edad > 150)
           throw new Exception ("Valor capturado en la edad no es valido");

    }
    
    
    
}
