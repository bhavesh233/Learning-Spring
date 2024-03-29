package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier("employeeDAOJpaImpl")
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.getfindAll();
    }

    @Override
    @Transactional
    public Employee findById(int employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
            employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int employeeId) {
        employeeDAO.deleteById(employeeId);
    }
}
