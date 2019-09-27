package com.insignia.transaction.repository;

import com.insignia.transaction.model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, Long>
{

}
