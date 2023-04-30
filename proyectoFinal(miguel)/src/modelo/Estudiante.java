
package modelo;

import java.io.Serializable;
import java.time.LocalDate;



public class Estudiante extends Persona implements Serializable{
    
 private long celular;

    public Estudiante() {
    }

    public Estudiante( long cedula, String nombre,long celular, String email, LocalDate fechaNacimiento) {
        super(cedula, nombre, email, fechaNacimiento);
        this.celular = celular;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    

    

   

   
 
 
    
}
