package mx.com.gm.sga.servicio;
//Luego de persona creamos esta interfaz servicio

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

@Remote//Accedemos de manera remota
public interface PersonaServiceRemote {
    
    //metodos
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona); //agrega
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
//luego generamos la implementacion de essta interfaz