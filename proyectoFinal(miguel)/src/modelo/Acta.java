package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Acta implements Serializable,Comparable<Acta> {

    //atributos 
    long codigoActa;
    LocalDate fecha;
    String observaciones;
    long codigoProyecto;

    public Acta() {
    }

    public Acta(long codigoActa, LocalDate fecha, String observaciones, long codigoProyecto) {
        this.codigoActa = codigoActa;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.codigoProyecto = codigoProyecto;
    }

    public long getCodigoActa() {
        return codigoActa;
    }

    public void setCodigoActa(long codigoActa) {
        this.codigoActa = codigoActa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public long getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(long codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    @Override
    public String toString() {

        String reporte = "-----------------------------------------------------------------\n"
                       + "ACTA NUMERO: \n"
                       + ""+ this.codigoActa + "\n"
                       + "-----------------------------------------------------------------\n"
                       + "FECHA DE  LA CREACION DEL ACTA : \n"
                       + ""+ fecha + "\n"
                       + "OBSERVACIONES :\n"
                       + ""+ observaciones + "\n"
                       + "-----------------------------------------------------------------\n\n";
        
        return reporte;

    }

    @Override
    public int compareTo(Acta t) {
        return fecha.compareTo(t.getFecha());
    }

}
