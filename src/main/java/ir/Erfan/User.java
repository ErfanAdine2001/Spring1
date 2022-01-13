package ir.Erfan;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(value = "prototype")
public class User {
    String firstName ;
    String lastName;
    String username;

    @PostConstruct
    public void init(){
        System.out.println("hello welocme to spring");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(" destroy  -------- good by ");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }

    public User(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }
    public void showDatabases(){
        System.out.println( username +" => " +firstName +" "+lastName );
    }
}
