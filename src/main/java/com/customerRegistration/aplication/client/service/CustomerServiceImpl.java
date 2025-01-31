package com.customerRegistration.aplication.client.service;

import com.customerRegistration.aplication.client.api.CustomerRequest;
import com.customerRegistration.aplication.client.api.CustomerResponse;
import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.repository.CostumerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CostumerRepository customerRepository;

    @Override
    public CustomerResponse creat(CustomerRequest customerRequest) {



        log.info("[Star] - CustomerRepository - creatCustomer");
        Customer newCustomer = customerRepository.save(new Customer(customerRequest));
        log.info("[Finish] - CustomerRepository - creatCustomer");
        return new CustomerResponse(newCustomer);
    }
}