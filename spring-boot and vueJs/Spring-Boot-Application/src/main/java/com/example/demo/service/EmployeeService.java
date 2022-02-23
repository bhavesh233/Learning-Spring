package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> findAll();

    public void save(Employee employee);

    public Employee updateEmployee(Employee employee);

    public Optional<Employee> findId(int employeeId);

    public void deleteById(int employeeId);

}
