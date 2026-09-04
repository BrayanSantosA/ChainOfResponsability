package src.concreteHandler;
import src.handler.Aprobador;
import src.handler.TipoSolicitud;

public class Profesor extends Aprobador {

    public Profesor() {
        super("Profesor");
    }

     @Override
    protected boolean puedeManejar(TipoSolicitud tipo) {
        return tipo == TipoSolicitud.CAMBIO_HORARIO
                || tipo == TipoSolicitud.HOMOLOGACION_NOTA;
    }
    
}
