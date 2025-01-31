package com.customerRegistration.aplication.client.service;

import com.customerRegistration.aplication.client.api.CustomerRequest;
import com.customerRegistration.aplication.client.api.CustomerResponse;

public interface CustomerService {


    CustomerResponse creat(CustomerRequest newCostumeRequest);
}
