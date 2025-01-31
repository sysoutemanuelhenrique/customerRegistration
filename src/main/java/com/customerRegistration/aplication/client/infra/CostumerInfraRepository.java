package com.customerRegistration.aplication.client.infra;

import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.repository.CostumerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CostumerInfraRepository implements CostumerRepository {
    @Override
    public Customer save(Customer customer) {
        return null;
    }
}
