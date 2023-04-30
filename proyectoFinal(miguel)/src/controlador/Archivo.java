
package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.lang.ClassNotFoundException;

public class Archivo implements Serializable{
    
File archivo;
ObjectOutputStream oos;
ArrayList estructura=null;

public void guardar(ArrayList estructura,String nombreArchivo){
  
    archivo=new File(nombreArchivo);//ponerle el  nombre al  archivo 
    
    //Guardar datos en el artchivo  
    
    try{
        oos=new ObjectOutputStream(new FileOutputStream(archivo));
        this.oos.writeObject(estructura);//guarda el  array  en el archivo 
        this.oos.close();//cierra y  guarda el  archivo 
    }catch(IOException e){
        
    }//catch
}//metodo  guardar 
    
public ArrayList leer(String nombreArchivo){
    
ObjectInputStream ois;

archivo=new File(nombreArchivo);

//extraer Datos desde archivo 
try{
    ois=new ObjectInputStream(new FileInputStream(archivo));
    
    estructura= (ArrayList) ois.readObject();//convierte el  archivo  en ArrayList  (cast)
}
catch(IOException | ClassNotFoundException e){
    
}
return estructura;
}


}//clase archivo 
