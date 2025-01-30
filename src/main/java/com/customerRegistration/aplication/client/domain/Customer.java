package com.customerRegistration.aplication.client.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Builder
@Document( collection = "Customer")
public class Customer {

    private UUID IdCustomer;
    private String cpf;
    private Gender gender;
    private Address address;
    private TypeCustomer typeCustomer;
    private  String email;


}
