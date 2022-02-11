package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {
        // create a session Factory

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // create Session
        Session session = sessionFactory.getCurrentSession();

        try {
            // create student object
            System.out.println("Creating new Object......");
            Student newStudent = new Student("Smit", "Wall", "Paul123@gmail.com");

            // start the transaction
            session.beginTransaction();

            // save the student object

            System.out.println(newStudent);

            session.save(newStudent);
            System.out.println("Saving the student......");

            // commit transaction
            session.getTransaction().commit();


            // retrieve Data from Database

            // now get  a new Session and transaction
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the ID:Primary key

            System.out.println("Getting Student with ID.........");
            System.out.println("saved Student get Id " + newStudent.getId());
            Student myStudent = session.get(Student.class, newStudent.getId());
            System.out.println("Get Complete........"+myStudent);


            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done.....");


        } finally {
            sessionFactory.close();
        }


    }

}
