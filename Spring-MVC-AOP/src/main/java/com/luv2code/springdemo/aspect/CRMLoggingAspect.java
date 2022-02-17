package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private Logger myLogger = Logger.getLogger(CRMLoggingAspect.class.getName());

    @Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
    private void  forControllerPackage(){}

    @Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
    private void  forServicePackage(){}

    @Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
    private void  forDaoPackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage() ")
    private void forAppFlow(){}

    @Before("forAppFlow()")
    public  void before(JoinPoint joinPoint){

        String method = joinPoint.getSignature().toShortString();
        myLogger.info("====> @before: calling Method "+method);


        Object[] myarg = joinPoint.getArgs();

        for(Object arg: myarg){
            myLogger.info("======> argument:-> "+arg);

        }

    }

    @AfterReturning(pointcut = "forAppFlow()",returning = "result")
    public void afterreturning(JoinPoint joinPoint,Object result){


        String method = joinPoint.getSignature().toShortString();
        myLogger.info("====> @afterRetunning: calling Method "+method);


        myLogger.info("=====> Results "+result);

    }


}
