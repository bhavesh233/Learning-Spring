package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateStudentDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

            try {
                int studentId=17;

                // start the transaction
                session.beginTransaction();

                // retrieve student based on the ID
                System.out.println(" Getting Student with Id "+studentId);

                Student myStudent = session.get(Student.class,studentId);

                System.out.println("Updating .........");
                myStudent.setFirstName("Scooby");

                System.out.println("get Complete "+myStudent);

                // commit the transaction
                session.getTransaction().commit();


                // update all email
                session = sessionFactory.getCurrentSession();
                session.beginTransaction();

                session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();

                session.getTransaction().commit();
                System.out.println("Done .....");

            }catch (Exception e){

            }




    }

}
