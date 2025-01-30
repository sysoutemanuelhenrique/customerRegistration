package com.customerRegistration.aplication.client.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Builder
@Document( collection = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private UUID idCustomer;
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


    public Customer(UUID idCustomer, String cpf, Gender gender, List<Address> address, TypeCustomer typeCustomer, String email, LocalDate dateRegistration) {
       this.idCustomer = idCustomer;
        this.cpf = cpf;
        this.gender = gender;
        this.address = address;
        this.typeCustomer = typeCustomer;
        this.email = email;
        DateRegistration = dateRegistration = LocalDate.now();
    }

}
