package com.atquil.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringConceptsApplication.class, args);

		//Will show all the beans i.e. instance of object which are created for you: Spring framework beans
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


	}

}
