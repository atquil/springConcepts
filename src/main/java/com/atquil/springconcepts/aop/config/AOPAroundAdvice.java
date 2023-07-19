package com.atquil.springconcepts.aop.config;

import com.atquil.springconcepts.aop.pojo.AOPPojo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPAroundAdvice {

    //1. @Around will act as the barrier to execute the method
    //2. To execute the method we must say .proceed()
    //3. We must give the returnType that user is expecting insted of void
//    @Around( "execution(* com.atquil.springconcepts.aop.service.AOPService.normalExecution(..))")
//    public void afterReturningPointCutMethod(ProceedingJoinPoint proceedingJoinPoint){
//        try{
//            System.out.println("Inside the @Around");
//            proceedingJoinPoint.proceed(); // then only the method normal Execution will start.
//            //We can call proceed() n number of times  to call the method again and again.
//            proceedingJoinPoint.proceed();
//
//        }catch (Throwable e){
//            System.out.println("Exception handling");
//        }
//
//
//    }

    // Returning values

//    @Around( "execution(* com.atquil.springconcepts.aop.service.AOPService.normalExecution(..))")
//    public AOPPojo afterReturningPointCutMethod(ProceedingJoinPoint proceedingJoinPoint){
//        try{
//            System.out.println("Inside the @Around");
//            AOPPojo aopPojo1 = (AOPPojo)proceedingJoinPoint.proceed(); // then only the method normal Execution will start.
//            //We can call proceed() n number of times  to call the method again and again.
//            AOPPojo aopPojo2 = (AOPPojo)proceedingJoinPoint.proceed();
//        return aopPojo1;
//        }catch (Throwable e){
//            System.out.println("Exception handling");
//        }
//
//        return AOPPojo.builder().build();
//    }

//    //Intercept and change the values
//    @Around( "execution(* com.atquil.springconcepts.aop.service.AOPService.normalExecution(..))")
//    public AOPPojo afterReturningPointCutMethod(ProceedingJoinPoint proceedingJoinPoint){
//        try{
//            System.out.println("Intercept the values");
//            AOPPojo aopDummy = AOPPojo.builder().executionType("Intercept").build();
//
//            // Proceed takes Array of objects, so we need to send the Array of AOPPojo
//            AOPPojo[] aopPojos = new AOPPojo[1];
//            aopPojos[0] = aopDummy;
//
//            return (AOPPojo) proceedingJoinPoint.proceed(aopPojos);
//
//        }catch (Throwable e){
//            System.out.println("Exception handling");
//        }
//
//        return AOPPojo.builder().build();
//    }


    //AOP As an Object: read object using proceedignJoinPoint.getArgs()[0];
    @Around( "execution(* com.atquil.springconcepts.aop.service.AOPService.normalExecution(..))")
    public Object afterReturningPointCutMethod(ProceedingJoinPoint proceedingJoinPoint){
        try{
            //
            System.out.println("Inside the @Around: Object is: "+proceedingJoinPoint.getArgs()[0]);

            return proceedingJoinPoint.proceed();
        }catch (Throwable e){
            System.out.println("Exception handling");
        }

        return AOPPojo.builder().build();
    }
}
