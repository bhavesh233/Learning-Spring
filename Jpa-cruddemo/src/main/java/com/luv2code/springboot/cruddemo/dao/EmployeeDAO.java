package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getfindAll();

    public Employee findById(int employeeId);

    public void save(Employee employee);

    public void deleteById(int employeeId);



}
