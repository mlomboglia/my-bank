package com.marcoslombog.mybank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcoslombog.mybank.exception.ResourceNotFoundException;
import com.marcoslombog.mybank.model.Account;
import com.marcoslombog.mybank.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/accounts/all")
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	@GetMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable(value = "id") Long accountId) {
		return accountRepository.findById(accountId)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", accountId));
	}
	
	@PostMapping("/accounts/new")
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
    }

	@PutMapping("/accounts/{id}")
	public Account updateAmount(@PathVariable(value = "id") Long accountId, @RequestParam("amount") double amount) {

		Account account = accountRepository.findById(accountId)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", accountId));

		account.setBalance(account.getBalance() + amount);
		Account updatedAccount = accountRepository.save(account);
		return updatedAccount;
	}
}
