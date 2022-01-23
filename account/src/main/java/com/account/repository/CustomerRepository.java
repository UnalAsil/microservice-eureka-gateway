package com.account.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.account.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
