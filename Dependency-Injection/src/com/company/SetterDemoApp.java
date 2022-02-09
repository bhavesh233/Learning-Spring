package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {


        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex.xml");

        //retrieve bean from spring  container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //use methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());






        //close the contex
        context.close();

    }

}
