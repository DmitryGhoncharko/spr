package com.example.spring_learn_proj.spilka.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Some name");
        return parrot;
    }
}
