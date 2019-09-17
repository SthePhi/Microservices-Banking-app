package com.insignia.depositaccount.Controller;

import com.insignia.depositaccount.Model.DepositAccount;
import com.insignia.depositaccount.Repository.DepositAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepositAccountController
{
    @Autowired
    private DepositAccountRepository depositAccountRepository;

    @GetMapping("/customers")
    public List<DepositAccount> getCustomer()
    {
        return depositAccountRepository.findAll();
    }

    @GetMapping("/customer/{customerID}")
    public DepositAccount getCustomer(@PathVariable Long customerID)
    {
        return depositAccountRepository.findById(Long customerID);
    }

    @DeleteMapping("/customer/{customerID}")
    public boolean deleteCustomer(@PathVariable Long customerID)
    {
        depositAccountRepository.delete(customerID);
        return true;
    }

    @PostMapping("/customer")
    public Customer createCustomer(Customer customer)
    {
        return depositAccountRepository.save(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(Customer customer)
    {
        return depositAccountRepository.save(customer);
    }
}
