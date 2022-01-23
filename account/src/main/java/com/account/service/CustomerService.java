package com.account.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.account.model.Customer;
import com.account.repository.CustomerRepository;

@Service
public class CustomerService {
private final CustomerRepository customerRepo;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepo) {
		this.customerRepo=customerRepo;
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Optional<Customer> fetchCustomerById(Long id){
		return customerRepo.findById(id);
	}
	
	public List<Customer> listCustomers(){
		return customerRepo.findAll();
	}
}
