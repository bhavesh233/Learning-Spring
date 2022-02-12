package com.oneToOneBioDirectional.Main;
import com.oneToOneBioDirectional.entity.Instructor;
import com.oneToOneBioDirectional.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createInstructorDetailDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        int Id=1000;

        try {
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, Id);
            System.out.println("Details :- " + instructorDetail);

            System.out.println("the Associated instructor " + instructorDetail.getInstructor());
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            session.close();
            sessionFactory.close();
        }


    }

}
