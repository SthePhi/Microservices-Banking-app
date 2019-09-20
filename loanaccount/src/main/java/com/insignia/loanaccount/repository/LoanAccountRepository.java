package com.insignia.loanaccount.repository;

import com.insignia.loanaccount.model.LoanAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAccountRepository extends CrudRepository<LoanAccount, Long> {
}
