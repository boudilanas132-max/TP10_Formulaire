package ma.fstg.security.spring_security_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ma.fstg.security")
public class SpringSecurityDemoApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplicationTests.class, args);
    }
}