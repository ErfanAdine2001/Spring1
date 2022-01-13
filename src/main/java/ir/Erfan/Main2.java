package ir.Erfan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService e = app.getBean(UserService.class) ;
        e.sendMessage("hello");
        e.sendEmail("good by");
    }

}
