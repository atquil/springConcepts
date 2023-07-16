package com.atquil.springconcepts.annotations.value;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {

    @Value("Direct Filed value")
    private String directInjectionOfValue;

    @Value("${value.from.properties}") //Look inside application.properties file
    private String valueFromProperties;


    @PostConstruct
    public void init(){

        System.out.println("======After Constructor formation values===== ");
        System.out.println("directInjectionOfValue "+directInjectionOfValue);
        System.out.println("valueFromProperties "+valueFromProperties);
    }

}
