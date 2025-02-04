package com.customerRegistration.aplication.client.domain;


import com.customerRegistration.aplication.client.api.CustomerRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Builder
@Document( collection = "Customer")
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique = true, nullable = false)
    @NotBlank
    private UUID idCustomer;

    @Valid
    private FullName name;
    @CPF
    @NotBlank
    private String cpf;
    @Enumerated (EnumType.STRING)
    private Gender gender;
    @NotBlank
    private List <Address> address;
    @Enumerated (EnumType.STRING)
    private TypeCustomer typeCustomer;
    @NotBlank
    @Email
    private  String email;
    private LocalDate DateRegistration;


    public Customer(CustomerRequest newCostumeRequest) {

        this.cpf = newCostumeRequest.getCpf();
        this.gender = newCostumeRequest.getGender();
        this.address = new ArrayList<>();
        this.email = newCostumeRequest.getEmail();

    }
}
