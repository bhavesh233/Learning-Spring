package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCycle {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanCycle.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();


    }

}
