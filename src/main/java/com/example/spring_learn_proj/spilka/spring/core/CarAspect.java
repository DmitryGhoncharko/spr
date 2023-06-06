package com.example.spring_learn_proj.spilka.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Slf4j
@Order(0)
@Component
public class CarAspect {
    @Around("@annotation(LogTo)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("info");
        return "logged";
    }
}
