package se.iths.stefan.ovningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.iths.stefan.ovningspringboot.controller.ProductController;

@SpringBootApplication
public class OvningSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OvningSpringBootApplication.class, args);
    }

}
