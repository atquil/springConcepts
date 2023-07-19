package com.atquil.springconcepts.aop.service;

import com.atquil.springconcepts.aop.customAnnotation.CustomAnnotation;
import com.atquil.springconcepts.aop.pojo.AOPPojo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AOPService {

    public AOPPojo normalExecution(AOPPojo aopPojo){
        System.out.println("Execution type:"+aopPojo.getExecutionType());
        return aopPojo;
    }

    public String throwException(AOPPojo aopPojo) throws Exception{
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Exception thrown");
    }

    @CustomAnnotation
    public AOPPojo useCustomAnnotation(AOPPojo aopPojo){
        return aopPojo;
    }

}
