package com.paymentgateway.payment.repository;

import com.paymentgateway.payment.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;


public interface CustomerRepository extends CrudRepository<Customer, UUID> {

   @Query(
           value = "select customerId,name,phoneNumber from customer where phoneNumber = :phoneNumber",
           nativeQuery = true
   )

    Optional<Customer> selectCustomerByPhoneNumber(
            @Param("phoneNumber") String phoneNumber
   );
}
