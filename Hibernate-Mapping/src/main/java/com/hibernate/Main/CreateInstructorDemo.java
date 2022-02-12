package com.hibernate.Main;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

    public static void main(String[] args) {

        // create a session Factory
        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Instructor.class).
                addAnnotatedClass(InstructorDetail.class).
                buildSessionFactory();

        // create Session
        Session session = sessionFactory.getCurrentSession();

        try {
            // create student object
            System.out.println("Creating new Object......");
//
//            Instructor instructor = new Instructor("Chard","Darby",
//                    "Chard@gmail.com" );
//            InstructorDetail instructorDetail = new InstructorDetail("www.google.com",
//                    "Cricket");
//
//            instructor.setInstructorDetail(instructorDetail);

            Instructor instructor = new Instructor("Aakash","Patel",
                    "akash@gmail.com" );
            InstructorDetail instructorDetail = new InstructorDetail("www.facebook.com",
                    "Tennis");

            instructor.setInstructorDetail(instructorDetail);


            // start the transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving instructor : "+instructor);

            session.save(instructor);
            System.out.println("Saving the student......");

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done.....");

        } finally {
            sessionFactory.close();
        }
    }
}
