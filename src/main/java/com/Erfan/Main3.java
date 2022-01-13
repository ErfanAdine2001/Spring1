package com.Erfan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

        User u = app.getBean(User.class);
        u.sendEmail("hello erfan is this you eamil adress ?if yes send yes for me ");
        u.sendSms("--------------------------------------------------");
        u.sendSms("hello ");

    }
}
