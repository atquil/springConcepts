package com.atquil.springconcepts.annotations.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCollegeBean {

    @Autowired
    private CollegeBean collegeBean;

}
