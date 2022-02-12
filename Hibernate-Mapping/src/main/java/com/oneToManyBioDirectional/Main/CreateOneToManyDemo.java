package com.oneToManyBioDirectional.Main;


import com.oneToManyBioDirectional.entity.Course;
import com.oneToManyBioDirectional.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateOneToManyDemo {


    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            int theId=5;

            Instructor tempInstructor = session.get(Instructor.class,theId);


            Course tempCourse = new Course("DBMS");
            Course tempCourse1 = new Course("DS");
            Course tempCourse2 = new Course("WEB PROGRAMMING");

            tempInstructor.add(tempCourse);
            tempInstructor.add(tempCourse1);
            tempInstructor.add(tempCourse2);

            session.save(tempCourse);
            session.save(tempCourse1);
            session.save(tempCourse2);

            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e);
        }finally {
            session.close();
            sessionFactory.close();
        }
    }


}
