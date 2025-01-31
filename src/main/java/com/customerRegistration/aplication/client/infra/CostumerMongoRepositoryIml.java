package com.customerRegistration.aplication.client.infra;

import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.repository.CostumerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class CostumerMongoRepositoryIml implements CostumerRepository {

    private final CustomerMongoSpringRepsitory customerMongoSpringRepsitory;

    @Override
    public Customer save(Customer customer) {


        log.info("[Start] CustomerInfraRepository - saveNewCustomerRegistration");

        Customer customerCreated =  customerMongoSpringRepsitory.save(customer);

        log.info("[Start] CustomerInfraRepository - saveNewCustomerRegistration");

        return customerCreated;
    }
}
