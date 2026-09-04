package src.concreteHandler;
import src.handler.Aprobador;
import src.handler.TipoSolicitud;

public class Secretaria extends Aprobador {

    public Secretaria() {
        super("Secretaria");
    }

    @Override
    protected boolean puedeManejar(TipoSolicitud tipo) {
        return tipo == TipoSolicitud.CERTIFICADO_ESTUDIO;
    }
}
