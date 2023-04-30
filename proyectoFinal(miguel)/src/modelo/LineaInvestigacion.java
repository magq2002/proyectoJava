
package modelo;

import java.io.Serializable;

public class LineaInvestigacion extends Informacion implements Serializable{

    private String nombreInv;
    
    
    public LineaInvestigacion() {
    }

    public LineaInvestigacion(String nombreInv, long Id) {
        super(Id);
        this.nombreInv = nombreInv;
    }

    public String getNombreInv() {
        return nombreInv;
    }

    public void setNombreInv(String NombreInv) {
        this.nombreInv = NombreInv;
    }

    @Override
    public String toString() {
        return this.nombreInv;
    }


    
}
