package example;

import org.springframework.stereotype.Component;

@Component
public class NotificacionService {

    public NotificacionService() {
    }

    public void imprimirSaludo(){
        System.out.println("Hola!!!");
    }
}
