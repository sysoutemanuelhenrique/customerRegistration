package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.domain.FullName;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class CustomerFindAllResponse {


    private UUID idCustomer;
    private FullName name;
    private String cpf;
    private  String email;


    public static List<CustomerFindAllResponse> parseToList(List<Customer> getAllCustomers) {
    return getAllCustomers.stream()
            .map(CustomerFindAllResponse::new)
            .collect((Collectors.toList()));

    }

    public CustomerFindAllResponse(Customer customer) {
        this.idCustomer = customer.getIdCustomer();
        this.name = customer.getName();
        this.cpf = customer.getCpf();
        this.email = customer.getEmail();
    }
    }
