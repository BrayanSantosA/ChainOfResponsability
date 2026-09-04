package src.handler;

public abstract class Aprobador {

    protected String nombreCargo;
    protected Aprobador siguiente;

    public Aprobador(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }


    public void procesarSolicitud(Solicitud solicitud) {
        System.out.println("  -> Pasa por: " + nombreCargo);

        if (puedeManejar(solicitud.getTipo())) {
            System.out.println("     [OK] Resuelta por " + nombreCargo
                    + " (" + solicitud.getId() + ")");
            return;
        }

        if (siguiente != null) {
            siguiente.procesarSolicitud(solicitud);
        } else {
            System.out.println("     [SIN RESOLVER] Ningún responsable pudo atender "
                    + solicitud.getId());
        }
    }


    protected abstract boolean puedeManejar(TipoSolicitud tipo);
}
