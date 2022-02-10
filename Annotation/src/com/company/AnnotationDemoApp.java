package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex.xml");

        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);

        // call methods
        System.out.println(coach.getDailyWork());
        System.out.println(coach.getDailyFortune());

        // close the contex
        context.close();

    }

}
