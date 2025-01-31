package com.customerRegistration.aplication.client.api;


import com.customerRegistration.aplication.client.service.CustomerService;
import lombok.Getter;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@RequiredArgsConstructor
@Log4j2
public class CustomerController implements CustomerApi {

     private final CustomerService registerApplicationService;




    @Override

    public CustomerResponse creatNewCostumerResponse(CustomerRequest newCostumeRequest) {


      log.info("[Star] - CustomerController - creatNewCostumerResponse");
        CustomerResponse newCustomer = registerApplicationService.creat(newCostumeRequest);
      log.info("[Star] - CustomerController - creatNewCostumerResponse");
        return newCustomer;
    }

}
