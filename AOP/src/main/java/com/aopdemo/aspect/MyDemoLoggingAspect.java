package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
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


    @Pointcut("execution (* com.aopdemo.dao.*.*(..) )")
    public void forDaoPackage() {}


    @Pointcut("execution (* com.aopdemo.dao.*.set*(..) )")
    public void forsetPackage() {}

    @Pointcut("execution (* com.aopdemo.dao.*.get*(..) )")
    public void forgetPackage() {}

    @Pointcut("(forDaoPackage() && !(forsetPackage() || forgetPackage()) )")
    public void forDaoPackageNoGetterSetter() {}


    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAccountAdvice(){
        System.out.println("@before called AddAccount Aspect");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void secondBeforeMethod(){
        System.out.println("@before method called Second time in Aspect");
    }


}
