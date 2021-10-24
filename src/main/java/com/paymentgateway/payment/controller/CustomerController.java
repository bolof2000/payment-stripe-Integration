package com.paymentgateway.payment.controller;

import com.paymentgateway.payment.customer.Customer;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @PutMapping("/")
    public void createCustomer(@Valid @RequestBody Customer customer){

    }
}
