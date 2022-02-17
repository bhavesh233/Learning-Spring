package com.aopdemo.aspect;

import com.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyDemoLoggingAspect {

//    @Before("execution (public void com.aopdemo.dao.AccountDao.addAccount())")
//    @Before("execution (public void add*() )")

//    @Before("execution (* add*(com.aopdemo.Account,..) )")
//
//    @Before("execution (* com.aopdemo.dao.*.*(..) )")
//    public void beforeAccountAdvice(){
//        System.out.println("@before called AddAccount Aspect");
//    }


//    @Pointcut("execution (* com.aopdemo.dao.*.*(..) )")
//    public void forDaoPackage() {}
//
//    @Before("forDaoPackage()")
//    public void beforeAccountAdvice(){
//        System.out.println("@before called AddAccount Aspect");
//    }
//
//    @Before("forDaoPackage()")
//    public void secondBeforeMethod(){
//        System.out.println("@before method called Second time in Aspect");
//    }


    @Before("com.aopdemo.aspect.PoinCutAspect.forDaoPackageNoGetterSetter()")
    public void beforeAccountAdvice(JoinPoint joinPoint) {
        System.out.println("@before method called beforeAddAccount Aspect");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("MethodSignature : "+methodSignature);

        Object[] args = joinPoint.getArgs();

//        System.out.println(args);

        for(Object temp :args){
            if(temp instanceof Account){
                Account account = (Account) temp;
                System.out.println("Account name "+account.getName());
                System.out.println("Account ServiceCode "+account.getServiceCode());
            }
            System.out.println(temp);
        }



    }

}
