package com.paymentgateway.payment.service;

import com.paymentgateway.payment.customer.Customer;
import com.paymentgateway.payment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(Customer customerRequest) throws IllegalAccessException {

        String phoneNumber = customerRequest.getPhoneNumber();
        Optional<Customer> optionalCustomer = customerRepository.selectCustomerByPhoneNumber(phoneNumber);

        if(optionalCustomer.isPresent()){
            Customer customer= optionalCustomer.get();
            if(customer.getName().equals(customerRequest.getName())){
                return;
            }

            throw  new IllegalAccessException(String.format("phone number [%s] is taken",phoneNumber ));
        }
        customerRepository.save(customerRequest);

    }
}
