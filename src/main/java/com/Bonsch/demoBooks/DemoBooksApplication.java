package com.Bonsch.demoBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.BoschdemoBooks.controller.BookController;

@SpringBootApplication
@ComponentScan(basePackageClasses = BookController.class)
public class DemoBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBooksApplication.class, args);
    }
}
