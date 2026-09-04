package src.concreteHandler;
import src.handler.Aprobador;
import src.handler.TipoSolicitud;

public class Monitor extends Aprobador {

   public Monitor() {
        super("Monitor");
    }

    @Override
    protected boolean puedeManejar(TipoSolicitud tipo) {
        return tipo == TipoSolicitud.PERMISO_INASISTENCIA;
    }
    
}
