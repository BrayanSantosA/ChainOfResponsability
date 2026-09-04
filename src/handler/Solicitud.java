package src.handler;

public class Solicitud {
    
    private final String id;
    private final TipoSolicitud tipo;
    private final String descripcion;

    public Solicitud(String id, TipoSolicitud tipo, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return String.format("Solicitud[%s] tipo=%s (%s)", id, tipo, descripcion);
    }
}
