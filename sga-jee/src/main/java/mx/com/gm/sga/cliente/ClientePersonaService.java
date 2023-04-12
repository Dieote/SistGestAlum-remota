package mx.com.gm.sga.cliente;

import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();//de aqui hacemos la llamada JNDI
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            //para conocer este name debemos clean&build sobre esta aplicacion y en la salida nos muestra la ruta
            //y levantamos nuestro servidor glassfish desde services
            
            List<Persona> personas = personaService.listarPersonas();
            //solicitamos listado personas
            for(Persona persona: personas){
                System.out.println(persona);
            }
            
            System.out.println("\nFin llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
           ex.printStackTrace(System.out);
        }
        //para ejecutar esta aplicacion debe estar iniciado y desplegado galssfish
    }
    
}
