package com.customerRegistration.aplication.client.service;

import com.customerRegistration.aplication.client.api.CustomerDetailResponse;
import com.customerRegistration.aplication.client.api.CustomerRequest;
import com.customerRegistration.aplication.client.api.CustomerResponse;
import com.customerRegistration.aplication.client.domain.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {


    CustomerResponse creat(CustomerRequest newCostumeRequest);

    List<Customer> getAllCustomers();

    void deleteCustomerById(UUID idCustomer);

    CustomerDetailResponse findByIdCustomer(UUID idCustomer);



}
