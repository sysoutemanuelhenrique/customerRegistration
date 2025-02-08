package com.customerRegistration.aplication.client.infra;

import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.repository.CostumerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class CostumerMongoRepositoryIml implements CostumerRepository {

    private final CustomerMongoSpringRepsitory customerMongoSpringRepsitory;

    @Override
    public Customer save(Customer customer) {
        log.info("[Start] CustomerInfraRepository - saveNewCustomerRegistration");
        Customer customerCreated =  customerMongoSpringRepsitory.save(customer);
        log.info("[Finish] CustomerInfraRepository - saveNewCustomerRegistration");
        return customerCreated;
    }

    @Override
    public List<Customer> findAllCustomers() {
        log.info("[Start] CustomerInfraRepository - findAllCustomers");
        List<Customer>  customerList =  customerMongoSpringRepsitory.findAll();
        log.info("[Finish] CustomerInfraRepository - findAllCustomers");
        return  customerList;
    }

    @Override
    public void deleteByIdCostumer(UUID idCustomer) {
        log.info("[Start] CustomerInfraRepository - deletedByIdCostumer");
        customerMongoSpringRepsitory.deleteById(idCustomer);
        log.info("[Finish] CustomerInfraRepository - deletedByIdCostumer");
    }

    @Override
    public Customer findByIdCustomer(UUID idCustomer) {
        log.info("[Start] CustomerInfraRepository - findByIdCustomer");
        var customer = customerMongoSpringRepsitory.findById(idCustomer).orElseThrow();
        log.info("[Finish] CustomerInfraRepository - findByIdCustomer");
        return customer;
    }
}
