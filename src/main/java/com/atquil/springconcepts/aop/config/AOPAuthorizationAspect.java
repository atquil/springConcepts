package com.atquil.springconcepts.aop.config;

import com.atquil.springconcepts.aop.pojo.AOPUserPojo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPAuthorizationAspect {

    @Pointcut("@within(com.atquil.springconcepts.aop.service.*)")
    public void applyAuthorization(){};

    @Around("applyAuthorization()")
    public Object applyAuthorizationOnUser(ProceedingJoinPoint joinPoint) throws Throwable {
        AOPUserPojo aopUserPojo = (AOPUserPojo) joinPoint.getArgs()[0];
        System.out.println("User is authenticated:");
        if(aopUserPojo.getUserType().equals("ADMIN")){
            return   joinPoint.proceed();
        }
        return null;
    }
}
