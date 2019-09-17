package com.insignia.depositaccount.Repository;

import com.insignia.depositaccount.Model.DepositAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositAccountRepository extends JpaRepository<DepositAccount, Long>
{

}
