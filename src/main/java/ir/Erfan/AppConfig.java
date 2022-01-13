package ir.Erfan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("ir.Erfan")
public class AppConfig {

    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setMessage("hello erfan");
        return employee;
    }

}
