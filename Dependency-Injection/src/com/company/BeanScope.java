package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

    public static void main(String[] args) {

        // load the spring configuration file
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach",Coach.class);

        Coach theCoach = context.getBean("myCoach",Coach.class);

        //check if they are same
        boolean result = (coach==theCoach);
        System.out.println(result);

        System.out.println("coach address "+coach);
        System.out.println("coach address "+theCoach);


        // close the context
        context.close();



    }

}
