package com.luv2code.springdemo.service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public List<Customer> getCustomers() {

        return customerDAO.getCustomers();

    }

    @Transactional
    public void saveCustomer(Customer theCustomer) {

        customerDAO.saveCustomer(theCustomer);
    }

    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Transactional
    public void deleteCustomer(int theId) {
         customerDAO.deleteCustomer(theId);

    }
}
