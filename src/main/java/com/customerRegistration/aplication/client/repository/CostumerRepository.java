package com.customerRegistration.aplication.client.repository;

import com.customerRegistration.aplication.client.api.CustomerRequest;
import com.customerRegistration.aplication.client.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface CostumerRepository {
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    void deleteByIdCostumer(UUID idCustomer);

}
