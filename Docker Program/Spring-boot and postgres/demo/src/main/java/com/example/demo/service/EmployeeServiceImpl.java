package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int employeeId) {

        Optional<Employee> result=  employeeRepository.findById(employeeId);

        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }else {
            throw new RuntimeException("Did not find Id "+employeeId);
        }
        return employee;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int employeeId) {
        employeeRepository.deleteById(employeeId);

    }
}
