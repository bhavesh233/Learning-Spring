package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring from java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container

        // Coach coach = context.getBean("swimCoach", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods
        System.out.println(swimCoach.getDailyWork());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmailAddress());
        System.out.println(swimCoach.getTeam());


        // close the contex
        context.close();

    }

}



