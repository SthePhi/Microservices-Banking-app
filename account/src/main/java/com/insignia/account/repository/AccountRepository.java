package com.insignia.account.repository;

import com.insignia.account.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountModel, Long>
{

}
