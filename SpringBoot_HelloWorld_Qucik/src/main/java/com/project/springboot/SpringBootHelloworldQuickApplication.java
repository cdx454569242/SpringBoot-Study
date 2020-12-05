package com.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations = {"classpath:beans.xml"})
public class SpringBootHelloworldQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloworldQuickApplication.class, args);
    }

}
