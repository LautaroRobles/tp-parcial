package parcial.modelo;

import lombok.Getter;
import lombok.Setter;
import parcial.dao.NotificacionDao;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class BandejaNotificaciones {
    private Long id;
    private List<Notificacion> notificaciones;

    public BandejaNotificaciones(){
        this.notificaciones = new ArrayList<>();
    }

    public void crearNotificacion(String titulo, String cuerpo) {
        Notificacion notificacion = new Notificacion();
        notificacion.setTitulo(titulo);
        notificacion.setCuerpo(cuerpo);

        notificaciones.add(notificacion);

        NotificacionDao notificacionDao = new NotificacionDao();
        notificacionDao.saveInto(notificacion, this);
    }

}
