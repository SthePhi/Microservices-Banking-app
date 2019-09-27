package com.insignia.depositaccount.Controller;

import com.insignia.depositaccount.Model.DepositAccountModel;
import com.insignia.depositaccount.Repository.DepositAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DepositAccountController
{
    @Autowired
    private DepositAccountRepository depositAccountRepository;

    @GetMapping("/getAllDepositAccount")
    public List<DepositAccountModel> getDepositAccount()
    {
        return depositAccountRepository.findAll();
    }

    @GetMapping("/getEachDepositAccount/{depositAccountNumber}")
    public Optional<DepositAccountModel> getDepositAccount(@PathVariable Long depositAccountNumber)
    {
        return depositAccountRepository.findById(depositAccountNumber);
    }

    @DeleteMapping("/deleteDepositAccount/{depositAccountNumber}")
    public void deleteAccount(@PathVariable Long depositAccountNumber)
    {
        depositAccountRepository.deleteById(depositAccountNumber);
    }

    @PostMapping("/createDepositAccount")
    public DepositAccountModel createDepositAccount(DepositAccountModel depositAccount)
    {
        return depositAccountRepository.save(depositAccount);
    }

    @PutMapping("/updateDepositAccount")
    public DepositAccountModel updateDepositAccount(DepositAccountModel depositAccount)
    {
        return depositAccountRepository.save(depositAccount);
    }
}
