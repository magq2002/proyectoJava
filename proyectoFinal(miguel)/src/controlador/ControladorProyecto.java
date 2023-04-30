package controlador;

import static controlador.ControladorInformacion.infos;
import static controlador.ControladorPersona.personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.LineaInvestigacion;
import modelo.Modalidad;
import modelo.Profesor;
import modelo.Proyecto;

public class ControladorProyecto {

    Archivo archivo = new Archivo();

    static ArrayList<Proyecto> proyectos = new ArrayList<>();// se crea un Array List

    public boolean createProyecto(Proyecto proyect) {//método para crear y validar
       proyectos = archivo.leer("proyectos");
        boolean creado = false;

        if (!(this.verificarId(proyect.getId()))) {//se llama el metodo para validar Id

            if (!(proyect.getId() == 0 )) {//se valida qie id y nota sea diferente de cero
                proyectos.add(proyect);//si pasa las condicionales se añade al ArrayList
                archivo.guardar(proyectos, "proyectos");
                creado = true;//si esto pasa almacenamos true como prueba

            } else {//si no paso el anterior if significa que la informacion esta mal digitada
                creado = false;//almacenamos false como prueba 
                JOptionPane.showMessageDialog(null, "INFORMACION MAL  DIGITADA", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
            }

        } else {//si no paso el anterior if significa que la id ya existe o no es valida
            creado = false;//almacenamos false como prueba 
            JOptionPane.showMessageDialog(null, "       ID YA EXISTENTE O NO VÁLIDA\n"
                    + "PORFAVOR VERIFIQUE LA INFORMACION", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
        }

        return creado;// se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }//crearProyecto

    public Proyecto readProyecto(long id) {//método para leer
        proyectos = archivo.leer("proyectos");
        Proyecto nuevo = null;

        for (int i = 0; i < proyectos.size(); i++) {//for para recorrer el ArrayList
            if (proyectos.get(i).getId() == id) {// if para validar que la id que recibimos para leer si exista en el ArrayList

                nuevo = proyectos.get(i);//almacena la informacion de proyecto en la variable

                return nuevo;//retorna variable 
            }

        }//for

        return null;//si no se entra en el for es poque no se pudo recorrer el ArrayList para obtener la informacion o cuando validamos la id no existia en el ArrayList, y en tales casos no retornamos nada
    }//read persona

    public boolean updateProyecto(Proyecto e) {//metodo para actualizar 
        proyectos = archivo.leer("proyectos");
        boolean verificar = false;

        for (Proyecto proyecto : proyectos) {//for para recorrer el ArrayList
            if (proyecto.getId() == e.getId()) {//compara que la id del  objeto e sea igual  a alguna que tenga el ArrayList

                Proyecto nuevoP = e;//se almacena el nuevo Proyecto
                proyecto.setNombreProyecto(nuevoP.getNombreProyecto());//reemplazamos por el nuevo nombre del Proyecto 
                proyecto.setObjetivoGeneral(nuevoP.getObjetivoEspecifico());//reemplazamos por el nuevo objetivo del Proyecto 
                proyecto.setObjetivoEspecifico(nuevoP.getObjetivoEspecifico());//reemplazamos por el nuevo objetivo del Proyecto 
                proyecto.setLinea(nuevoP.getLinea());//reemplazamos por la nueva linea del Proyecto 
                proyecto.setModalidad(nuevoP.getModalidad());//reemplazamos por la nueva modalidad del Proyecto 
                proyecto.setNota(nuevoP.getNota());//reemplazamos por la nueva nota del Proyecto 
                verificar = true;//retornamos true como prueba de que el proceso se realizo exitosamente
                archivo.guardar(proyectos, "proyectos");

            } else {
                verificar = false;//almacenamos en la variable, false como prueba de que no se hizo ningun proceso
            }
        }//for
        return verificar;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método

    }

    public boolean deleteProyecto(long id) {//método para eliminar
       proyectos = archivo.leer("proyectos");
        boolean verificar3 = false;

        for (int i = 0; i < proyectos.size(); i++) {//for para recorrer el ArrayList

            if (proyectos.get(i).getId() == id) {//Busca si existe alguna id en el ArrayList
                proyectos.remove(i);//elimina la informacion en la posicion [i] del arreglo de infs.
                verificar3 = true;//almacenamos true si el proceso se realiza con exito
             archivo.guardar(proyectos, "proyectos");
            } else {
                verificar3 = false;//almacenamos false si el proceso no se realizo
            }

        }

        return verificar3;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }

    private boolean verificarId(long Id) {//metodo para verificar la id
        proyectos=archivo.leer("proyectos");
        if (Id > 0) {// para validar que id sea mayor a 0
            for (int i = 0; i < proyectos.size(); i++) {//for para recorrer el ArrayList
                if (proyectos.get(i).getId() == Id) {// para validar si existe una id igual
                    return true;// en el caso que exista una id igual retorna true
                }
            }

        } else {
            return true;////en el caso que no sea mayor a 0 se retorna true
        }
        return false;//en el caso que haya pasado las verificaciones
    }

    public ArrayList enviarProyectos() {//método para enviar proyecto
        proyectos=archivo.leer("proyectos");

        ArrayList<Proyecto> pys = null;//se crea una nueva ArrayList
        pys = proyectos;//se almacena el array list en la nueva array list creada 

        return pys;//se retorna el arrayList

    }

    public boolean desvincularEstudiante(Proyecto x, long ced) {//método para desvincular estudiante
        proyectos=archivo.leer("proyectos");
        for (Proyecto proyecto : proyectos) {//for para recorrer el ArrayList
            if (proyecto.getId() == x.getId()) {//if para encontrar el proyecto con la id
                for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList
                    if (personas.get(i).getCedula() == ced) {//if para encontrar la persona con la cedula
                        proyecto.getEstudiantes().remove(i);//elimina la informacion en la posicion [i] del arreglo
                        archivo.guardar(proyectos, "proyectos");
                        return true;//retorna verdadero si el proceso se realizo
                    }
                }
            }
        }
        return false;//retorna falso si el proceso no se realizo
    }

    public boolean desvincularProfesor(Proyecto x, long ced) {//método para desvincular profesor
         proyectos=archivo.leer("proyectos");
        for (Proyecto proyecto : proyectos) {//for para recorrer el ArrayList
            if (proyecto.getId() == x.getId()) {//if para encontrar el proyecto con la id
                for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList
                    if (personas.get(i).getCedula() == ced) {//if para encontrar la persona con la cedula
                        proyecto.getProfesores().remove(i);//elimina la informacion en la posicion [i] del arreglo
                        archivo.guardar(proyectos, "proyectos");
                        return true;//retorna verdadero si el proceso se realizo
                    }
                }
            }
        }
        return false;//retorna falso si el proceso no se realizo
    }

    public boolean vincularEstudiante(Proyecto x, long ced, Estudiante e) {//método para vincular estudiante
         proyectos=archivo.leer("proyectos");
        for (Proyecto proyecto : proyectos) {//for para recorrer el ArrayList
            if (proyecto.getId() == x.getId()) {//if para encontrar el proyecto con la id
                for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList
                    if (personas.get(i).getCedula() == ced) {//if para encontrar la persona con la cedula
                        proyecto.getEstudiantes().add(e);//añade la nueva informacion
                        archivo.guardar(proyectos, "proyectos");
                        return true;//retorna verdadero si el proceso se realizo
                    }
                }
            }
        }
        return false;//retorna falso si el proceso no se realizo
    }

    public boolean vincularProfesor(Proyecto x, long ced, Profesor e) {//método para vincular profesor
         proyectos=archivo.leer("proyectos");
        for (Proyecto proyecto : proyectos) {//for para recorrer el ArrayList
            if (proyecto.getId() == x.getId()) {//if para encontrar el proyecto con la id
                for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList
                    if (personas.get(i).getCedula() == ced) {//if para encontrar la persona con la cedula
                        proyecto.getProfesores().add(e);//añade la nueva informacion
                        archivo.guardar(proyectos, "proyectos");
                        return true;//retorna verdadero si el proceso se realizo
                    }
                }
            }
        }
        return false;//retorna falso si el proceso no se realizo
    }

    public String reporteN3() {//método para imprimir
       proyectos=archivo.leer("proyectos");
        String reporteP1 = "";//se crea un String

        for (int i = 0; i < proyectos.size(); i++) {//for para recorrer el ArrayList
            if (proyectos.get(i).getNota() <= 3) {//if para solo permitir proyectos que tengan una nota por debajo de 3
                reporteP1 += "Nombre Proyecto: " + proyectos.get(i).getNombreProyecto() + " Nota: " + proyectos.get(i).getNota() + "\n";// se almacenara en el string creado previamente

            }
        }
        return reporteP1;//se retorna el String con la informacion lista para ser insertada o impresa
    }

    public String reportes() {//método para imprimir
        proyectos=archivo.leer("proyectos");
        String reporteP1 = "";//se crea un String
        for (int i = 0; i < proyectos.size(); i++) {//for para recorrer el ArrayList
            reporteP1 += "Nombre Proyecto: " + proyectos.get(i).getNombreProyecto() + " Profesores: " + proyectos.get(i).mostrarProfesores() + " Estudiantes " + proyectos.get(i).mostrarEstudiantes() + "\n\n";  // se almacenara en el string creado previamente
        }
        return reporteP1;//se retorna el String con la informacion lista para ser insertada o impresa
    }

    public int generarId(){
  proyectos=archivo.leer("proyectos");
        int a=0;
        a=proyectos.size()+1;
        a+=1;
        return a;
    }

    @Override
    public String toString() {
        proyectos=archivo.leer("proyectos");
        String proyectosRegistrados = "";//crea una varible tipo string
        for (int i = 0; i < proyectos.size(); i++) {//recorre todos los proyectos

            proyectosRegistrados += "ID DEL PROYECTO:  " + proyectos.get(i).getId() + " " + proyectos.get(i).getNombreProyecto() + "\n";//guarda en la varible la lista de todos los proyectos

        }
        return proyectosRegistrados;//retorna el  string a la vista acta para tener la cosntancia de todos los proyectos registrados en  el  sistema.
    }

}
