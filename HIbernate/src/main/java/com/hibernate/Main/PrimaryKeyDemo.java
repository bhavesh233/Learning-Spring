package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // create Session
        Session session = sessionFactory.getCurrentSession();

        try {
            // create student object
            System.out.println("Creating new Object......");
            Student newStudent1 = new Student("studen123", "Wal333l", "122313@gmail.com");
            Student newStudent2 = new Student("Student245", "Wal1231l", "P232312333@gmail.com");
            Student newStudent3 = new Student("Smi123t", "Adani123", "Paul12dsad123123as3@gmail.com");

            // start the transaction
            session.beginTransaction();

            // save the student object
            session.save(newStudent1);
            session.save(newStudent2);
            session.save(newStudent3);
            System.out.println("Saving the student......");

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done.....");

        } finally {
            sessionFactory.close();
        }



    }


}
