package com.insignia.transaction.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction", catalog = "banking_app_db")
public class TransactionModel
{
    private Long transactionID;
    private String accountNumber;
    private String TransactionType;
    private Long amount;
    private Long totalBalance;
    private Date dateOfTransaction;

}
