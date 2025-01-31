package com.customerRegistration.aplication.client.api;

import com.customerRegistration.aplication.client.domain.Customer;
import jakarta.validation.Valid;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/v1/CustomerApi")
public interface CustomerApi {

    @PostMapping
    @ResponseStatus (code = HttpStatus.CREATED)
    CustomerResponse creatNewCostumerResponse(@RequestBody @Valid CustomerRequest newCostumeRequest);

    @GetMapping ("/listAll")
    @ResponseStatus (code = HttpStatus.OK)
    public List<CustomerFindAllResponse> getAllCustomers();


}

