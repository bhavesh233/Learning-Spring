package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getfindAll() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int employeeId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Employee employee = currentSession.get(Employee.class,employeeId);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        System.out.println(employee);
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
        System.out.println();
    }

    @Override
    public void deleteById(int employeeId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
        theQuery.setParameter("employeeId",employeeId);
        theQuery.executeUpdate();

    }
}
