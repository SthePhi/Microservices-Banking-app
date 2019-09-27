package com.insignia.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "account", catalog = "banking_app_db")
public class AccountModel
{
    @Id
    @GeneratedValue
    private Long accountNumber;
    private String accountType;
    private Long customerID;
    private Double balance;
    private Double interestRate;
    private Date openDate;
    private Long interestID;
    private Double interestAmount;


    /*Constructors Starts here*/
    public AccountModel() {
    }

    public AccountModel(String accountType, Long customerID, Double balance, Double interestRate, Date openDate, Long interestID, Double interestAmount) {
        this.accountType = accountType;
        this.customerID = customerID;
        this.balance = balance;
        this.interestRate = interestRate;
        this.openDate = openDate;
        this.interestID = interestID;
        this.interestAmount = interestAmount;
    }
    /*Constructors End here*/

    /*Getters and Setters Starts here*/
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Long getInterestID() {
        return interestID;
    }

    public void setInterestID(Long interestID) {
        this.interestID = interestID;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }
    /*Getters and Setters End here*/
}
