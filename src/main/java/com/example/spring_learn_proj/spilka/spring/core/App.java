package com.example.spring_learn_proj.spilka.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
//       TestInject testInject = annotationConfigApplicationContext.getBean(TestInject.class);
//        System.out.println(testInject);
        Car car = annotationConfigApplicationContext.getBean("simpleCar",Car.class);
        System.out.println(car);
        car.drive();
    }
}
