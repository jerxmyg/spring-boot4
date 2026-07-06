package com.jerxmyg.springboot4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot4Application.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "hello";
    }

}
