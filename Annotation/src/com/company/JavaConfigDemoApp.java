package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring from java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("swimCoach", Coach.class);

        // call methods
        System.out.println(coach.getDailyWork());
        System.out.println(coach.getDailyFortune());

        // close the contex
        context.close();

    }

}



