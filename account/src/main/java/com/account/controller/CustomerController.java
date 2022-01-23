package com.account.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Customer;
import com.account.service.CustomerService;

@RestController
@RequestMapping("api/account/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	private List<Customer> getAllCustomers(){
		return customerService.listCustomers();
	}
	
	@PostMapping
	private Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
}
