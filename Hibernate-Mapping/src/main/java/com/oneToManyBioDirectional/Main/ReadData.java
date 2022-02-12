package com.oneToManyBioDirectional.Main;

import com.oneToManyBioDirectional.entity.Course;
import com.oneToManyBioDirectional.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            int Id=5;

            Instructor instructor= session.get(Instructor.class,Id);

            System.out.println("Details "+instructor);
            System.out.println("Course Details "+instructor.getCourses());

            session.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

}
