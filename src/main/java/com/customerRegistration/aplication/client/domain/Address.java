package com.customerRegistration.aplication.client.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Builder
@Setter
@ToString
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(updatable = false, unique = true, nullable = false)
        private UUID IdAddress;
        @Enumerated(EnumType.STRING)
        private TypeAddress typeAdress;
        @NotBlank
        private String street;
        @NotBlank
        private Integer number;
        @NotBlank
        private String city;
        @NotBlank
        private String state;



        @ManyToOne
        @JoinColumn(name = "customer_id", nullable = false)
        private Customer idCustomer;

        public Address(UUID idAddress, TypeAddress typeAdress, String street, Integer number, String city, String state, Customer idCustomer) {
                IdAddress = idAddress;
                this.typeAdress = typeAdress;
                this.street = street;
                this.number = number;
                this.city = city;
                this.state = state;
                this.idCustomer = idCustomer;
        }

}
