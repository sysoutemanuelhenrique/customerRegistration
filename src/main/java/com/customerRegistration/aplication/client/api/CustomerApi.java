package com.customerRegistration.aplication.client.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/v1/CustomerApi")
public interface CustomerApi {

    @PostMapping
    @ResponseStatus (code = HttpStatus.CREATED)
    CreatNewCostumerResponse creatNewCostumerResponse(@RequestBody @Valid CreatNewCostumeRequest newCostumeRequest);

}
