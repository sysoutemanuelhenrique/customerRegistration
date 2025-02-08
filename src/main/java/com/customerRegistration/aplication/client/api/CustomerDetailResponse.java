package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.domain.FullName;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class CustomerDetailResponse {


    private UUID idCustomer;
    private FullName name;
    private String cpf;
    private  String email;


    public static List<CustomerDetailResponse> parseToList(List<Customer> getAllCustomers) {
    return getAllCustomers.stream()
            .map(CustomerDetailResponse::new)
            .collect((Collectors.toList()));

    }

    public CustomerDetailResponse(Customer customer) {
        this.idCustomer = customer.getIdCustomer();
        this.name = customer.getName();
        this.cpf = customer.getCpf();
        this.email = customer.getEmail();
    }
    }
