package src.concreteHandler;

import src.handler.Aprobador;
import src.handler.TipoSolicitud;

public class Coordinador extends Aprobador {

    public Coordinador() {
        super("Coordinador");
    }

     @Override
    protected boolean puedeManejar(TipoSolicitud tipo) {
        return tipo == TipoSolicitud.RECLAMO_ACADEMICO;
    }
    
}
