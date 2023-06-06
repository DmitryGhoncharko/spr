package com.example.spring_learn_proj.spilka.spring.core;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class TestInject {
//    @Autowired
//    private final SuperHuman human;

    private final Car car;
    @Autowired
    public TestInject(@Qualifier(value = "simpleCar1") Car car) {
        this.car = car;
    }
}
