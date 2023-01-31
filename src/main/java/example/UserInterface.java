package example;

import org.springframework.stereotype.Component;

@Component
public class UserInterface {
    NotificacionService notificacionService;

    public UserInterface(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }
}
