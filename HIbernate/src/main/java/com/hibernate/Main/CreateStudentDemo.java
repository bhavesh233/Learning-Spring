package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudentDemo {


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
            session.save(newStudent);
            System.out.println("Saving the student......");

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done.....");


        } finally {
            sessionFactory.close();
        }


    }
}
