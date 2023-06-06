package com.example.spring_learn_proj.spilka.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.example.spring_learn_proj.spilka.spring.core*")
@EnableAspectJAutoProxy
public class Config {

//    @Bean
//    @Primary
//    Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("Some name");
//        return parrot;
//    }
//    @Bean
//    Human human(){
//        return new Human("name",23);
//    }
//    @Bean
//    TestInject testInject(){
//        return new TestInject(human());
//    }
}
