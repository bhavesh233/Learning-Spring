package com.aopdemo.dao;
import com.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {


    private String name;
    private String serviceCode;

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
