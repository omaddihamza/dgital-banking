package org.sid.services;

import org.sid.dto.CustomerDTO;
import org.sid.entities.Customer;

public interface CustomerService {
    Customer createCustomer(CustomerDTO customerDTO);
    Customer getCustomerById(Long userId);
    Customer updateCustomer(Long customerId, CustomerDTO customerDTO);
    void deleteCustomerId(Long customerId);
}
