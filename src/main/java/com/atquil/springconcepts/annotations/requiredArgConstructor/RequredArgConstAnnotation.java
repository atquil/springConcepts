package com.atquil.springconcepts.annotations.requiredArgConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MyDependencyClass{}
class AutowireConstructor {

    private String name;
    private String age;
    private MyDependencyClass myDependencyClass;

    @Autowired
    public AutowireConstructor(String name, String age, MyDependencyClass myDependencyClass) {
        this.name = name;
        this.age = age;
        this.myDependencyClass = myDependencyClass;
    }
}


@Component
@RequiredArgsConstructor
public class RequredArgConstAnnotation {

    private final String name;
    private final String age;
    private final MyDependencyClass myDependencyClass;


}
