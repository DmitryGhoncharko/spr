package com.example.spring_learn_proj.spilka.spring.core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ToString
@Scope("prototype")
public class Human {
    @Value("some name")
    private String name;
    @Value("232")
    private int age;
    @PostConstruct
    private void post(){
        System.out.println("Human was created");
    }
    @PreDestroy
    private void dest(){
        System.out.println("Human was deleted");
    }
}
