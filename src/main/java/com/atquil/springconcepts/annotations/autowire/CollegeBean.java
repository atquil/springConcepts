package com.atquil.springconcepts.annotations.autowire;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class CollegeBean {

    private String collegeName;
    private StudentNames studentNames;

    public CollegeBean(String collegeName, StudentNames studentNames) {
        this.collegeName = collegeName;
        this.studentNames = studentNames;
    }


}

@Component // As when the CollegeBean is being instanced, then the object of Student is already created.
class StudentNames{}

@Configuration
class SetCollegeName{
    @Bean
    public String getCollegeName(){
        return "BEST COLLEGE";
    }
}