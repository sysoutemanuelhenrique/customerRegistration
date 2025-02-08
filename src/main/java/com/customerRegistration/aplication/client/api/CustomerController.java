package com.customerRegistration.aplication.client.api;


import com.customerRegistration.aplication.client.domain.Customer;
import com.customerRegistration.aplication.client.service.CustomerService;
import lombok.Getter;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Getter
@RequiredArgsConstructor
@Log4j2
public class CustomerController implements CustomerApi {

     private final CustomerService applicationService;




    @Override

    public CustomerResponse createdNewCostumerResponse(CustomerRequest newCostumeRequest) {
      log.info("[Star] - CustomerController - creatNewCostumerResponse");
        CustomerResponse newCustomer = applicationService.creat(newCostumeRequest);
      log.info("[Finish] - CustomerController - creatNewCostumerResponse");
        return newCustomer;
    }

    @Override
    public List<CustomerDetailResponse> getAllCustomers() {
        log.info("[Star] - CustomerController - createdNewCostumerResponse");
        List<Customer> getAllCustomers = applicationService.getAllCustomers();
        log.info("[Finish] - CustomerController - createdNewCostumerResponse");
        return CustomerDetailResponse.parseToList(getAllCustomers);
    }

    @Override
    public void deleteByIdCustomer(UUID idCustomer) {
        log.info("[Star] - CustomerController - deleteByIdCustomer");
        log.info("{idCustomer}{}", idCustomer);
        applicationService.deleteCustomerById(idCustomer);
        log.info("[Finish] - CustomerController - deleteByIdCustomer");


    }

    @Override
    public CustomerDetailResponse findCustomerById(UUID idCustomer) {
        log.info("[Star] - CustomerController - findCustomerById");
        CustomerDetailResponse customerById = applicationService.findByIdCustomer(idCustomer);
        log.info("[Finish] - CustomerController - findCustomerById");
        return customerById;

    }


}
