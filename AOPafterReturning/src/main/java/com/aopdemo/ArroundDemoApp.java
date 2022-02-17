package com.aopdemo;

import com.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class ArroundDemoApp {

    private static Logger myLogger = Logger.getLogger(ArroundDemoApp.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext
                 context  =new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService trafficFortuneService  = context.getBean("trafficFortuneService",TrafficFortuneService.class);


        myLogger.info("Main Program call getFortune");

        String data = trafficFortuneService.getFortune();

        myLogger.info("Main Program data "+data);
        myLogger.info(("Finished"));

        context.close();
    }

}
