package com.hibernate.Main;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        System.out.println("Start a session ");
        session.beginTransaction();

        // get the instructor by primary id

        int intId =2;

        Instructor deleteInstructor = session.get(Instructor.class,intId);
        System.out.println("Instructor  is "+deleteInstructor);

        // delete the Instructor
        if(deleteInstructor != null) {
            System.out.println("Deleting "+deleteInstructor);
            session.delete(deleteInstructor);
        }

        session.getTransaction().commit();
        System.out.println("Done........");

    }

}
