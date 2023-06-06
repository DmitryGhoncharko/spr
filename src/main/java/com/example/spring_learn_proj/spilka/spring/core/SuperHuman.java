package com.example.spring_learn_proj.spilka.spring.core;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class SuperHuman extends Human{

}
