package com.example.spring_learn_proj.spilka.spring.core;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NotSimpleCar implements Car{
    @Override
    public void drive() {
        System.out.println("not simple car");
    }
}
