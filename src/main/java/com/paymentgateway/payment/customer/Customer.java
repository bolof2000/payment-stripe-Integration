package com.paymentgateway.payment.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    private UUID customerId;

    @NotBlank
    private String name;

    @NotBlank
    private String phoneNumber;


}
