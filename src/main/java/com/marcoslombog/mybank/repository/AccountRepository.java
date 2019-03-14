package com.marcoslombog.mybank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcoslombog.mybank.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
