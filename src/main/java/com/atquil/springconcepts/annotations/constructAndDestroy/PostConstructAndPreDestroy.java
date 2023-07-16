package com.atquil.springconcepts.annotations.constructAndDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("custom")
@RequiredArgsConstructor
public class PostConstructAndPreDestroy {
    private String inputString;

    public void mySimpleMethod(String input) {
        this.inputString = input;
        System.out.println("Currently:"+inputString);

    }

    @PostConstruct
    public void init(){
        System.out.println("Inside @PostConstruct");
        mySimpleMethod("Initialization");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("Inside @PreDestroy");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        System.out.println("Destroying bean:"+ Arrays.stream(applicationContext.getBeanDefinitionNames()).filter(bean->bean.equals("custom")));
        mySimpleMethod("---Destroyed---");
    }
}
