
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Proyecto implements Serializable{
 
private long id;
private String nombreProyecto;
private String objetivoGeneral;
private String objetivoEspecifico;
private Modalidad modalidad;
private LineaInvestigacion linea;
private ArrayList <Profesor> profesores;
private ArrayList<Estudiante> estudiantes;
private double nota;

    public Proyecto() {
        this.profesores=null;
        this.estudiantes=null;
    }

    public Proyecto(long id, String nombreProyecto, String objetivoGeneral, String objetivoEspecifico, Modalidad modalidad, LineaInvestigacion linea, ArrayList<Profesor> profesores, ArrayList<Estudiante> estudiantes, double nota) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivoEspecifico = objetivoEspecifico;
        this.modalidad = modalidad;
        this.linea = linea;
        this.profesores = profesores;
        this.estudiantes = estudiantes;
        this.nota = nota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public String getObjetivoEspecifico() {
        return objetivoEspecifico;
    }

    public void setObjetivoEspecifico(String objetivoEspecifico) {
        this.objetivoEspecifico = objetivoEspecifico;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public LineaInvestigacion getLinea() {
        return linea;
    }

    public void setLinea(LineaInvestigacion linea) {
        this.linea = linea;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
public boolean añadirProfesor(Profesor nuevo){
    boolean añadido=false;
    for (int i = 0; i < profesores.size(); i++) {
       if(!(profesores.get(i)==nuevo)){
           profesores.add(nuevo);
           añadido=true;
       }
       else{
        añadido=false;
    }
    }
 return añadido; 
}
   
public boolean añadirEstudiante(Estudiante nuevo){
    boolean añadido=false;
    for (int i = 0; i < estudiantes.size(); i++) {
       if(!(estudiantes.get(i)==nuevo)){
           estudiantes.add(nuevo);
           añadido=true;
       }
       else{
        añadido=false;
    }
    }
 return añadido; 
}

    
  public String mostrarProfesores(){
      String nombres1="";
      
      for (int i = 0; i < profesores.size(); i++) {
         nombres1+="CC. "+profesores.get(i).getCedula()+" "+profesores.get(i).getNombre()+" "+profesores.get(i).getApellidos()+"\n";
      }
      
      return nombres1;
  }
   
  
  public String mostrarEstudiantes(){
      String nombres2="";
      
      for (int i = 0; i < estudiantes.size(); i++) {
         nombres2+="CC. "+estudiantes.get(i).getCedula()+" "+estudiantes.get(i).getNombre()+"\n";
      }
      
      return nombres2;
  }

    
    
  
    



    
}
