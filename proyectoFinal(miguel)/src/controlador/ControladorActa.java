package controlador;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import modelo.Acta;

public class ControladorActa {

    static ArrayList<Acta> actas = new ArrayList<>();//se intancia la clase array list que va aser tipo acta.

    Archivo archivo = new Archivo();

    public int generarId(){
      // actas = archivo.leer("actas");
        int a=0;
        a=actas.size();
        a+=1;
        return a;
    }

    public boolean createActa(Acta acta) {
      actas = archivo.leer("actas");
        boolean verificar = false;//se crea una variable booleana para decirle al  usuario si pudo o  no  realizar una accion

        if (!(existeCodigo(acta.getCodigoActa()))) {

            if (!(acta.getCodigoActa() == 0 || acta.getCodigoProyecto() == 0)) {//se  verifica que no  haya ningun campo en  cero 

                verificar = actas.add(acta);
                archivo.guardar(actas,"actas");
            }//revisar que no hayan valores en 0  
            else {

                verificar = false;
            }//else espacios en cero
        }//verifica que no  haya un  acata con  id igual
        else {
            verificar = false;
        }

        return verificar;

    }//crear acta

    private boolean existeCodigo(long codigoActa) {
        actas=archivo.leer("actas");
        if (codigoActa > 0) {// para validar que id sea mayor a 0
            for (int i = 0; i < actas.size(); i++) {
                if (actas.get(i).getCodigoActa() == codigoActa) {// para validar si un codigo  de acta igual

                    return true;// en el caso que exista un codigo igual retorna falso
                }
            }

        }
        return false;
    }

    public String OrdenarActasFecha() {
       actas=archivo.leer("actas");
        String reporte = "";
       

        Collections.sort(actas);

        for (int i = 0; i < actas.size(); i++) {

            reporte += actas.get(i).toString()+"\n";

        }
    return reporte;
    }

}
