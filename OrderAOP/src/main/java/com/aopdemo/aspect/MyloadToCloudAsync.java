package com.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyloadToCloudAsync {

    @Before("com.aopdemo.aspect.PoinCutAspect.forDaoPackageNoGetterSetter()")
    public void loadToCloudAsync(){
        System.out.println("@before method called loadToCloudAsync in Aspect");
    }
}
