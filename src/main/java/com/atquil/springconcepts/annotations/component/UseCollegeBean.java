package com.atquil.springconcepts.annotations.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCollegeBean {

    @Autowired
    private ComponentAnnotation componentAnnotation;

}
