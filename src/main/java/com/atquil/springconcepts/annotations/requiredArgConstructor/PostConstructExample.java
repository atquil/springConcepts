package com.atquil.springconcepts.annotations.requiredArgConstructor;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
class MyDependencys{
    private String name;
}

@RequiredArgsConstructor
@Component
public class PostConstructExample {
    private final MyDependencys myDependency;


   @PostConstruct
    public void init(){
        System.out.println("Mydepedency bean created");
        myDependency.setName("Initial Data");
    }

}
