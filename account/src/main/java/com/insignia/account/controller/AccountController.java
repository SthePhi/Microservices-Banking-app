package com.insignia.account.controller;

import com.insignia.account.model.Account;
import com.insignia.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController
{
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/customers")
    public List<Account> getCustomer()
    {
        return accountRepository.findAll();
    }

    @GetMapping("/customer/{customerID}")
    public Optional<Account> getCustomer(@PathVariable Long customerID)
    {
        return accountRepository.findById(customerID);
    }

    @DeleteMapping("/customer/{customerID}")
    public boolean deleteCustomer(@PathVariable Long customerID)
    {
        accountRepository.delete(customerID);
        return true;
    }

    @PostMapping("/customer")
    public Customer createCustomer(Customer customer)
    {
        return accountRepository.save(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(Customer customer)
    {
        return accountRepository.save(customer);
    }
}
