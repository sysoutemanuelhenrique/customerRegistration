package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Address;
import com.customerRegistration.aplication.client.domain.FullName;
import com.customerRegistration.aplication.client.domain.Gender;
import com.customerRegistration.aplication.client.domain.TypeCustomer;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
public class CreatNewCostumeRequest {


    @NotBlank
    private FullName name;
    @CPF
    @NotBlank
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotBlank
    @Email
    private  String email;
    private LocalDate DateRegistration;

}
