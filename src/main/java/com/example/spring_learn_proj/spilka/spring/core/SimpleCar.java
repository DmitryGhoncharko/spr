package com.example.spring_learn_proj.spilka.spring.core;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier(value = "simpleCar1")
public class SimpleCar implements Car{
    @Override
    public void drive() {
        System.out.println("simple car");
    }
}
