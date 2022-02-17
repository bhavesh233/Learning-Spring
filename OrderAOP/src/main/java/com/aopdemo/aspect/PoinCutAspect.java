package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PoinCutAspect {

    @Pointcut("execution (* com.aopdemo.dao.*.*(..) )")
    public void forDaoPackage() {}

    @Pointcut("execution (* com.aopdemo.dao.*.set*(..) )")
    public void forsetPackage() {}

    @Pointcut("execution (* com.aopdemo.dao.*.get*(..) )")
    public void forgetPackage() {}

    @Pointcut("(forDaoPackage() && !(forsetPackage() || forgetPackage()) )")
    public void forDaoPackageNoGetterSetter() {}


}
