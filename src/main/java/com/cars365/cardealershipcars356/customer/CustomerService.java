package com.cars365.cardealershipcars356.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerByPhno = customerRepository.findCustomerByCustomerPhno(customer.getCustomerPhno());
        if(customerByPhno.isPresent()){
            throw new IllegalStateException("Phone number already exists.");
        }
        customerRepository.save(customer);
    }

    public Optional<Customer> loginCustomer(Customer customer) {
        Optional<Customer> customerExists = customerRepository.findCustomerByCustomerPhno(customer.getCustomerPhno());

        if (!customerExists.isPresent()) {
            throw new IllegalStateException("Invalid Phone Number");
        }

        String password = customer.getCustomerPassword();
        String actPassword = customerExists.get().getCustomerPassword();
        if (!password.equals(actPassword)) {
            throw new IllegalStateException("Invalid Phone number and password.");
        }
        return customerExists;
    }
}
