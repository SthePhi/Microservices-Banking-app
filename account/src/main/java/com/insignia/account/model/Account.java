package com.insignia.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account
{
    //private String customer;
    private Integer accountNumber;
    private String accountType;
    @Id
    @GeneratedValue
    private Long customerID;
    private Long balance;
    private double interestRate;
    private String openDate;
    private Long interestID;
    private Long interestAmount;

    //Customer customerObject = new Customer();

    /*Getters and Setters Starts here*/
    public Integer getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public Long getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(Long customerID)
    {
        this.customerID = customerID;
    }

    public Long getBalance()
    {
        return balance;
    }

    public void setBalance(Long balance)
    {
        this.balance = balance;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public String getOpenDate()
    {
        return openDate;
    }

    public void setOpenDate(String openDate)
    {
        this.openDate = openDate;
    }

    public Long getInterestID()
    {
        return interestID;
    }

    public void setInterestID(Long interestID)
    {
        this.interestID = interestID;
    }

    public Long getInterestAmount()
    {
        return interestAmount;
    }

    public void setInterestAmount(Long interestAmount)
    {
        this.interestAmount = interestAmount;
    }
    /*Getters and Setters End here*/

    /*Constructors Starts here*/
    public Account(Integer accountNumber, String accountType, Long balance, double interestRate, String openDate, Long interestID, Long interestAmount)
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        this.openDate = openDate;
        this.interestID = interestID;
        this.interestAmount = interestAmount;
    }

    public Account()
    {

    }
    /*Constructors End here*/

}
