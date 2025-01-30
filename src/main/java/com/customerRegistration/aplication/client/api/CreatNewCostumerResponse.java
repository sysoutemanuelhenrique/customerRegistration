package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import lombok.Value;

import java.util.UUID;

@Value
public class CreatNewCostumerResponse {

    private  UUID idCustomer;
    private  String email;




}
