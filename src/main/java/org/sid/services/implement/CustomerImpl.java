package org.sid.services.implement;

import org.modelmapper.ModelMapper;
import org.sid.Exception.CustomerNotFoundException;
import org.sid.dto.CustomerDTO;
import org.sid.entities.Customer;
import org.sid.repository.CustomerRepository;
import org.sid.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Customer createCustomer(CustomerDTO customerDTO) {
      Customer customer = modelMapper.map(customerDTO, Customer.class);
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found with ID: " + customerId));
    }

    @Override
    public Customer updateCustomer(Long customerId, CustomerDTO customerDTO) {
        Customer existingCustomer = customerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found with ID: " + customerId));
        existingCustomer.setUsername(customerDTO.getUsername());
        existingCustomer.setPassword(customerDTO.getPassword());
        existingCustomer.setEmail(customerDTO.getEmail());
        existingCustomer.setFirst_name(customerDTO.getFirst_name());
        existingCustomer.setLast_name(customerDTO.getLast_name());
        existingCustomer.setDate_of_birth(customerDTO.getDate_of_birth());
        existingCustomer.setAddress(customerDTO.getAddress());
        existingCustomer.setPhone_number(customerDTO.getPhone_number());
        return customerRepository.save(existingCustomer);
    }

    @Override
    public void deleteCustomerId(Long customerId) {
      customerRepository.deleteById(customerId);
    }
}
