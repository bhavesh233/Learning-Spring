package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // create Session
        Session session = sessionFactory.getCurrentSession();

        try {

            // start the transaction
            session.beginTransaction();

            // query Student
            List<Student> theStudents = session.createQuery("from Student").getResultList();
            displayResult(theStudents);

            //  last Name Wall
            theStudents  = session.createQuery("from Student s where s.lastName='Wall' OR s.lastName='Adani123'").list();
            displayResult(theStudents);

            // query students where email like '%'
            theStudents = session.createQuery("from Student s where s.email LIKE 'Paul12ds%'").getResultList();
            displayResult(theStudents);


            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done.....");

        } finally {
            sessionFactory.close();
        }

    }

    public static void displayResult(List<Student> theStudents){
        for (Student s:theStudents){
            System.out.println(s);
        }

    }


}


