package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getCutomers(){

        return customerService.getCustomers();

    }


    @RequestMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){


        Customer theCustomer = customerService.getCustomer(customerId);

        if(theCustomer == null){

            throw new CustomerNotFoundException("Customer is not found "+customerId);

        }

        return  theCustomer;

    }


    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){

//        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;

    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        return theCustomer;

    }



    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){

        Customer theCustomer = customerService.getCustomer(customerId);


        if(theCustomer == null){

            throw new CustomerNotFoundException("Customer is not found "+customerId);

        }

        customerService.deleteCustomer(customerId);

        return "Deleted id is "+customerId;


    }



}
