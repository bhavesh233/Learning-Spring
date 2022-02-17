package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyPerformanceApiAnalytics {

    @Before("com.aopdemo.aspect.PoinCutAspect.forDaoPackageNoGetterSetter()")
    public void PerformanceApiAnalytics(){
        System.out.println("@before method called PerformanceApiAnalytics in Aspect");
    }

}
