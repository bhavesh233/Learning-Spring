package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

//    public void addAccount(){
//        System.out.println(getClass()+" Membership Dao method Called ");
//    }

//    public void addSillyMethod(){
//        System.out.println(getClass()+" Membership Dao addSillyMethod method Called ");
//    }

    public boolean addSillyMethod(){
        System.out.println(getClass()+" Membership Dao addSillyMethod method Called ");
        return true;
    }
    public boolean secondMethod(){
        System.out.println("Second method of MemeberSip Dao");
        return true;
    }

}
