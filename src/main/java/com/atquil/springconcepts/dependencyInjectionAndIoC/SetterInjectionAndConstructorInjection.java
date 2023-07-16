package com.atquil.springconcepts.dependencyInjectionAndIoC;

//IOC handles  dependency Injection using : Setter Injection or Constructor Injection
public class SetterInjectionAndConstructorInjection {

    private String collegeName;
}

class SetterInjection{
    private String collegeName;

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}

class ConstructorInjection{
    private String collegeName;

    public ConstructorInjection(String collegeName) {
        this.collegeName = collegeName;
    }
}