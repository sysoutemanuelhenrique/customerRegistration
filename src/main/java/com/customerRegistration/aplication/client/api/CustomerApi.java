package com.customerRegistration.aplication.client.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//Implements; Created, Getters
//now: Deleted byId
@RestController
@RequestMapping (value = "/v1/CustomerApi")
public interface CustomerApi {

    @PostMapping
    @ResponseStatus (code = HttpStatus.CREATED)
    CustomerResponse createdNewCostumerResponse(@RequestBody @Valid CustomerRequest newCostumeRequest);

    @GetMapping ("/listAll")
    @ResponseStatus (code = HttpStatus.OK)
    public List<CustomerFindAllResponse> getAllCustomers();

    @DeleteMapping("/DeleteById")
    @ResponseStatus (code = HttpStatus.OK)
    void deleteByIdCustomer(@RequestBody @PathVariable UUID idCustomer);


}

