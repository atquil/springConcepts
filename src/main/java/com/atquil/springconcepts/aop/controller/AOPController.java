package com.atquil.springconcepts.aop.controller;


import com.atquil.springconcepts.aop.pojo.AOPPojo;
import com.atquil.springconcepts.aop.service.AOPService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AOPController {

    private final AOPService aopService;

    @GetMapping("/getDetails")
    public ResponseEntity<?> getDetails(){
        return ResponseEntity.ok("Data");
    }

    @GetMapping("/normalExecution")
    public ResponseEntity<?> getNormalExecution(){
        AOPPojo aopPojo = AOPPojo.builder().executionType("Normal Exception").build();
        return ResponseEntity.ok(aopService.normalExecution(aopPojo));
    }

    @GetMapping("/throwException")
    public ResponseEntity<?> getExceptionExecution() throws Exception {
        AOPPojo aopPojo = AOPPojo.builder().executionType("ThrowException").build();
        return ResponseEntity.ok(aopService.throwException(aopPojo));
    }

    @GetMapping("/customAnnotation")
    public ResponseEntity<?> getCustomAnnotation(){
        AOPPojo aopPojo = AOPPojo.builder().executionType("Custom Annotation ").build();
        return ResponseEntity.ok(aopService.useCustomAnnotation(aopPojo));
    }
}
