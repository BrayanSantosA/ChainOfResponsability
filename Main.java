import java.util.ArrayList;
import java.util.List;

import src.concreteHandler.Monitor;
import src.concreteHandler.Profesor;
import src.concreteHandler.Coordinador;
import src.concreteHandler.Secretaria;
import src.concreteHandler.Decanatura;

import src.handler.Aprobador;
import src.handler.TipoSolicitud;
import src.handler.Solicitud;
public class Main {

    public static void main(String[] args) {


        Aprobador monitor = new Monitor();
        Aprobador profesor = new Profesor();
        Aprobador coordinador = new Coordinador();
        Aprobador secretaria = new Secretaria();
        Aprobador decanatura = new Decanatura();

        monitor.setSiguiente(profesor);
        profesor.setSiguiente(coordinador);
        coordinador.setSiguiente(secretaria);
        secretaria.setSiguiente(decanatura);


        List<Solicitud> solicitudes = new ArrayList<>();
        solicitudes.add(new Solicitud("S1", TipoSolicitud.PERMISO_INASISTENCIA,
                "Falta a clase por cita médica"));
        solicitudes.add(new Solicitud("S2", TipoSolicitud.CAMBIO_HORARIO,
                "Cambio de horario de laboratorio"));
        solicitudes.add(new Solicitud("S3", TipoSolicitud.HOMOLOGACION_NOTA,
                "Homologación de nota de un corte"));
        solicitudes.add(new Solicitud("S4", TipoSolicitud.RECLAMO_ACADEMICO,
                "Reclamo por nota final"));
        solicitudes.add(new Solicitud("S5", TipoSolicitud.CERTIFICADO_ESTUDIO,
                "Certificado para trámite de EPS"));
        solicitudes.add(new Solicitud("S6", TipoSolicitud.BECA_ESPECIAL,
                "Solicitud de beca por mérito académico"));
        solicitudes.add(new Solicitud("S7", TipoSolicitud.EXPULSION_DISCIPLINARIA,
                "Solicitud de expulsión por falta grave"));


        for (Solicitud solicitud : solicitudes) {
            System.out.println("Procesando " + solicitud + ":");
            monitor.procesarSolicitud(solicitud);
            System.out.println();
        }
    }
}