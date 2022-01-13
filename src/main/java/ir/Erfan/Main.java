package ir.Erfan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
//        Employee e = app.getBean(Employee.class);
//        e.showMessagte();
        User u = app.getBean(User.class);
        u.setFirstName("erfan");
        u.setLastName("adine");
        u.setUsername("ljihowhoiwe");
        u.showDatabases();

        User uu = app.getBean(User.class);
        uu.showDatabases();
    }

//TODO Erfan_Adine_final_projecgt
}
