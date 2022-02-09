package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configurtion file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call method on bean
        System.out.println(theCoach.getDailyWorkout());

        // close the contex
        context.close();

    }

}
