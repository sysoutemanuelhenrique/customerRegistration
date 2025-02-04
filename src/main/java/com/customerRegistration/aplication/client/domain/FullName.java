package com.customerRegistration.aplication.client.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Builder
public class FullName {
    @NotBlank(message = "First Name cant not be blank")
    private String firstName;
    @NotBlank(message = "Last Name cant not be blank")
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
