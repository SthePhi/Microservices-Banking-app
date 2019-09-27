package com.insignia.depositaccount.Repository;

import com.insignia.depositaccount.Model.DepositAccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositAccountRepository extends JpaRepository<DepositAccountModel, Long>
{

}
