package com.atquil.springconcepts.annotations.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AutowireTypes {

}

@Component
class MyDependency {
}

//Field Injection : Not recommended
@Component
class AutowireField {
    @Autowired
    private MyDependency myDependency;

    // ...
}

// Method Injection: Not recommended

class AutowireMethod {
    private MyDependency myDependency;

    //@Autowired
    public void setMyDependency(MyDependency myDependency) {
        this.myDependency = myDependency;
    }
}

// Constructor Injection: Recommended to use
@Component
class AutowireConstructor {
    private MyDependency myDependency;

    @Autowired
    public AutowireConstructor(MyDependency myDependency) {
        this.myDependency = myDependency;
    }
}
