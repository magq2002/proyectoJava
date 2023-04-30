package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class ControladorPersona {

    Archivo archivo = new Archivo();

    static ArrayList<Persona> personas = new ArrayList<Persona>();//se crea un Array List

    public boolean createPersona(Persona persona) {//método para crear y validar
        personas = archivo.leer("personas");
        boolean creado = false;

        if (!(this.verificarCedula(persona.getCedula()))) {//se llama el metodo para validar cedula

            if (persona instanceof Profesor) {//para determinar a que instancia pertenece, en este caso validamos que pertenezca a Profesor

                if (!(persona.getCedula() == 0 || persona.getFechaNacimiento().getYear() == 0)) {//para determinar que la cedula no este vacia y el año de nacimiento tampoco
                    creado = personas.add(persona);// si se cumple todos los condicionales se agrega al arrayList y si se realiza creado se convierte en true
                    archivo.guardar(personas, "personas");// los array List se guardan en un archivo

                } else {//si la cedula es igual a 0 o el año de nacimiento es 0 se hace lo siguiente:
                    creado = false;//se almacena false
                    JOptionPane.showMessageDialog(null, "INFORMACION MAL  DIGITADA ", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
                }

            }

            if (persona instanceof Estudiante) {//para determinar a que instancia pertenece, en este caso validamos que pertenezca a Estudiante

                if (!(persona.getCedula() == 0 || persona.getFechaNacimiento().getYear() == 0 || ((Estudiante) persona).getCelular() == 0)) {//para determinar que la cedula, el año de nacimiento y el celular no esten vacias
                    creado = personas.add(persona);// si se cumple todos los condicionales se agrega al arrayList y si se realiza creado se convierte en true
                    archivo.guardar(personas, "personas");// los array List se guardan en un archivo

                } else {//si la cedula, año de nacimiento o celular es igual a 0 
                    creado = false;//se almacena false
                    JOptionPane.showMessageDialog(null, "INFORMACION MAL  DIGITADA ", "ERROR", JOptionPane.ERROR_MESSAGE);//se le dice al usuario que esta mal digitada la información
                }

            }

        } else {//la cedula ya existe o no paso las pruebas
            creado = false;//se almacena false
            JOptionPane.showMessageDialog(null, "       CEDULA YA EXISTENTE \n"
                    + "PORFAVOR VERIFIQUE LA INFORMACION", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return creado;// se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }//crearPersona

    public Persona readPersona(long ced) {//método para leer
        personas = archivo.leer("personas");//leemos archivo

        for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList
            if (personas.get(i).getCedula() == ced) {// if para validar que la cedula que recibimos para leer si exista en el ArrayList

                if (personas.get(i) instanceof Profesor) {//si si existe validamos si pertenece a la instancia Profesor
                    Profesor saveProfesor = new Profesor();//instanciamos el objeto Profesor
                    saveProfesor = (Profesor) personas.get(i);//obtenemos la informacion requerida y realizamos casting
                    return saveProfesor;//retornamos la variable con la informacion requerida
                }//profesor

                if (personas.get(i) instanceof Estudiante) {//si si existe validamos si pertenece a la instancia Estudiante
                    Estudiante saveEstudiante = new Estudiante();//instanciamos el objeto Estudiante
                    saveEstudiante = (Estudiante) personas.get(i);//obtenemos la informacion requerida y realizamos casting
                    return saveEstudiante;//retornamos la variable con la informacion requerida
                }//estudiante

            }//if

        }//for

        return null;//si no se entra en el for es poque no se pudo recorrer el ArrayList para obtener la informacion o cuando validamos la id no existia en el ArrayList, y en tales casos no retornamos nada
    }//read persona

    public boolean updatePersona(Persona x) {//metodo para actualizar 
        personas = archivo.leer("personas");//se leen archivos

        boolean verificar2 = false;

        for (Persona persona : personas) {//for para recorrer el ArrayList
            if (persona.getCedula() == x.getCedula()) {//compara que la cedula del  objeto x sea igual  a alguna que tenga el ArrayList

                if (persona instanceof Profesor) {//si es Profesor va a realizar la siguiente accion
                    Profesor nuevoProfe = (Profesor) x;//se almacena el nuevo profesor
                    persona.setNombre(nuevoProfe.getNombre());//reemplazamos por el nombre del nuevo profesor
                    ((Profesor) persona).setApellidos(nuevoProfe.getApellidos());//reemplazamos por el apellido del nuevo profesor 
                    persona.setEmail(nuevoProfe.getEmail());//reemplazamos por el correo del nuevo profesor 
                    persona.setFechaNacimiento(LocalDate.of(nuevoProfe.getFechaNacimiento().getYear(), nuevoProfe.getFechaNacimiento().getMonthValue(), nuevoProfe.getFechaNacimiento().getDayOfMonth()));//reemplazamos por la fecha de nacimiento del nuevo profesor
                    archivo.guardar(personas, "personas");
                    verificar2 = true;//retornamos true como prueba de que el proceso se realizo exitosamente

                }//PROFESOR
                else if (persona instanceof Estudiante) {//si es Estudiante va a realizar la siguiente accion

                    Estudiante nuevoEstud = (Estudiante) x;//se almacena el nuevo estudiante
                    persona.setNombre(nuevoEstud.getNombre());//reemplazamos por el nombre del nuevo estudiante
                    ((Estudiante) persona).setCelular(nuevoEstud.getCelular());//reemplazamos por el celular del nuevo estudiante 
                    persona.setEmail(nuevoEstud.getEmail());//reemplazamos por el correo del nuevo estudiante
                    persona.setFechaNacimiento(LocalDate.of(nuevoEstud.getFechaNacimiento().getYear(), nuevoEstud.getFechaNacimiento().getMonthValue(), nuevoEstud.getFechaNacimiento().getDayOfMonth()));//reemplazamos por la fecha de nacimiento del nuevo estudiante
                    archivo.guardar(personas, "personas");
                    verificar2 = true;//retornamos true como prueba de que el proceso se realizo exitosamente

                }//Estudiante

            } else {
                verificar2 = false;//almacenamos en la variable, false como prueba de que no se hizo ningun proceso
            }
        }//for
        return verificar2;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método

    }//actualizar persona

    public boolean deletePersona(long ced) {//método para eliminar
        personas = archivo.leer("personas");//se leen archivos

        boolean verificar3 = false;

        for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList

            if (personas.get(i).getCedula() == ced) {//Busca si existe alguna cedula en el ArrayList
                personas.remove(i);//elimina la informacion en la posicion [i] del arreglo
                verificar3 = true;//almacenamos true si el proceso se realiza con exito
                archivo.guardar(personas, "personas");
            } else {
                verificar3 = false;//almacenamos false si el proceso no se realizo
            }

        }

        return verificar3;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }// eliminar Informacion

    public boolean verificarCedula(long ced) {//metodo para verificar la cedula
        personas = archivo.leer("personas");//se leen archivos
        boolean verificar = false;
        for (int i = 0; i < personas.size(); i++) {//for para recorrer el ArrayList

            if (personas.get(i).getCedula() == ced) {// para validar si existe una cedula igual
                verificar = true;// en el caso que exista una cedula igual retorna true
            }//if 
            else {
                verificar = false;//en el caso que no exista una cedula igual retorna false
            }//else

        }//for

        return verificar;//se retorna false o true, dependiendo de lo que haya pasado internamente en el método
    }//verificar cedula

    public String enviarProfesores() {//método para enviar Profesores
        personas = archivo.leer("personas");//se leen archivos

        String profesores = "";//se crea un String

        for (Persona persona : personas) {//for para recorrer el ArrayList

            if (persona instanceof Profesor) {//si es Profesor va a realizar la siguiente accion

                profesores += "CC. " + (persona.getCedula() + "   " + persona.getNombre() + " " + ((Profesor) persona).getApellidos()).toUpperCase() + "\n";// se almacenara en el string creado previamente              

            }//PROFESOR

        }//for

        return profesores;//se retorna el String con la informacion lista para ser insertada o impresa

    }

    public String enviarEstudiantes() {//método para enviar Estudiantes
        personas = archivo.leer("personas");//se leen archivos

        String estudiantes = "";//se crea un String

        for (Persona persona : personas) {//for para recorrer el ArrayList

            if (persona instanceof Estudiante) {//si es Profesor va a realizar la siguiente accion

                estudiantes += "CC. " + (persona.getCedula() + "   " + persona.getNombre()).toUpperCase() + "\n";// se almacenara en el string creado previamente 

            }//Estudiante

        }//for

        return estudiantes;//se retorna el String con la informacion lista para ser insertada o impresa

    }

    public int edadProfesor(LocalDate x) {//método para calcular edad recibiendo una fecha de nacimiento

        int edad = 0;//se crea una variable
        edad = 2021 - x.getYear();//se resta con el año actual(fecha en que se finalizo el programa)
        if (edad == 35) {//se valida si la edad fue igual a 35
            if (x.getMonthValue() <= 6) {//se valida que el mes sea junio o menor a este
                if (x.getDayOfMonth() <= 10) {//se valida que el dia sea 10 o menor 
                    return edad;//retornamos 35
                } else {
                    return edad - 1;//si no paso el if es porque cumple 35 este mes pero aun no llega el dia (segun fecha en que se finalizo el programa)
                }
            } else {
                return edad - 1;//si no paso el if es porque cumple 35 este año pero aun no llega el mes (segun fecha en que se finalizo el programa)
            }
        }
        return edad;//retornamos edad
    }

    public String ReporteP1() {//método para imprimir 
        personas = archivo.leer("personas");//se leen archivos
        String reporteP1 = "";//se crea un String

        for (Persona persona : personas) {//for para recorrer el ArrayList
            if (persona instanceof Profesor) {//Se valida que se trate de un profesor
                if (edadProfesor(persona.getFechaNacimiento()) >= 35) {//Se valida que tenga 35 o sea mayor a este
                    if (!(((Profesor) persona).getApellidos().substring(0).contains("w") || ((Profesor) persona).getApellidos().substring(0).contains("z")
                            || ((Profesor) persona).getApellidos().substring(0).contains("W") || ((Profesor) persona).getApellidos().substring(0).contains("Z"))) {
                        reporteP1 += "" + persona.toString() + edadProfesor(persona.getFechaNacimiento()) + "\n";//se almacena en el string creado previamente     
                    }
                }
            }
        }
        return reporteP1;//se retorna el String con la informacion lista para ser insertada o impresa
    }

}//clase controlador

