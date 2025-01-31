package com.customerRegistration.aplication.client.infra;

import com.customerRegistration.aplication.client.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CustomerMongoSpringRepsitory extends MongoRepository <Customer, UUID> {
}
