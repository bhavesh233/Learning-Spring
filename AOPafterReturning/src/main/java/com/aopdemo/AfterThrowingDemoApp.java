package com.aopdemo;

import com.aopdemo.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);

        List<Account> theAccount = null;


        try {
            theAccount = accountDao.findAccount(true);
        } catch (Exception e) {
            System.out.println("Main Program Execption "+e);
        }

        System.out.println("Main Program AfterThrowingApp");
        System.out.println("--------");

        System.out.println(theAccount);

        System.out.println("Finished Main method");
        context.close();

    }

}
