package com.atquil.springconcepts.aop.config;


import com.atquil.springconcepts.aop.pojo.AOPPojo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
class AOPAspect {


    @Before("execution(* com.atquil.springconcepts.aop.controller.AOPController.getDetails(..))")
    public void beforePointCutMethod(JoinPoint joinPoint){
        System.out.println("-------------- AOP--------------");
        System.out.println("@Before :"+joinPoint.getSignature());
    }

    @After("execution(* com.atquil.springconcepts.aop.controller.AOPController.*(..))")
    public void afterPointCutMethod(JoinPoint joinPoint){
        System.out.println("@After Always :"+joinPoint);
        System.out.println("-------------- End--------------");
    }

    //Let's create a Service for the same.
    @AfterReturning(pointcut = "execution(* com.atquil.springconcepts.aop.service.AOPService.normalExecution(..))", returning = "result")
    public void afterReturningPointCutMethod(JoinPoint joinPoint,AOPPojo result){
        System.out.println("@AfterReturning :"+joinPoint+"The output is :"+result.getExecutionType());

    }

    @AfterThrowing(pointcut = "execution(* com.atquil.springconcepts.aop.service.AOPService.throwException(..))",throwing = "ex")
    public void afterThrowingPointCutMethod(JoinPoint joinPoint,Exception ex){
        System.out.println("@AfterThrowing :"+joinPoint+" Exception is:"+ex);

    }

    // We can also define Pointcut as like this
    @Pointcut("execution(* com.atquil.springconcepts.aop.service.AOPService.*(..))")
    public void myNormalExecutionLocation(){}

    @Before("myNormalExecutionLocation()")
    public void beforeAnyMethod(){
        System.out.println("Before any method in AOPService");
    }


}


