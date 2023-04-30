package modelo;

import java.io.Serializable;

public class Modalidad extends Informacion implements Serializable {
    
private String nombreMod;


    public Modalidad() {
    }

    public Modalidad(String nombreMod, long Id) {
        super(Id);
        this.nombreMod = nombreMod;
    }

    public String getNombreMod() {
        return nombreMod;
    }

    public void setNombreMod(String nombreMod) {
        this.nombreMod = nombreMod;
    }

    @Override
    public String toString() {
        return this.nombreMod;
    }


    
}
