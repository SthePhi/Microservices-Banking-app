package com.insignia.transaction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction", catalog = "banking_app_db")
public class TransactionModel
{
    @Id
    @GeneratedValue
    private Long transactionID;
    private String accountNumber;
    private String transactionType;
    private Long amount;
    private Long totalBalance;
    private Date dateOfTransaction;

    public TransactionModel()
    {

    }

    public TransactionModel(String accountNumber, String transactionType, Long amount, Long totalBalance, Date dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.totalBalance = totalBalance;
        this.dateOfTransaction = dateOfTransaction;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Long totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
