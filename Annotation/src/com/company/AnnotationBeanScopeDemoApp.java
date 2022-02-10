package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load the bean config file
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContex.xml");

        // retrieve bean from the spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class);

        // check if they are same
        boolean result = (theCoach == theAlphaCoach);

        System.out.println("Result is "+result);
        System.out.println("Memory Location for theCoach : "+theCoach);
        System.out.println("Memory Location for theAlphaCoach : "+theAlphaCoach);

        // close the context
        context.close();

    }

}
