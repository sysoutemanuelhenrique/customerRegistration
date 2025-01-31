package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import lombok.Value;

import java.util.UUID;

@Value
public class CustomerResponse {

    private  UUID idCustomer;
    private  String email;


    public CustomerResponse(Customer customerCreat) {

        this.idCustomer = customerCreat.getIdCustomer();
        this.email =  customerCreat.getEmail();
    }
}
