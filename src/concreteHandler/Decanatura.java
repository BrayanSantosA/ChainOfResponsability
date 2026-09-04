package src.concreteHandler;
import src.handler.Aprobador;
import src.handler.TipoSolicitud;

public class Decanatura extends Aprobador {
      public Decanatura() {
        super("Decanatura");
    }

    @Override
    protected boolean puedeManejar(TipoSolicitud tipo) {
        return tipo == TipoSolicitud.BECA_ESPECIAL;
    }
}
