package com.aopdemo.dao;

import com.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {

    private String name;
    private String serviceCode;

    public List<Account> findAccount(boolean vipFlage){
        List<Account> myAccount = new ArrayList<Account>();

        if(vipFlage){
            throw new RuntimeException("no soup for you");
        }

        Account account1 = new Account("John","Silver");
        Account account2 = new Account("Madhu","Sil");
        Account account3 = new Account("Zack","Patel");

        myAccount.add(account1);
        myAccount.add(account2);
        myAccount.add(account3);

        System.out.println("This is FindAccount Method in AccountDao");

        return  myAccount;
    }


    public String getName() {
        System.out.println("String getMethod() called");
        return name;

    }

    public void setName(String name) {
        System.out.println("String setMethod() called");
        this.name = name;

    }

    public String getServiceCode() {
        System.out.println("String getServiceMethod() called");

        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("String setServiceMethod() called");
        this.serviceCode = serviceCode;
    }

    public void addAccount(Account theAccount,boolean vipFlag){
        System.out.println(getClass()+" : It is AccountDao class ");
    }

    public boolean secondMethod(){
        System.out.println("Second method of AccountDao");
        return true;
    }


}
