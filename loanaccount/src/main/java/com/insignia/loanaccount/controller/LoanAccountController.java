package com.insignia.loanaccount.controller;

import com.insignia.loanaccount.model.LoanAccount;
import com.insignia.loanaccount.repository.LoanAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-account")
public class LoanAccountController {

    @Autowired
    private LoanAccountRepository loanAccountRepository;

    @PostMapping("/apply")
    public void loanApplication(@RequestBody final LoanAccount loanAccount){
        loanAccountRepository.save(loanAccount);
    }

    @GetMapping("/view")
    public Iterable<LoanAccount> seeAccount(){
        return loanAccountRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void removeAccount(@PathVariable Long id){
        loanAccountRepository.deleteById(id);
    }
}
