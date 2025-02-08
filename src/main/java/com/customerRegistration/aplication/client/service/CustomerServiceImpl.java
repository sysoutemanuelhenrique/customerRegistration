package com.customerRegistration.aplication.client.service;

import com.customerRegistration.aplication.client.api.CustomerDetailResponse;
import com.customerRegistration.aplication.client.api.CustomerRequest;
import com.customerRegistration.aplication.client.api.CustomerResponse;
import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.repository.CostumerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CostumerRepository customerRepository;

    @Override
    public CustomerResponse creat(CustomerRequest customerRequest) {



        log.info("[Star] - CustomerRepository - createdCustomer");
        Customer newCustomer = customerRepository.save(new Customer(customerRequest));
        log.info("[Finish] - CustomerRepository - createdCustomer");
        return new CustomerResponse(newCustomer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        log.info("[Star] - CustomerRepository - findAll");
        List<Customer> listCustomers = customerRepository.findAllCustomers();
        log.info("[Finish] - CustomerRepository - findAll");
        return listCustomers;
    }

    @Override
    public void deleteCustomerById(UUID idCustomer) {
        log.info("[Star] - CustomerRepository - deleteCustomerById");
        log.info("[idCustomer] {}", idCustomer);
        Customer customer = customerRepository.findByIdCustomer(idCustomer);
        customerRepository.deleteByIdCostumer(customer.getIdCustomer());
        log.info("[Finish] - CustomerRepository - deleteCustomerById");

    }

    @Override
    public CustomerDetailResponse findByIdCustomer(UUID idCustomer) {
        log.info("[Star] - CustomerRepository - findByIdCustomer");
        log.info("[idCustomer] {}", idCustomer);
        Customer customer = customerRepository.findByIdCustomer(idCustomer);
        log.info("[Finish] - CustomerRepository - findByIdCustomer");
        return new CustomerDetailResponse(customer);
    }
}