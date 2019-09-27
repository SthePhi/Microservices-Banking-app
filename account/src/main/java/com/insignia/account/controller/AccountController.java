package com.insignia.account.controller;

import com.insignia.account.model.AccountModel;
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

    @GetMapping("/accounts")
    public List<AccountModel> getAccount()
    {
        return accountRepository.findAll();
    }

    @GetMapping("/account/{accountNumber}")
    public Optional<AccountModel> getAccount(@PathVariable Long accountNumber)
    {
        return accountRepository.findById(accountNumber);
    }

    @DeleteMapping("/account/{accountNumber}")
    public void deleteAccount(@PathVariable Long accountNumber)
    {
        accountRepository.deleteById(accountNumber);
    }

    @PostMapping("/postAccount")
    public AccountModel createCustomer(AccountModel account)
    {
        return accountRepository.save(account);
    }

    @PutMapping("/putAccount")
    public AccountModel updateAccount(AccountModel account)
    {
        return accountRepository.save(account);
    }
}
