package com.aopdemo;

import com.aopdemo.dao.AccountDao;
import com.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);

        Account account = new Account();
//        account.setName("ABc");
//        account.setServiceCode("midium");
//        accountDao.getName();
//        accountDao.getServiceCode();


        accountDao.addAccount(account,true);
        accountDao.secondMethod();
        System.out.println(" let's call it again");

        MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
        membershipDAO.addSillyMethod();
        membershipDAO.secondMethod();
        System.out.println("Finished Main method");

        context.close();

    }

}
