package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.FullName;
import com.customerRegistration.aplication.client.domain.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Value
public class CustomerRequest {



    private FullName name;
    private String cpf;
    private Gender gender;
    private  String email;
    private LocalDate DateRegistration;

}
