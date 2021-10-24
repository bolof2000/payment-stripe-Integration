package com.paymentgateway.payment.repository;

import com.paymentgateway.payment.customer.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {
    

    @Autowired
    private CustomerRepository underTest;

    @Test
    void itShouldSelectCustomerByPhoneNumber() {
        //Given
        //When
        //Then
    }

    @Test
   public void itShouldSaveCustomer() {
        //Given
        UUID id = UUID.randomUUID();
        Customer customer = new Customer(id,"Bolofinde","8322452388");
        //When
        underTest.save(customer);

        //Then
        Optional<Customer> optionalCustomer = underTest.findById(id);
        assertThat(optionalCustomer).isPresent()
                .hasValueSatisfying(c->{
                    assertThat(c.getCustomerId()).isEqualTo(id);
                    assertThat(c.getName()).isEqualTo("Bolofinde");
                    assertThat(c.getPhoneNumber()).isEqualTo("8322452388");
                });



    }
}