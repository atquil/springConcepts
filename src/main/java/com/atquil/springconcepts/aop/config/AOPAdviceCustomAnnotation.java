package com.atquil.springconcepts.aop.config;

import com.atquil.springconcepts.aop.customAnnotation.CustomAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPAdviceCustomAnnotation {

    @Pointcut("@annotation(com.atquil.springconcepts.aop.customAnnotation.CustomAnnotation)")
    public void customAnnotation(){};

    @Around("customAnnotation()")
    public Object runThisAroundTheNewMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("------- Custom Annotation is working----");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println(("-----------End of custom Annotation ----"));
        return obj;
    }

}
