package com.aopdemo.aspect;

import com.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Order(3)
public class MyDemoLoggingAspect {


    @Around("execution(* com.aopdemo.service.TrafficFortuneService.getFortune(..))")
    public Object arroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String method = proceedingJoinPoint.toShortString();
        System.out.println("=======>  Executing @Around Method " + method);

        long begin = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();

        long duration = end - begin;

        System.out.println("Duration " + duration / 1000 + " Seconds ");

        return result;
    }

    @After("execution(* com.aopdemo.dao.AccountDao.findAccount(..))")
    public void afterFianllyMethod(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("=======>  Executing @After Finally Method " + methodSignature);

    }


    @AfterThrowing(pointcut = "execution(* com.aopdemo.dao.AccountDao.findAccount(..))", throwing = "Exec")
    public void afterThrowingFindAccountMethod(JoinPoint joinPoint, Throwable Exec) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("=======>  Executing @AfterThrowing Method " + methodSignature);

        System.out.println("=======>  Executing @AfterThrowing Method  Execption " + Exec);

    }


    @AfterReturning(pointcut = "execution (* com.aopdemo.dao.AccountDao.findAccount(..))", returning = "result")
    public void afterReturningFindAccountMethod(JoinPoint joinPoint, List<Account> result) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("=======>  Executing @AfterReturning Method " + methodSignature);

        System.out.println("=======>  Executing @AfterReturning Result" + result);

        for (Account account : result) {
            String theName = account.getName().toUpperCase();
            account.setName(theName);
        }
    }

    //
    @Before("com.aopdemo.aspect.PoinCutAspect.forDaoPackageNoGetterSetter()")
    public void beforeAccountAdvice(JoinPoint joinPoint) {
        System.out.println("@before method called beforeAddAccount Aspect");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("MethodSignature : " + methodSignature);

        Object[] args = joinPoint.getArgs();

//        System.out.println(args);

        for (Object temp : args) {
            if (temp instanceof Account) {
                Account account = (Account) temp;
                System.out.println("Account name " + account.getName());
                System.out.println("Account ServiceCode " + account.getLevel());
            }
            System.out.println(temp);
        }
//
//
    }


}
