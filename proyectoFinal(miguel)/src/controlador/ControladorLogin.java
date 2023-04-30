package controlador;

public class ControladorLogin {
public boolean Login(String usuario, String contraseña){//método para validar usuario y contraseña
    if(usuario.equals("Trabajo")){//primero se valida que el usuario sea igual a Trabajo
        if(contraseña.equals("final")){//si asi es luego valida si la contraseña sea igual a final
            return true;//retornamos true como prueba de que paso las pruebas
        }
    }
return false;    //retornamos false como prueba de que no paso las pruebas
}    
}
