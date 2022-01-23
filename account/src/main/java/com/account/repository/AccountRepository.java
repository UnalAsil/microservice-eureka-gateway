package com.account.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
