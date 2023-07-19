package com.atquil.springconcepts.springExpressionLanguage;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringExpressionLanguage {

    @Value("#{2+2}")
    private int addition;

    //Conditional Operation
    @Value("#{2>33 ? true:false}")
    private boolean conditional;


    @Value("#{T(Math).sqrt(4)}") //public static double sqrt(double a)
    private int staticMethod;


    private MySpringExpressionStaticClass mySpringExpressionStaticClass;

    @Value("#{mySpringExpressionStaticClass.name}")
    private String customStaticValue;

    @Value("#{mySpringExpressionStaticClass.someCustomMethod('atquil')}")
    private String customStaticMethod;

    @PostConstruct
    void init(){
        System.out.println("--------------Spring Expression Language------------");
        System.out.println("Addition of 2+2 : "+addition);
        System.out.println("Conditional Operation : "+conditional);
        System.out.println("Accessing Static value : "+staticMethod);
        System.out.println("Accessing Static value : "+customStaticValue);
        System.out.println("Accessing Static value : "+customStaticMethod);

        System.out.println("-------------- End ------------");
    }
}

@Component
class MySpringExpressionStaticClass{

    //Use static variable
    public static String name = "SpEL";

    public static String someCustomMethod(String inputString){
        return "Your input : "+inputString;
    }
}