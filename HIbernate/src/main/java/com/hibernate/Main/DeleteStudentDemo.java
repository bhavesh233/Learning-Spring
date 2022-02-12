package com.hibernate.Main;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


        try {

            int studentId = 22;
            // start transaction
            session.beginTransaction();

//            Student myStudent = session.get(Student.class,studentId);

            // delete StudentId data
//            session.delete(myStudent);

            session.createQuery("delete from Student where id=22").executeUpdate();

            // commit
            session.getTransaction().commit();


        }catch (Exception e)
        {

        }





    }

}
