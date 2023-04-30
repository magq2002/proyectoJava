package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Informacion;
import modelo.LineaInvestigacion;
import modelo.Modalidad;

public class ControladorInformacion {

    Archivo archivo = new Archivo();

    static ArrayList<Informacion> infos = new ArrayList<Informacion>();// se crea un Array List

    public boolean crearInformacion(Informacion inf) {//método para crear y validar
        infos=archivo.leer("informacion"); //leemos archivo
        boolean creado = false;

        if (!(this.existeId(inf.getId()))) {//se llama el metodo para validar Id

            if (inf instanceof LineaInvestigacion) {//para determinar a que instancia pertenece, en este caso validamos que pertenezca a LineaInvestigacion

                if (!(((LineaInvestigacion) inf).getNombreInv().equals("") || inf.getId() == 0)) {//para determinar que el nombre no este vacio y la id sea diferente de 0
                    creado = infos.add(inf);// si se cumple todos los condicionales se agrega al arrayList y si se realiza creado se convierte en true

                    archivo.guardar(infos, "informacion");// los array List se guardan en un archivo

                } else {//si el nombre esta vacio o la id es 0 se hace lo siguiente:
                    creado = false;//se almacena false
                    JOptionPane.showMessageDialog(null, "INFORMACION MAL  DIGITADA ", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
                }

            }

            if (inf instanceof Modalidad) {//para determinar a que instancia pertenece, en este caso validamos que pertenezca a Modalidad

                if (!(((Modalidad) inf).getNombreMod().equals("") || inf.getId() == 0)) {//para determinar que el nombre no este vacio y la id sea diferente de 0
                    creado = infos.add(inf);// si se cumple todos los condicionales se agrega al arrayList y si se realiza creado se convierte en true
                    
                    archivo.guardar(infos, "informacion");// los array List se guardan en un archivo
                    
                } else {//si el nombre esta vacio o la id es 0 se hace lo siguiente:
                    creado = false;
                    JOptionPane.showMessageDialog(null, "INFORMACION MAL  DIGITADA ", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
                }

            }

        } else {//la id ya existe o no es mayor a 0
            creado = false;//se almacena false
            JOptionPane.showMessageDialog(null, "       ID YA EXISTENTE O INVALIDA \n"
                    + "PORFAVOR VERIFIQUE LA INFORMACION", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return creado;// se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }//crear Informacion

    public Informacion readInformacion(long id) {//método para leer

        infos=archivo.leer("informacion"); //leemos archivo

        for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList
            if (infos.get(i).getId() == id) {// if para validar que la id que recibimos para leer si exista en el ArrayList

                if (infos.get(i) instanceof LineaInvestigacion) {//si si existe validamos si pertenece a la instancia LineaInvestigacion
                    LineaInvestigacion saveLineaInvestigacion = new LineaInvestigacion();//instanciamos el objeto LineaInvestigacion
                    saveLineaInvestigacion = (LineaInvestigacion) infos.get(i);//obtenemos la informacion requerida y realizamos casting
                    return saveLineaInvestigacion;//retornamos la variable con la informacion requerida
                }//LineaInvestigacion

                if (infos.get(i) instanceof Modalidad) {//si si existe validamos si pertenece a la instancia Modalidad
                    Modalidad saveModalidad = new Modalidad();//instanciamos el objeto Modalidad
                    saveModalidad = (Modalidad) infos.get(i);//obtenemos la informacion requerida y realizamos casting
                    return saveModalidad;//retornamos la variable con la informacion requerida
                }//Modalidad

            }//if

        }//for

        return null;//si no se entra en el for es poque no se pudo recorrer el ArrayList para obtener la informacion o cuando validamos la id no existia en el ArrayList, y en tales casos no retornamos nada
    }//read Informacion

    public boolean updateInformacion(Informacion x) {//metodo para actualizar 
         infos= archivo.leer("informacion"); //leemos archivo

        boolean verificar2 = false;

        for (Informacion busc : infos) {//for para recorrer el ArrayList
            if (busc.getId() == x.getId()) {//Busca si existe alguna id en el ArrayList

                if (busc instanceof LineaInvestigacion) {//si es una LineaInvestigacion va a realizar la siguiente accion
                    LineaInvestigacion nuevaLineaInvestigacion = (LineaInvestigacion) x;//se almacena la nueva linea investigacion
                    ((LineaInvestigacion) busc).setNombreInv(nuevaLineaInvestigacion.getNombreInv());//reemplazamos por la nueva linea
                    archivo.guardar(infos, "informacion");
                    verificar2 = true;//retornamos true como prueba de que el proceso se realizo exitosamente

                }//LineaInvestigacion
                else if (busc instanceof Modalidad) {//si es Modalidad va a realizar la siguiente accion
                    Modalidad nuevaModalidad = (Modalidad) x;//se almacena la nueva Modalidad
                    ((Modalidad) busc).setNombreMod(nuevaModalidad.getNombreMod());//reemplazamos por la nueva modalidad

                    verificar2 = true;//retornamos true como prueba de que el proceso se realizo exitosamente
                   archivo.guardar(infos, "informacion");
                }//Modalidad

            }//cuando validamos la id no existia en el ArrayList 
            else {
                verificar2 = false;//almacenamos en la variable, false como prueba de que no se hizo ningun proceso
            }
        }//for
        return verificar2;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método

    }//actualizar Informacion

    public boolean deleteInformacion(long ced) {//método para eliminar
        infos= archivo.leer("informacion"); //leemos archivo
        for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList
            if (infos.get(i).getId() == ced) {//Busca si existe alguna id en el ArrayList
                infos.remove(i); //elimina la informacion en la posicion [i] del arreglo de infos.
                archivo.guardar(infos, "informacion");
                return true;//retornamos true si el proceso se realiza con exito
            }
        }
        return false;//retornamos false si el proceso no se realizo
    }// eliminar Informacion

    private boolean existeId(long Id) {//metodo para validar la id
         infos=archivo.leer("informacion"); //leemos archivo
        if (Id > 0) {// para validar que id sea mayor a 0
            for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList
                if (infos.get(i).getId() == Id) {// para validar si existe una id igual

                    return true;// en el caso que exista una id igual retorna true
                }
            }

        } else {
            return true;//en el caso que no sea mayor a 0 se retorna true
        }
        return false;//en el caso que haya pasado las verificaciones
    }

    public ArrayList enviarLineaInvestigacion() {//método para enviar Linea de Investigacion
          infos=archivo.leer("informacion"); //leemos archivo
        infos = archivo.leer("informacion");//se leen archivos
        ArrayList<LineaInvestigacion> lineas = new ArrayList<>();//se crea una nueva ArrayList
        for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList

            if (infos.get(i) instanceof LineaInvestigacion) {//si es Linea de Investigacion va a realizar la siguiente accion
                lineas.add((LineaInvestigacion) infos.get(i));//se guardara en la nueva Array List que se creo 

            }

        }//for

        return lineas;//retornaremos lineas que es la variable que almacena la informacion en forma de array List

    }

    public ArrayList enviarModalidad() {//método para enviar Modalidad
         infos= archivo.leer("informacion"); //leemos archivo
        //infos = archivo.leer("informacion");//se leen archivos
        ArrayList<Modalidad> modalidades = new ArrayList<>();//se crea una nueva ArrayList
        for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList

            if (infos.get(i) instanceof Modalidad) {//si es Modalidad va a realizar la siguiente accion
                modalidades.add((Modalidad) infos.get(i));//se guardara en la nueva Array List que se creo 

            }

        }//for

        return modalidades;//retornaremos modalidades que es la variable que almacena la informacion en forma de array List

    }

    public String reporteModalidades() {//método para imprimir Modalidades
        infos=  archivo.leer("informacion"); //leemos archivo
        String reporteP1 = "";//creamos un string

        for (int i = 0; i < infos.size(); i++) {//for para recorrer el ArrayList
            if (infos.get(i) instanceof Modalidad) {//si es Modalidad va a realizar la siguiente accion
                reporteP1 += "Nombre Modalidad: " + infos.get(i).toString() + "\n";// se almacenara en el string creado previamente junto con lo que retorne el método toString()
            }
        }
        return reporteP1;//se retorna el String con la informacion lista para ser insertada o impresa
    }
    
    public int generarId(){
        infos=archivo.leer("informacion"); //leemos archivo
        int a=0;
        a=infos.size()+1;
        a+=1;
        return a;
    }
}
