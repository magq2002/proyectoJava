
package modelo;

import java.io.Serializable;

public abstract class Informacion implements Serializable {
private long Id;

    public Informacion() {
    }
    
    

    public Informacion(long Id) {
        this.Id = Id;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

}
