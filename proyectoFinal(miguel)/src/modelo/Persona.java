
package modelo;

import java.io.Serializable;
import java.time.LocalDate;



public abstract class Persona implements Serializable {
    
private long cedula;
private String nombre;
private String email;
private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(long cedula, String nombre, String email, LocalDate fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    
}
