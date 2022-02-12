package com.oneToOneBioDirectional.Main;

import com.oneToOneBioDirectional.entity.Instructor;
import com.oneToOneBioDirectional.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            // delete Data one to one Bio directional mapping
            int id = 4;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);

            System.out.println("Deleted Id is " + instructorDetail);

            instructorDetail.getInstructor().setInstructorDetail(null);

            session.delete(instructorDetail);

            session.getTransaction().commit();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }


}
