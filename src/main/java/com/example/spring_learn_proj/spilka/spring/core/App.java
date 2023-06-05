package com.example.spring_learn_proj.spilka.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Parrot parrot = annotationConfigApplicationContext.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
