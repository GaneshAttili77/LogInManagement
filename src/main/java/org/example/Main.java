package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
@EnableScheduling
@MapperScan({"org.example"})
@ComponentScan(basePackages = "controller.login")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
       ApplicationContext context =  SpringApplication.run(Main.class, args);

    }
}