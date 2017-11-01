
package datos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ingrid Rivera
 */
@Named(value = "administradorSolicitudes")
@SessionScoped
public class AdministradorSolicitudes implements Serializable {

   ArrayList<Solicitud> lista;
   
   public AdministradorSolicitudes() {
        lista=new ArrayList<>();
    }
    
    public ArrayList<Solicitud> getLista () {
        return lista;
    }
    
    public void agregar (String cli, String cas, String fec){
        Solicitud e=new Solicitud ();
        e.setCliente (cli);
        e.setDetCaso(cas);
        e.setFecha (fec);
        lista.add (e);
    }
}
