package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo)context.getBean("idSaludo");
        System.out.println(saludo.imprimirSaludo());
        UserInterface user = (UserInterface) context.getBean(UserInterface.class);
        user.notificacionService.imprimirSaludo();
    }
}