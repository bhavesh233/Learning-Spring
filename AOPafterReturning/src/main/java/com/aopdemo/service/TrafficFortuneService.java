package com.aopdemo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {

    public String getFortune(){

        try{
            System.out.println("called getFortune in TrafficFortuneService Class");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Sleep time finished in TrafficFortuneService");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello");
        return  "Except Heavy Traffic this morning";

    }


}
