
package modelo;


import java.io.Serializable;
import java.time.LocalDate;



public class Profesor extends Persona implements Serializable{
    

private String Apellidos;


    public Profesor() {
    }

    public Profesor(long cedula, String nombre, String apellidos, String email, LocalDate fechaNacimiento) {
        super(cedula, nombre, email, fechaNacimiento);
        this.Apellidos = Apellidos;
        
        
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    @Override
    public String toString() {
        return "Profesor "+ super.getNombre() + " Apellidos= " + Apellidos + " Edad= ";
    }
  
   

    

    
}
