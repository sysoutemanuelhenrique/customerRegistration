package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import lombok.Value;

import java.util.UUID;

@Value
public class CustomerResponse {

    private  UUID idCustomer;
    private  String email;


    public CustomerResponse(Customer customerRegistration) {

        this.idCustomer = customerRegistration.getIdCustomer();
        this.email =  customerRegistration.getEmail();
    }
}
