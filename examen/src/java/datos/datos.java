
package datos;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "datos")
@RequestScoped
public class datos {
   Solicitud solicitud;

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
   
   
    public datos() {
    }
     public String regresar (){
        return "index";
     }
}
